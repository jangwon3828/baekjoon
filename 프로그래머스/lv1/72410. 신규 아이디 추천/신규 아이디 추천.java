class Solution {
    public String solution(String new_id) {
         StringBuilder answer = new StringBuilder(new_id.toLowerCase()
                .replaceAll("[^\\.\\-_0-9a-z]", "")
                .replaceAll("[.]+", "."));
        if(answer.length()>0) {
            if (answer.charAt(0) == '.') {
                answer = answer.deleteCharAt(0);
            }
            if(answer.length()>0) {
                if (answer.charAt(answer.length() - 1) == '.') {
                    answer = answer.deleteCharAt(answer.length() - 1);
                }
            }
        }
        if(answer.length()==0){
            answer = new StringBuilder("a");
        }
        if(answer.length()>=16){
            answer = new StringBuilder(answer.substring(0, 15));
            if(answer.charAt(14)=='.'){
                answer = new StringBuilder(answer.substring(0, 14));
            }
        }
        while (answer.length()<3){
            answer.append(answer.charAt(answer.length() - 1));
        }
        return answer.toString();
    }
}