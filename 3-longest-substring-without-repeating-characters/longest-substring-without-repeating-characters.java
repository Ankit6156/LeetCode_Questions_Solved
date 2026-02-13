class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int left = 0;
        int maxlength = 0;
        for(int right =0; right<s.length(); right++) {

            while(hs.contains(s.charAt(right))) {
                hs.remove(s.charAt(left));
                left++;
            }

            hs.add(s.charAt(right));

            int windowsize = right-left+1;
            maxlength = Math.max(maxlength, windowsize);

        }
        return maxlength;
    }
}