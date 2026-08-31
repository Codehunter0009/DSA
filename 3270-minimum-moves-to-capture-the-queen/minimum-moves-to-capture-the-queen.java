class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
       
       //white rook logic
       if(a==e||b==f){
        if(a==e && a==c && ( (d-f) * (d-b) <=0) ) return 2;
        if(b==d && b==f && ( (c-a)*(c-e)<=0  )) return 2;
        return 1;
       } 
       //for white bishop
       if(Math.abs(c-e) == Math.abs(d-f) ){
        if(Math.abs(c-a)==Math.abs(d-b) && Math.abs(e-a)==Math.abs(f-b) &&(b-f)*(b-d)<=0) return 2;
        return 1;
       }
       return 2;
    }
}