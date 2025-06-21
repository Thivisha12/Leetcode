class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        Map<Character, Integer> lastOccurence = new HashMap<>();
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (lastOccurence.containsKey(c)) {
                l = Math.max(l, lastOccurence.get(c) + 1);
            }
            lastOccurence.put(c, r);
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}