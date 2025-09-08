package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("Leetcode Problem #355. Design Twitter")
public class P355_DesignTwitterTest {
    @DisplayName("testTwitter")
    @Test
    public void testTwitter() {
        P355_DesignTwitter twitter = new P355_DesignTwitter();
        twitter.postTweet(1, 5);
        assertArrayEquals(new int[]{1, 5}, twitter.getNewsFeed(1));
        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        assertArrayEquals(new int[]{6, 5}, twitter.getNewsFeed(1));
        twitter.unfollow(1, 2);
        assertArrayEquals(new int[]{5}, twitter.getNewsFeed(1));
    }
}
