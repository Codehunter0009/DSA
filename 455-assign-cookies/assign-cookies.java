class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;
        int l=0;
        int r=0;
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(l<n && r<m){
            if(g[l]<=s[r]){
               count++;
               l++;
               r++;
              
            }
            else{r++;}
            
        }
    
    return count;
    }
}