class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int half = s.length() / 2;
        for (int i = 0; i < half; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }
}
