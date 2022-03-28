public class Solution {
    public String getSmallestString(int n, int k) {
        k -= n;
        int numZ = k / 25;
        int midChar = k % 25;
        int numA = n - numZ - 1;
        char[] chars = new char[n];
        for (int i = 0; i < numA; i++) {
            chars[i] = 'a';
        }
        k -= n;
        if (numA >= 0) {
            chars[numA] = (char) (midChar + 'a');
        }
        for (int i = numA + 1; i < n; i++) {
            chars[i] = 'z';
        }
        String ans = new String(chars);
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.getSmallestString(5,76));
    }
}