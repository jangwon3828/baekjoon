class Solution {
    public int solution(String[] babbling) {
       String[] earful= {"aya","ye","woo","ma"};
        String[] cannot= {"ayaaya","yeye","woowoo","mama"};
        for (String s : babbling) {
            for (String s1 : cannot) {
                s=s.replace(s1,"1");
                s="123123";
            }
        }
        for (int i = 0; i < babbling.length; i++) {
            for (String s1 : cannot) {
                babbling[i]=babbling[i].replace(s1,"1");
            }
        }
        for (int i = 0; i < babbling.length; i++) {
            for (String s1 : earful) {
                babbling[i]=babbling[i].replace(s1,"0");
            }
        }

        int answer=0;
        for (String s : babbling) {
            int length = s.length();
            for (int i = 0; i < length; i++) {
                if(s.charAt(i)!='0'){
                    break;
                }
                if(length-1==i)
                    answer++;      
            }
        }
        return answer;
    }
}