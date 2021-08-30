import java.util.*;

public class Main {

    public static int n, m;
    public static int[][] graph = new int[1000][1000];

    // DFS�� Ư�� ��带 �湮�ϰ� ����� ��� ���鵵 �湮
    public static boolean dfs(int x, int y) {
        // �־��� ������ ����� ��쿡�� ��� ����
        if (x <= -1 || x >=n || y <= -1 || y >= m) {
            return false;
        }
        // ���� ��带 ���� �湮���� �ʾҴٸ�
        if (graph[x][y] == 0) {
            // �ش� ��� �湮 ó��
            graph[x][y] = 1;
            // ��, ��, ��, ���� ��ġ�鵵 ��� ��������� ȣ��
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M�� ������ �������� �����Ͽ� �Է� �ޱ�
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); // ���� �����

        // 2���� ����Ʈ�� �� ���� �Է� �ޱ�
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        // ��� ���(��ġ)�� ���Ͽ� ����� ä���
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // ���� ��ġ���� DFS ����
                if (dfs(i, j)) {
                    result += 1;
                }
            }
        }
        System.out.println(result); // ���� ��� 
    }

}