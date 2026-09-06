import java.util.List;
class Solution {
    public String reverseWords(String s) {
     List<String> list=new ArrayList<>();
     StringBuilder word=new StringBuilder();
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)==' '){
            if(word.length()!=0){
            list.add(word.toString());
            word.setLength(0);
            }
        }
        else{
            word.append(s.charAt(i));
        }
      }
      if(word.length()!=0){
         list.add(word.toString());
      }
      Collections.reverse(list);
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<list.size();i++){
        sb.append(list.get(i));
        if(i!=list.size()-1){
            sb.append(" ");
        }
      }
      return sb.toString();
    }
}