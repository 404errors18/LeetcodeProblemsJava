package leetcode.easy;

public class P67_AddBinary {
    // public String addBinary1(String a, String b) {
    //     return Integer.toString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2), 2);
    // }

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int cal = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int bit = cal;
            bit += i >= 0 ? a.charAt(i) - '0' : 0;
            bit += j >= 0 ? b.charAt(j) - '0' : 0;
            result.append(bit % 2);
            cal = bit / 2;
        }
        result.append(cal == 1 ? cal : "");
        return result.reverse().toString();
    }
}
