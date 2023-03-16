class Solution {
    public int solution(String skill, String[] skill_trees) {
        int[] skills=new int[26];
        for (int i = 0; i < skill.length(); i++) {
            skills[skill.charAt(i)-'A']=i+1;
        }
        int answer=0;
       for(String check: skill_trees){
           for (int i = 0; i < 26; i++) {
               if(skills[i]<1){
                   char i1 = (char) ('A' + i);
                   check=check.replace(i1,' ');
               }
           }
           check = check.replaceAll(" ","");
           int seq=1;
           boolean contain=true;
           for (int i = 0; i < check.length(); i++) {
               if(skills[check.charAt(i)-'A']==seq){
                   seq++;
               }else {
                   contain=false;
                   break;
               }
           }
           if(contain){
               answer+=1;
           }
       }
        return answer;
    }
}