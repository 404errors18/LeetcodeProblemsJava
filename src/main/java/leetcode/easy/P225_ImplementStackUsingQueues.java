package leetcode.easy;

import java.util.concurrent.LinkedBlockingDeque;

public class P225_ImplementStackUsingQueues {

    LinkedBlockingDeque<Integer> deque;

    public P225_ImplementStackUsingQueues() {
        deque = new LinkedBlockingDeque<>();
    }

    public void push(int x) {
        deque.offer(x);
    }

    public int pop() {
        if (deque.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return deque.pollLast();
    }

    public int top() {
        if (deque.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return deque.peekLast();
    }

    public boolean empty() {
        return deque.isEmpty();
    }
}
