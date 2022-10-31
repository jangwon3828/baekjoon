
class Solution {
    public int solution(int[][] dots) {
 
     for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                if (i == j || i == dots.length - 1 - j || j == dots.length - 1 - i) {
                    continue;
                }
                if ((Math.abs(dots[i][0] - dots[j][0]) == Math.abs(dots[dots.length - 1 - i][0] - dots[dots.length - 1 - j][0])) &&
                        (Math.abs(dots[i][1] - dots[j][1]) == Math.abs(dots[dots.length - 1 - i][1] - dots[dots.length - 1 - j][1]))) {
                    return 1;
                }
            }
        }

        return 0;
    }
}