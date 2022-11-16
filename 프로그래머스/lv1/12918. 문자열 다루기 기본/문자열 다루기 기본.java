
class Solution {
    public boolean solution(String s) {
        int a=s.length();
        if(a==4||a==6){
          for(int i=0;i<a;i++){
                int b=s.charAt(i)-'0';
              if(b>=0&&b<10){
                 continue;   
               }
              else{
                  return false;
              }
            }  
            return true;
        }
        return false;
       
    }
}