class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0, j = 0;
        while (j < t.length() && i < s.length()) {
            if (t.charAt(j) == s.charAt(i)) {
                j++;
            }
            i++;
            if (j == t.length()) return 0;
        }

        return t.length() - j;
    }
}