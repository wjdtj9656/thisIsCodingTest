import java.util.*;

public class Main {

    public static int n, m, x, y, direction;
    // �湮�� ��ġ�� �����ϱ� ���� ���� �����Ͽ� 0���� �ʱ�ȭ
    public static int[][] d = new int[50][50];
    // ��ü �� ����
    public static int[][] arr = new int [50][50];

    // ��, ��, ��, �� ���� ����
    public static int dx[] = {-1, 0, 1, 0};
    public static int dy[] = {0, 1, 0, -1};

    // �������� ȸ��
    public static void turn_left() {
        direction -= 1;
        if (direction == -1) direction = 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M�� ������ �������� �����Ͽ� �Է¹ޱ�
        n = sc.nextInt();
        m = sc.nextInt();
        
        // ���� ĳ������ X ��ǥ, Y ��ǥ, ������ �Է¹ޱ�
        x = sc.nextInt();
        y = sc.nextInt();
        direction = sc.nextInt();
        d[x][y] = 1; // ���� ��ǥ �湮 ó��

        // ��ü �� ������ �Է� �ޱ�
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // �ùķ��̼� ����
        int cnt = 1;
        int turn_time = 0;
        while (true) {
            // �������� ȸ��
            turn_left();
            int nx = x + dx[direction];
            int ny = y + dy[direction];
            // ȸ���� ���� ���鿡 ������ ���� ĭ�� �����ϴ� ��� �̵�
            if (d[nx][ny] == 0 && arr[nx][ny] == 0) {
                d[nx][ny] = 1;
                x = nx;
                y = ny;
                cnt += 1;
                turn_time = 0;
                continue;
            }
            // ȸ���� ���� ���鿡 ������ ���� ĭ�� ���ų� �ٴ��� ���
            else turn_time += 1;
            // �� ���� ��� �� �� ���� ���
            if (turn_time == 4) {
                nx = x - dx[direction];
                ny = y - dy[direction];
                // �ڷ� �� �� �ִٸ� �̵��ϱ�
                if (arr[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                }
                // �ڰ� �ٴٷ� �����ִ� ���
                else break;
                turn_time = 0;
            }
        }

        System.out.println(cnt);
    }

}