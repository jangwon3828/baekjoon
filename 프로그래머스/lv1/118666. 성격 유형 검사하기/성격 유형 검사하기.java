import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        int length = survey.length;
        Map<Character,Integer>mbti=new HashMap<>();
        mbti.put('R',0);
        mbti.put('T',0);
        mbti.put('C',0);
        mbti.put('F',0);
        mbti.put('J',0);
        mbti.put('M',0);
        mbti.put('A',0);
        mbti.put('N',0);
        for (int i = 0; i < length; i++) {
            switch(choices[i]){
                case 1:mbti.put(survey[i].charAt(0),mbti.get(survey[i].charAt(0))+3); break;
                case 2:mbti.put(survey[i].charAt(0),mbti.get(survey[i].charAt(0))+2); break;
                case 3:mbti.put(survey[i].charAt(0),mbti.get(survey[i].charAt(0))+1); break;
                case 4: break;
                case 5:mbti.put(survey[i].charAt(1),mbti.get(survey[i].charAt(1))+1); break;
                case 6:mbti.put(survey[i].charAt(1),mbti.get(survey[i].charAt(1))+2); break;
                case 7:mbti.put(survey[i].charAt(1),mbti.get(survey[i].charAt(1))+3); break;

            }
        }
        StringBuilder sb=new StringBuilder();
        sb.append(mbti.get('R')<mbti.get('T')?"T":"R")
                .append(mbti.get('C')<mbti.get('F')?"F":"C")
                .append(mbti.get('J')<mbti.get('M')?"M":"J")
                .append(mbti.get('A')<mbti.get('N')?"N":"A");


        return sb.toString();
    }
}