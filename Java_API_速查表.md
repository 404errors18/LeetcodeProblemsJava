# 目录

- [高频使用（必背）](#高频使用必背)
  - String / StringBuilder
  - Arrays（数组工具）
  - ArrayList（List）
  - HashMap
  - HashSet
  - PriorityQueue（堆）
  - Deque / ArrayDeque（替代 Stack/Queue）
- [中频使用（常考）](#中频使用常考)
  - Collections（工具类）
  - TreeMap / TreeSet（有序集合）
  - LinkedList
  - Character / Integer 转换方法
  - Math 系列
- [低频使用（了解即可）](#低频使用了解即可)
  - BigInteger / BigDecimal
  - Pattern / Matcher（正则）
  - Optional / Stream / Random
- [使用建议与刷题小贴士](#使用建议与刷题小贴士)

------

# 高频使用（必背）

> 这些在力扣里几乎“随处可见”，务必熟练：如何创建、常用方法、复杂度与注意事项都写清楚。

## java.lang

### 常用方法

| 方法                 | import                                 | 作用                                 | 入参                                                         | 出参 | 复杂度 | 注意事项                                                     |
| -------------------- | -------------------------------------- | ------------------------------------ | ------------------------------------------------------------ | ---- | ------ | ------------------------------------------------------------ |
| `System.arraycopy()` | 无需 import，`System` 属于 `java.lang` | 从源数组复制指定长度的元素到目标数组 | `src` 源数组, `srcPos` 起始位置, `dest` 目标数组, `destPos` 起始位置, `length` 复制长度 | void | O(n)   | 要求两个数组类型兼容，否则抛 `ArrayStoreException`；越界会抛 `IndexOutOfBoundsException` |

### 示例代码

```java
public class ArrayCopyDemo {
    public static void main(String[] args) {
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = new int[5];

        // 把 src[1..3] 复制到 dest[0..2]
        System.arraycopy(src, 1, dest, 0, 3);

        for (int n : dest) {
            System.out.print(n + " ");
        }
        // 输出: 2 3 4 0 0
    }
}
```



## String / StringBuilder

### 如何创建（多种方式 & 推荐）

- `String s = "abc";` — 推荐（使用字符串常量池，简洁高效，常用）。
- `String s = new String("abc");` — 不推荐（强制新建对象，通常多余）。
- `StringBuilder sb = new StringBuilder();` — 推荐（需要大量拼接/变更字符串时使用）。
- `StringBuilder sb = new StringBuilder(initialCapacity);` — 当预计长度较大时可预分配，避免频繁扩容。

### 常用方法（表格）

| 方法                           | import                     | 作用                                                       | 入参                                      | 出参                                      | 时间复杂度                   | 空间复杂度 | 注意事项                                                     |
| ------------------------------ | -------------------------- | ---------------------------------------------------------- | ----------------------------------------- | ----------------------------------------- | ---------------------------- | ---------- | ------------------------------------------------------------ |
| `s.charAt(i)`                  | —                          | 取字符                                                     | `int i`                                   | `char`                                    | O(1)                         | O(1)       | 越界抛 `StringIndexOutOfBoundsException`                     |
| `s.length()`                   | —                          | 字符串长度                                                 | —                                         | `int`                                     | O(1)                         | O(1)       | —                                                            |
| `s.substring(l,r)`             | —                          | 截子串 `[l,r)`                                             | `int l, int r`                            | `String`                                  | O(r-l)                       | O(r-l)     | 左闭右开，注意复制（会新建字符串）                           |
| `s.toCharArray()`              | —                          | 转 `char[]`                                                | —                                         | `char[]`                                  | O(n)                         | O(n)       | 双指针常用                                                   |
| `s.toLowerCase()`              | -                          | 将字符串中的所有字符转为小写（默认使用 JVM 的默认 Locale） | -                                         | `String`                                  | O(n)                         | O(n)       | 依赖默认 `Locale`，不同地区默认 Locale 可能导致结果差异（如土耳其语的 "I" 转换问题） |
| `s.toLowerCase(Locale locale)` | `import java.util.Locale;` | 将字符串中的所有字符转为小写，使用指定的 `Locale`          | Locale 对象                               | `String`                                  | O(n)                         | O(n)       | 推荐在国际化/跨地区环境中使用，避免因默认 `Locale` 不同导致的不一致结果 |
| `s.indexOf()`                  | -                          | 查找子串或字符在字符串中首次出现的位置                     | 字符/字符串，起始下标（可选）             | `int`<br />找到返回下标<br />找不到返回-1 | O(n·m)（n=原串长，m=子串长） |            | 若 str 为空串，返回 0                                        |
| `s.lastIndexOf()`              | -                          | 查找字串或字符最后一次出现的位置                           | 字符/字符串，起始下标（可选）（向前搜索） | `int`<br />找到返回下标<br />找不到返回-1 | O(n·m)（n=原串长，m=子串长） |            | 空串返回 length()                                            |
| `s.startsWith()`               | -                          | 判断字符串是否以指定前缀开头                               | 前缀子串, 偏移量（可选）                  | `boolean`                                 | O(m)（m=前缀长度）           |            | 区分大小写                                                   |
| `s.endsWith()`                 | -                          | 判断是否以 suffix 结尾                                     | 后缀子串                                  | `boolean`                                 | O(m)（m=后缀长度）           |            | 区分大小写                                                   |
| `sb.append(x)`                 | —                          | 追加                                                       | 任意 `x`                                  | `StringBuilder`                           | O(1) 均摊                    | O(1)       | 推荐代替 `+` 拼接                                            |
| `sb.reverse()`                 | —                          | 反转                                                       | —                                         | `StringBuilder`                           | O(n)                         | O(1)       | 原地反转                                                     |
| `sb.toString()`                | —                          | 转 `String`                                                | —                                         | `String`                                  | O(n)                         | O(n)       | 返回新字符串                                                 |

### 示例代码

```java
// String / StringBuilder 示例
String s = "leetcode";
char c = s.charAt(0);            // 'l'
int len = s.length();           // 8
String sub = s.substring(1, 4); // "eet"
char[] arr = s.toCharArray();   // ['l','e','e','t','c','o','d','e']

StringBuilder sb = new StringBuilder();
sb.append("hello").append(123);
sb.reverse();
String res = sb.toString();
System.out.println(res);
```

```java
// lastIndexOf 示例代码
public class LastIndexOfDemo {
    public static void main(String[] args) {
        String s = "leetcode";

        System.out.println(s.lastIndexOf('e'));      // 3
        System.out.println(s.lastIndexOf('e', 2));   // 1
        System.out.println(s.lastIndexOf("code"));   // 4
        System.out.println(s.lastIndexOf("leet"));   // 0
        System.out.println(s.lastIndexOf("java"));   // -1
    }
}
```

```java
// startsWith 示例代码
public class StartsWithDemo {
    public static void main(String[] args) {
        String s = "leetcode";

        System.out.println(s.startsWith("leet"));      // true
        System.out.println(s.startsWith("code"));      // false
        System.out.println(s.startsWith("code", 4));   // true
    }
}
```

```java
// endsWith 示例代码
public class EndsWithDemo {
    public static void main(String[] args) {
        String s = "leetcode";

        System.out.println(s.endsWith("code"));   // true
        System.out.println(s.endsWith("leet"));   // false
    }
}
```



### StringBuilder 讲解

#### 基本概念

`StringBuilder` 是 **可变字符串类**，位于 **`java.lang` 包**，不需要额外 `import`。

和 `String` 不同：

- **`String`** 是 **不可变** 的，每次修改（拼接、替换等）都会生成新对象。
- **`StringBuilder`** 是 **可变** 的，支持原地修改，效率更高。

#### 创建方法

| 写法                              | 示例                                           | 推荐度      | 说明                                             |
| --------------------------------- | ---------------------------------------------- | ----------- | ------------------------------------------------ |
| `new StringBuilder()`             | `StringBuilder sb = new StringBuilder();`      | ⭐⭐⭐⭐ ✅ 推荐 | 初始容量 16，适合未知长度的拼接场景              |
| `new StringBuilder(String str)`   | `StringBuilder sb = new StringBuilder("abc");` | ⭐⭐⭐         | 以已有字符串为初始值                             |
| `new StringBuilder(int capacity)` | `StringBuilder sb = new StringBuilder(100);`   | ⭐⭐          | 预分配容量，减少扩容开销，适合明确知道长度的情况 |

👉 **推荐写法：** `new StringBuilder()`，灵活简单，LeetCode 中大多数拼接场景适用。

#### 高频常用方法

| 方法                  | 作用                    | 入参        | 出参                 | 复杂度    | 注意事项         |
| --------------------- | ----------------------- | ----------- | -------------------- | --------- | ---------------- |
| `append(x)`           | 在末尾追加内容          | 任意类型    | `StringBuilder` 本身 | 均摊 O(1) | 最常用，代替 `+` |
| `insert(offset, x)`   | 在指定位置插入          | 位置 + 内容 | `StringBuilder` 本身 | O(n)      | 可能触发元素移动 |
| `delete(start, end)`  | 删除 `[start,end)` 范围 | int, int    | `StringBuilder` 本身 | O(n)      | 左闭右开         |
| `deleteCharAt(index)` | 删除单个字符            | int         | `StringBuilder` 本身 | O(n)      | 索引越界会异常   |
| `setCharAt(index, c)` | 修改指定位置字符        | int, char   | void                 | O(1)      | 直接替换         |
| `reverse()`           | 反转字符串              | -           | `StringBuilder` 本身 | O(n)      | 原地修改         |
| `length()`            | 获取长度                | -           | int                  | O(1)      | -                |
| `toString()`          | 转换为不可变 `String`   | -           | String               | O(n)      | 返回新对象       |

#### 低频方法

| 方法                    | 作用                                 |
| ----------------------- | ------------------------------------ |
| `capacity()`            | 当前容量（数组大小，不等于内容长度） |
| `ensureCapacity(int n)` | 确保容量至少为 n                     |
| `trimToSize()`          | 把容量缩减到内容长度，节省空间       |

#### 示例代码

```java
public class StringBuilderDemo {
    public static void main(String[] args) {
        // 创建
        StringBuilder sb = new StringBuilder();

        // 拼接
        sb.append("leet");
        sb.append("code");
        System.out.println(sb.toString()); // "leetcode"

        // 插入
        sb.insert(4, "-");
        System.out.println(sb.toString()); // "leet-code"

        // 删除
        sb.delete(4, 5);
        System.out.println(sb.toString()); // "leetcode"

        // 修改
        sb.setCharAt(0, 'L');
        System.out.println(sb.toString()); // "Leetcode"

        // 反转
        sb.reverse();
        System.out.println(sb.toString()); // "edocteeL"
    }
}
```

#### 适用场景

✅ 高频使用场景：

- 字符串拼接（尤其是循环中）
- 翻转字符串/回文检查
- 删除指定区间的字符
- 构造输出结果（如二叉树层序遍历拼接结果）

❌ 不适用场景：

- 需要频繁在中间插入/删除（建议用 `LinkedList`）。
- 字符串完全不可变的情况（直接用 `String` 更安全）。

------

## Arrays（数组工具）

### 如何创建（数组本身）

- 原生数组：`int[] arr = new int[5];` 或 `int[] arr = {3,1,2};` — 推荐（刷题首选）。
- 如果需要动态集合，改用 `ArrayList`（见下）。
- 调用工具方法使用 `Arrays`（`import java.util.Arrays;`）。

### 常用方法（表格）

| 方法                            | import             | 作用         | 入参       | 出参   | 时间复杂度 | 空间复杂度 | 注意事项                           |
| ------------------------------- | ------------------ | ------------ | ---------- | ------ | ---------- | ---------- | ---------------------------------- |
| `Arrays.sort(arr)`              | `java.util.Arrays` | 排序（原地） | 数组       | void   | O(n log n) | O(log n)   | 原地排序，基本类型快               |
| `Arrays.binarySearch(arr, key)` | `java.util.Arrays` | 二分找索引   | 数组, key  | `int`  | O(log n)   | O(1)       | 数组必须已排序，返回负数表示插入点 |
| `Arrays.fill(arr, val)`         | `java.util.Arrays` | 填充         | 数组, 值   | void   | O(n)       | O(1)       | 覆盖整个数组                       |
| `Arrays.copyOf(arr, len)`       | `java.util.Arrays` | 复制/扩容    | 数组, 新长 | 新数组 | O(n)       | O(n)       | 返回新数组                         |

### 示例代码

```java
import java.util.Arrays;

int[] a = {3, 1, 4, 2};
Arrays.sort(a);                // [1,2,3,4]
int idx = Arrays.binarySearch(a, 3); // 返回 2
Arrays.fill(a, 0);             // [0,0,0,0]
int[] b = Arrays.copyOf(a, 6); // [0,0,0,0,0,0]
```

```java
// 优先级排序规则链
Arrays.sort(arr, Comparator.comparingInt((Point p) -> p.x)       // x 升序
                        .thenComparing(Comparator.comparingInt((Point p) -> p.y).reversed()) // y 降序
                        .thenComparing(Comparator.comparing((Point p) -> p.name).reversed()) // name 降序
        );
```



------

## ArrayList（List）

### 如何创建（多种方式 & 推荐）

- `List<Integer> list = new ArrayList<>();` — 推荐（常用，随机访问快）。
- `List<Integer> list = new ArrayList<>(initialCapacity);` — 如果预知大小可设置，减少扩容。
- `List<Integer> list = Arrays.asList(1,2,3);` — **不推荐**用于需要增删（返回固定大小的 List）。
- `List<Integer> list = new LinkedList<>();` — 不推荐刷算法题（随机访问慢），但适合做队列场景。

### 常用方法（表格）

| 方法             | import                                 | 作用   | 入参 | 出参    | 时间复杂度 | 空间复杂度 | 注意事项      |
| ---------------- | -------------------------------------- | ------ | ---- | ------- | ---------- | ---------- | ------------- |
| `list.add(x)`    | `java.util.List` `java.util.ArrayList` | 追加   | E    | boolean | O(1) 均摊  | O(1)       | 扩容时会 O(n) |
| `list.get(i)`    | 同上                                   | 访问   | int  | E       | O(1)       | O(1)       | 越界抛异常    |
| `list.remove(i)` | 同上                                   | 删除   | int  | E       | O(n)       | O(1)       | 后续元素左移  |
| `list.size()`    | 同上                                   | 长度   | —    | int     | O(1)       | O(1)       | —             |
| `list.isEmpty()` | 同上                                   | 是否空 | —    | boolean | O(1)       | O(1)       | —             |

### 示例代码

```java
import java.util.List;
import java.util.ArrayList;

List<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
int x = list.get(1);   // 20
int n = list.size();   // 2
list.remove(0);        // 删除索引 0 的元素
```

------

## HashMap

### 如何创建（多种方式 & 推荐）

- `Map<K,V> map = new HashMap<>();` — 推荐（默认选择）。
- `Map<K,V> map = new HashMap<>(initialCapacity, loadFactor);` — 高并发/大数据量场景可调参数以减少扩容或冲突。
- `Map.of(...)` / `Map.copyOf(...)` — Java 9+ 的不可变 Map，用于常量初始化（不可修改）。

### 常用方法（表格）

| 方法                              | import                              | 作用                                      | 入参              | 出参           | 时间复杂度                                | 空间复杂度 | 注意事项                                               |
| --------------------------------- | ----------------------------------- | ----------------------------------------- | ----------------- | -------------- | ----------------------------------------- | ---------- | ------------------------------------------------------ |
| `map.put(k,v)`                    | `java.util.Map` `java.util.HashMap` | 插入/更新                                 | K, V              | V（旧值）      | O(1) 平均                                 | O(n)       | hash 冲突可能退化到 O(n)                               |
| `map.get(k)`                      | 同上                                | 取值                                      | K                 | V/null         | O(1)                                      | O(1)       | 不存在返回 null                                        |
| `map.containsKey(k)`              | 同上                                | 是否包含键                                | K                 | boolean        | O(1)                                      | O(1)       | —                                                      |
| `map.remove(k)`                   | 同上                                | 删除键                                    | K                 | V/null         | O(1)                                      | O(1)       | —                                                      |
| `map.computeIfAbsent(k, k->newV)` | 同上                                | 懒加载/计数常用                           | K, Function       | V              | O(1) 平均                                 | 取决函数   | 很常用于构造集合或计数器                               |
| `map.entrySet()`                  | 同上                                | 遍历键值对                                | —                 | Set<Map.Entry> | O(n)                                      | O(1)       | 推荐遍历方式以避免额外查找成本                         |
| map.getOrDefault                  | 同上                                | 获取指定 key 对应的值，不存在时返回默认值 | key, defaultValue | `V`（值类型    | O(1) 均摊（HashMap），O(log n)（TreeMap） |            | 只读操作，不会把默认值放入 Map；若要写入需手动 `put()` |

### 示例代码

```java
import java.util.Map;
import java.util.HashMap;

Map<String, Integer> freq = new HashMap<>();
freq.put("a", 1);
freq.put("b", freq.getOrDefault("b", 0) + 1); // 常用模式
freq.computeIfAbsent("c", k -> 0);
int v = freq.get("a");    // 1
boolean ex = freq.containsKey("b");
freq.remove("c");
```

------

## HashSet

### 如何创建（多种方式 & 推荐）

- `Set<E> set = new HashSet<>();` — 推荐（判断存在/去重）。
- `Set<E> set = new HashSet<>(collection);` — 由其他集合构造。

### 常用方法（表格）

| 方法              | import                              | 作用   | 入参 | 出参    | 时间复杂度 | 空间复杂度 | 注意事项         |
| ----------------- | ----------------------------------- | ------ | ---- | ------- | ---------- | ---------- | ---------------- |
| `set.add(x)`      | `java.util.Set` `java.util.HashSet` | 添加   | E    | boolean | O(1)       | O(n)       | 已存在返回 false |
| `set.contains(x)` | 同上                                | 判存在 | E    | boolean | O(1)       | O(1)       | —                |
| `set.remove(x)`   | 同上                                | 删除   | E    | boolean | O(1)       | O(1)       | —                |
| `set.isEmpty()`   | 同上                                | 是否空 | —    | boolean | O(1)       | O(1)       | —                |

### 示例代码

```java
import java.util.Set;
import java.util.HashSet;

Set<Integer> set = new HashSet<>();
set.add(1);
set.add(2);
boolean has = set.contains(2); // true
set.remove(1);
```

------

## PriorityQueue（堆）

### 如何创建（小顶堆 / 大顶堆）

- 小顶堆（默认）：`PriorityQueue<Integer> pq = new PriorityQueue<>();` — 推荐（默认用于找最小）。
- 大顶堆：`PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());` 或 `new PriorityQueue<>((a,b)->b-a);` — 推荐使用 `Collections.reverseOrder()` 简洁。
- 指定初始容量：`new PriorityQueue<>(initialCapacity)`。

### 常用方法（表格）

| 方法                        | import                    | 作用           | 入参 | 出参     | 时间复杂度 | 空间复杂度 | 注意事项                                     |
| --------------------------- | ------------------------- | -------------- | ---- | -------- | ---------- | ---------- | -------------------------------------------- |
| `pq.offer(x)` / `pq.add(x)` | `java.util.PriorityQueue` | 插入           | E    | boolean  | O(log n)   | O(n)       | `offer` 遇容量问题返回 false（一般不需关注） |
| `pq.poll()`                 | 同上                      | 删除并返回堆顶 | —    | E / null | O(log n)   | O(1)       | 空时返回 null                                |
| `pq.peek()`                 | 同上                      | 查看堆顶       | —    | E / null | O(1)       | O(1)       | 空时返回 null                                |

### 示例代码

```java
import java.util.PriorityQueue;
import java.util.Collections;

PriorityQueue<Integer> minHeap = new PriorityQueue<>();
minHeap.offer(3);
minHeap.offer(1);
minHeap.offer(2);
int top = minHeap.peek(); // 1
minHeap.poll(); // remove 1

PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
maxHeap.offer(3);
maxHeap.offer(1);
int top2 = maxHeap.peek(); // 3
```

------

## Deque / ArrayDeque（推荐代替 Stack/Queue）

### 如何创建（多种方式 & 推荐）

- `Deque<Integer> dq = new ArrayDeque<>();` — 推荐（高效、无 null 支持）。
- `Deque<Integer> dq = new LinkedList<>();` — 也可用，但 `ArrayDeque` 更快且内存高效。
- `Stack` 仍可用：`new Stack<>()`，但已过时，不推荐。

### 常用方法（表格）

| 方法                            | import                                   | 作用     | 入参 | 出参     | 时间复杂度 | 空间复杂度 | 注意事项  |
| ------------------------------- | ---------------------------------------- | -------- | ---- | -------- | ---------- | ---------- | --------- |
| `dq.offerLast(x)`               | `java.util.Deque` `java.util.ArrayDeque` | 队尾入队 | E    | boolean  | O(1)       | O(n)       | —         |
| `dq.offerFirst(x)`              | 同上                                     | 队头入队 | E    | boolean  | O(1)       | O(n)       | —         |
| `dq.pollFirst()`                | 同上                                     | 队头出队 | —    | E / null | O(1)       | O(1)       | 空时 null |
| `dq.pollLast()`                 | 同上                                     | 队尾出队 | —    | E / null | O(1)       | O(1)       | —         |
| `dq.peekFirst()` / `peekLast()` | 同上                                     | 查看     | —    | E / null | O(1)       | O(1)       | —         |

### 示例代码

```java
import java.util.Deque;
import java.util.ArrayDeque;

Deque<Integer> dq = new ArrayDeque<>();
dq.offerLast(1);
dq.offerFirst(2);  // [2,1]
int head = dq.pollFirst(); // 2
int tail = dq.pollLast();  // 1
```

------

# 中频使用（常考）

> 刷题时常遇到（特定题型会用到），熟悉即可，遇到题型时回忆使用方式。

------

## Collections（工具类）

### 如何使用（导包 & 推荐）

- `import java.util.Collections;`
- 推荐直接使用静态方法（`Collections.sort(list)`、`Collections.reverse(list)` 等）。

### 常用方法（表格）

| 方法                         | import                  | 作用         | 入参     | 出参 | 时间复杂度 | 空间复杂度       | 注意事项                           |
| ---------------------------- | ----------------------- | ------------ | -------- | ---- | ---------- | ---------------- | ---------------------------------- |
| `Collections.sort(list)`     | `java.util.Collections` | 对 List 排序 | List     | void | O(n log n) | O(n) 或 O(log n) | List 元素需可比较或提供 Comparator |
| `Collections.reverse(list)`  | 同上                    | 反转 List    | List     | void | O(n)       | O(1)             | 原地反转                           |
| `Collections.max(list)`      | 同上                    | 最大值       | List     | E    | O(n)       | O(1)             | —                                  |
| `Collections.swap(list,i,j)` | 同上                    | 交换位置     | List,i,j | void | O(1)       | O(1)             | 用于模拟交换操作                   |

### 示例代码

```java
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

List<Integer> list = new ArrayList<>(List.of(3,1,2));
Collections.sort(list);      // [1,2,3]
Collections.reverse(list);   // [3,2,1]
int mx = Collections.max(list);
Collections.swap(list, 0, 2);
```

------

## TreeMap / TreeSet（有序集合）

### 如何创建（多种方式 & 推荐）

- `TreeMap<K,V> tm = new TreeMap<>();` — 推荐（需要键有序时）。
- `TreeSet<E> ts = new TreeSet<>();` — 推荐（需要有序唯一集合）。

### 常用方法（表格）

| 方法                               | import              | 作用          | 入参 | 出参        | 时间复杂度       | 空间复杂度 | 注意事项   |
| ---------------------------------- | ------------------- | ------------- | ---- | ----------- | ---------------- | ---------- | ---------- |
| `tm.put(k,v)`                      | `java.util.TreeMap` | 插入/更新     | K,V  | V           | O(log n)         | O(n)       | 基于红黑树 |
| `tm.firstKey()` / `lastKey()`      | 同上                | 最小/最大键   | —    | K           | O(log n) 或 O(1) | O(1)       | —          |
| `tm.ceilingKey(k)` / `floorKey(k)` | 同上                | >=k / <=k     | K    | K/null      | O(log n)         | O(1)       | 区间题常用 |
| `ts.add(x)` / `ts.first()`         | `java.util.TreeSet` | 插入 / 取最小 | E    | boolean / E | O(log n)         | O(n)       | —          |

### 示例代码

```java
import java.util.TreeMap;
import java.util.TreeSet;

TreeMap<Integer, String> tm = new TreeMap<>();
tm.put(10, "a");
tm.put(5, "b");
int minKey = tm.firstKey();     // 5
Integer ceil = tm.ceilingKey(6); // 10

TreeSet<Integer> ts = new TreeSet<>();
ts.add(3); ts.add(1);
int min = ts.first(); // 1
```

------

## LinkedList（队列/双端链表实现）

### 如何创建（多种方式 & 推荐）

- `LinkedList<E> ll = new LinkedList<>();` — 在需要频繁头尾插删的场景可用（但随机访问慢）。
- 若主要做队列操作，优先用 `ArrayDeque`（更快）。

### 常用方法（表格）

| 方法                                | import                 | 作用      | 入参 | 出参 | 时间复杂度 | 空间复杂度 | 注意事项                     |
| ----------------------------------- | ---------------------- | --------- | ---- | ---- | ---------- | ---------- | ---------------------------- |
| `ll.addFirst(x)` / `addLast(x)`     | `java.util.LinkedList` | 头/尾插入 | E    | void | O(1)       | O(1)       | 用于双端操作                 |
| `ll.get(i)`                         | 同上                   | 随机访问  | int  | E    | O(n)       | O(1)       | 不推荐在大量随机访问场景使用 |
| `ll.removeFirst()` / `removeLast()` | 同上                   | 头/尾移除 | —    | E    | O(1)       | O(1)       | —                            |

### 示例代码

```java
import java.util.LinkedList;

LinkedList<Integer> ll = new LinkedList<>();
ll.addFirst(1);
ll.addLast(2);
int head = ll.removeFirst(); // 1
int tail = ll.removeLast();  // 2
```

------

## Character / Integer 转换方法

### 如何使用（无需 import）

- `Character` 和 `Integer` 属于 `java.lang`，无需显示 `import`。
- 常用于字符串解析、字符判断与数值转换。

### 常用方法（表格）

| 方法                                        | import | 作用         | 入参     | 出参     | 时间复杂度 | 空间复杂度 | 注意事项   |
| ------------------------------------------- | ------ | ------------ | -------- | -------- | ---------- | ---------- | ---------- |
| `Character.isDigit(c)`                      | —      | 是否数字     | `char`   | boolean  | O(1)       | O(1)       | —          |
| `Character.isLetter(c)`                     | —      | 是否字母     | `char`   | boolean  | O(1)       | O(1)       | —          |
| `Character.toLowerCase(c)`                  | —      | 转小写       | `char`   | `char`   | O(1)       | O(1)       | —          |
| `Integer.parseInt(s)`                       | —      | 字符串转 int | `String` | int      | O(n)       | O(1)       | 溢出抛异常 |
| `String.valueOf(x)` / `Integer.toString(x)` | —      | 数转字符串   | 基本类型 | `String` | O(log n)   | O(n)       | —          |

### 示例代码

```java
char c = '7';
boolean isDigit = Character.isDigit(c); // true
int num = Integer.parseInt("123");      // 123
String s = String.valueOf(456);         // "456"
```

------

## Math 系列

### 如何使用（无需 import）

- `Math` 在 `java.lang`，直接使用。

### 常用方法（表格）

| 方法                    | import | 作用     | 入参          | 出参   | 时间复杂度           | 空间复杂度 | 注意事项                           |
| ----------------------- | ------ | -------- | ------------- | ------ | -------------------- | ---------- | ---------------------------------- |
| `Math.max(a,b)` / `min` | —      | 比较     | num,num       | num    | O(1)                 | O(1)       | —                                  |
| `Math.abs(x)`           | —      | 绝对值   | num           | num    | O(1)                 | O(1)       | `Math.abs(Integer.MIN_VALUE)` 溢出 |
| `Math.sqrt(x)`          | —      | 开根号   | double        | double | O(1)                 | O(1)       | 精度问题                           |
| `Math.pow(a,b)`         | —      | 幂运算   | double,double | double | 实现相关（一般较慢） | —          | 浮点误差，不用于整型快速幂         |
| `Math.ceilDiv(a, b)`    |        | 向上取整 | int, int      | int    |                      |            |                                    |

### 示例代码

```java
int a = Math.max(3, 7); // 7
int b = Math.abs(-5);   // 5
double r = Math.sqrt(16);// 4.0
```

------

# 低频使用（了解即可）

> 在刷题中较少使用或仅在特定题型出现；工作中可能会更常见。掌握用途即可。

------

## BigInteger / BigDecimal

### 如何创建（导包 & 推荐）

- `import java.math.BigInteger;`
- `BigInteger bi = new BigInteger("12345678901234567890");` — 用于大整数运算（超过 `long`）。
- `BigDecimal bd = new BigDecimal("1.23");` — 高精度小数（避免浮点误差）。

### 简要表格

| 类 / 方法                 | import                 | 作用       | 入参       | 出参       | 复杂度   | 注意事项               |
| ------------------------- | ---------------------- | ---------- | ---------- | ---------- | -------- | ---------------------- |
| `BigInteger.add/multiply` | `java.math.BigInteger` | 大整数算术 | BigInteger | BigInteger | 取决位长 | 慎用在对性能敏感的题目 |

### 示例

```java
import java.math.BigInteger;
BigInteger a = new BigInteger("12345678901234567890");
BigInteger b = new BigInteger("98765432109876543210");
BigInteger sum = a.add(b);
```

------

## Pattern / Matcher（正则）

### 如何创建（导包）

- `import java.util.regex.Pattern; import java.util.regex.Matcher;`

### 简要表格

| 方法                     | import            | 作用     | 入参   | 出参    | 复杂度     | 注意事项              |
| ------------------------ | ----------------- | -------- | ------ | ------- | ---------- | --------------------- |
| `Pattern.compile(regex)` | `java.util.regex` | 编译正则 | String | Pattern | 取决 regex | 重用 Pattern 提高性能 |
| `p.matcher(str).find()`  | 同上              | 查找匹配 | String | boolean | O(n)       | 正则复杂度高时慢      |

### 示例

```java
import java.util.regex.Pattern;
import java.util.regex.Matcher;

Pattern p = Pattern.compile("\\d+");
Matcher m = p.matcher("abc123def");
boolean found = m.find(); // true
```

------

## Optional / Stream / Random（简述）

### Optional

- `import java.util.Optional;`
- 用于减少空指针、链式处理。非刷题必备，但工作代码风格常用。

### Stream

- `import java.util.stream.*;` / `Arrays.stream(arr)`
- 便捷而可读，但刷题中通常不用于追求最高性能或最小代码长度的场景。

### Random

- `import java.util.Random;`
- `Random r = new Random(); r.nextInt(n);` — 用于随机化或测试。

------

# 使用建议与刷题小贴士

1. **记住“如何 new + import”比记方法名更重要**：刷题时快速写出 `new ArrayDeque<>()` 或 `new PriorityQueue<>(Collections.reverseOrder())` 能节省很多时间。
2. **优先记高频**：String、Arrays、ArrayList、HashMap/HashSet、Deque、PriorityQueue，这些占比最高。
3. **注意复杂度陷阱**：`list.remove(i)` 是 O(n)、`LinkedList.get(i)` 是 O(n)、`HashMap` 在极端 hash 冲突下退化为 O(n)。
4. **写题时倾向使用 ArrayDeque 替代 Stack/LinkedList**（性能和语义更好）。
5. **示例代码实际运行一次**：复制示例到 IDE 运行，确保熟悉 import 与用法。
6. **当心 Integer.MIN_VALUE 的绝对值问题**：`Math.abs(Integer.MIN_VALUE)` 仍为负值。
7. **预估容量**：若能预知元素数（如建堆/建 map），可传入初始容量减少扩容成本。
8. **学习 `computeIfAbsent` 与 `getOrDefault`**：写计数/分组题非常高效且简洁。

------

如果你愿意，我可以把本文件再整理成一个更短的「速查单页（1 页纸）」，只包含 `new/import` 与方法名＋复杂度，便于打印或手机查阅。要不要我生成？