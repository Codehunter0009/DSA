class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        int twenty=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                five+=1;
            }
            if(bills[i]==10){
                if(five!=0){
                ten+=1;
                five-=1;
                }
                else{return false;}
            }
            if(bills[i]==20){
                if(five!=0 && ten!=0){
                ten-=1;
                twenty+=1;
                five-=1;
                }
                else if(five>=3){
                    twenty+=1;
                    five-=3;
                }
                else{
                    return false;
                }
            }
        }
return true;

    }
}