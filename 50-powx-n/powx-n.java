class Solution {
    public double myPow(double x, int n) {
        long exp=n;
        if(exp<0){
            
            exp=-exp;
        }
        double ans=1;
    while(exp>0){
        if(exp%2 !=0){//if exp is odd mul with extra x
            ans*=x;//4,1024
        }
        //or else divide the exp into half and multiply
        x *=x;// 4,16,256,xxxxx
        exp/=2;//5,2,1,0
    }
    if(n<0){
        return 1/ans;
    }
    return ans;


    }
}

// class Solution {
//     public double myPow(double x, int n) {
    
    
    
    
//     }
// }