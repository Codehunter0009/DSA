class Solution {
    public String intToRoman(int num) {
    //     Map<String ,Integer> map=new HashMap<>();
    //     map.put('I',1);
    //     map.put('V',5);
    //     map.put('X',10);
    //     map.put('C',100);
    //     map.put('D',500);
    //     map.put('M',1000);
    // String result="";
    //     while(n>0){

    //     }

   int[] intcode = {
    1000, 900, 500, 400,
    100, 90, 50, 40,
    10, 9, 5, 4, 1
};

String[] code = {
    "M", "CM", "D", "CD",
    "C", "XC", "L", "XL",
    "X", "IX", "V", "IV", "I"
};

    StringBuilder sb=new StringBuilder();
    for(int i=0;i<intcode.length;i++){
        while(num>=intcode[i]){
            sb.append(code[i]);
            num-=intcode[i];
        }
    }
    return sb.toString();
    }
}