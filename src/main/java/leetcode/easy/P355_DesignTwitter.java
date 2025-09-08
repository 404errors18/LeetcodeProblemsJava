package leetcode.easy;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;

public class P355_DesignTwitter {
}

class Twitter {

    private static final int MAX_TWEETS = 10;
    private static Map<Integer, User> userMap;

    public Twitter() {

    }

    public void postTweet(int userId, int tweetId) {
        // 检测发送的用户是否存在
        if (userMap.getOrDefault(userId, null) == null) {
            userMap.put(userId, new User(userId));
        }

        // todo 发送推文
        //  用户每发一条推文，就向粉丝列表的所有粉丝推送，
        //  每个用户维护一张定长新闻推送表，记录关注者和自己的推文
    }

    public List<Integer> getNewsFeed(int userId) {
        // todo 获取用户动态，从 tweetDeque 获取
    }

    public void follow(int followerId, int followeeId) {
        User follower = userMap.getOrDefault(followerId, null);
        User followee = userMap.getOrDefault(followeeId, null);
        if (follower == null) {
            userMap.put(followerId, new User(followerId));
            follower = userMap.get(followerId);
        }
        if (followee == null) {
            userMap.put(followeeId, new User(followeeId));
            followee = userMap.get(followeeId);
        }
        follower.follow(followeeId);
        followee.addFans(followerId);
    }

    public void unfollow(int followerId, int followeeId) {
        User follower = userMap.getOrDefault(followerId, null);
        User followee = userMap.getOrDefault(followeeId, null);
        if (follower == null) {
            userMap.put(followerId, new User(followerId));
            follower = userMap.get(followerId);
        }
        if (followee == null) {
            userMap.put(followeeId, new User(followeeId));
            followee = userMap.get(followeeId);
        }
        follower.unfollow(followeeId);
        followee.removeFans(followerId);
    }
}

class User {
    private static final int TWEET_DEQUE_SIZE = 10;
    private final int userId;
    private Set<Integer> followSet;  // 用户关注的ID
    private Set<Integer> fansSet;  // 关注该用户的ID
    private LinkedBlockingDeque<Tweet> tweetDeque;

    public User(int userId) {
        this.userId = userId;
        this.tweetDeque = new LinkedBlockingDeque<>(TWEET_DEQUE_SIZE);
        // todo 这个集合是定长不变的吗？当存储多余十个会怎么样？
    }

    public int getUserId() {
        return userId;
    }

    public void follow(int followeeId) {
        this.followSet.add(followeeId);
    }

    public void addFans(int followerId) {
        this.fansSet.add(followerId);
    }

    public void unfollow(int followeeId) {
        this.followSet.remove(followeeId);
    }

    public void removeFans(int followerId) {
        this.fansSet.remove(followerId);
    }
}

class Tweet {
    public int tweetId;
    public int time;
    public Tweet next;
}