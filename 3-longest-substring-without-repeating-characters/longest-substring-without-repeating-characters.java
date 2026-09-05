class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashSet<Character> seen =new HashSet<>();
        int maxlength = 0;
        int left=0;
        for(int right =0;right<n;right++){
            while(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }
        seen.add(s.charAt(right));
        maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
   }
}