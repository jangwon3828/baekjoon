import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        long count = Arrays.stream(num_list).filter(i -> i % 2 == 0).count();
        return new int[]{(int) count, (int) (num_list.length - count)};
    }
}