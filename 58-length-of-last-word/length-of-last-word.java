class Solution {
    public int lengthOfLastWord(String s) {
        String arr[] = s.split(" ");
        for(int i =0; i<arr.length; i++) {
            if(i == arr.length-1) {
                return arr[i].length();
            }
        }
        return 0;
    }
}