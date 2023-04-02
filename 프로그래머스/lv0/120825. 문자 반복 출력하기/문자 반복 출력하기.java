class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuilder sb=new StringBuilder();
        for(int k=0;k<my_string.length();k++){ 
            String s=my_string.charAt(k)+"";
            sb.append( s.repeat(n)) ;
        }
       
        return sb.toString();
    }
}