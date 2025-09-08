package leetcode.easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class P146_LRUCache {
}

class LRUCache {
    private final int capacity;

    private final Map<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        int value = this.cache.getOrDefault(key, -1);
        if (value != -1) {
            this.cache.put(key, value);
        }
        return value;
    }

    public void put(int key, int value) {
        // 如果缓存中已有 key，则更新 key 的值
        if (this.cache.get(key) != null) {
            this.cache.put(key, value);
            return;
        }

        // 如果没有 key，则添加新的 key-value（注意判断容量）
        if (this.cache.size() >= this.capacity) {
            this.cache.remove(this.cache.keySet().iterator().next());
        }
        this.cache.put(key, value);
    }
}