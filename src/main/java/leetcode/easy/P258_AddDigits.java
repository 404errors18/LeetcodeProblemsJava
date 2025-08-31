package leetcode.easy;

public class P258_AddDigits {
    public int addDigits1(int num) {
        return (num - 1) % 9 + 1;
    }

    public int addDigits2(int num) {
        String s = String.valueOf(num);
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c - '0';
        }
        while (sum > 9) {
            sum = addDigits2(sum);
        }

        return sum;
    }

    public int addDigits3(int num) {

        while (num > 9) {
            num = String.valueOf(num).chars().map(c -> c - '0').sum();
        }
        return num;
    }

    public int addDigits4(int num) {
        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public int addDigits5(int num) {
        return (num - 1) % 9 + 1;
    }
}
