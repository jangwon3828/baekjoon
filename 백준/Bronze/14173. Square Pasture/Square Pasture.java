import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        // 들판 좌표들
        List<Point> pasturePoints = new ArrayList<>();

        // pasturePoints 좌표값 입력
        // 좌표를 다 입력받을 필요는 없지만 확장성을 위해 입력받음
        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            final int x1 = Integer.parseInt(st.nextToken());
            final int y1 = Integer.parseInt(st.nextToken());
            final int x2 = Integer.parseInt(st.nextToken());
            final int y2 = Integer.parseInt(st.nextToken());
            Point pt1 = new Point(x1, y1);
            Point pt2 = new Point(x2, y2);
            Point pt3 = new Point(x1, y2);
            Point pt4 = new Point(x2, y1);
            pasturePoints.add(pt1);
            pasturePoints.add(pt2);
            pasturePoints.add(pt3);
            pasturePoints.add(pt4);
        }

        final int ptSize = pasturePoints.size()-1;
        // X 값 범위
        pasturePoints.sort(Comparator.comparing(Point::getX));
        final int xRange = (int) (pasturePoints.get(ptSize).getX() - pasturePoints.get(0).getX());
        // Y 값 범위
        pasturePoints.sort(Comparator.comparing(Point::getY));
        final int yRange = (int) (pasturePoints.get(ptSize).getY() - pasturePoints.get(0).getY());
        // 출력
        final int sqWidth = Math.max(xRange, yRange);
        System.out.print(sqWidth*sqWidth);
    }
}