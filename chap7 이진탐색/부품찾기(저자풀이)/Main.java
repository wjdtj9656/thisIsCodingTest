import java.util.*;

public class Main {

    // ���� Ž�� �ҽ��ڵ� ����(�ݺ���)
    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            // ã�� ��� �߰��� �ε��� ��ȯ
            if (arr[mid] == target) return mid;
            // �߰����� ������ ã���� �ϴ� ���� ���� ��� ���� Ȯ��
            else if (arr[mid] > target) end = mid - 1;
            // �߰����� ������ ã���� �ϴ� ���� ū ��� ������ Ȯ��
            else start = mid + 1; 
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // N(������ ��ǰ ����)
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // ���� Ž���� �����ϱ� ���� ������ ���� ����
        Arrays.sort(arr);

        // M(�մ��� Ȯ�� ��û�� ��ǰ ����)
        int m = sc.nextInt();
        int[] targets = new int[m];
        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }

        // �մ��� Ȯ�� ��û�� ��ǰ ��ȣ�� �ϳ��� Ȯ��
        for (int i = 0; i < m; i++) {
            // �ش� ��ǰ�� �����ϴ��� Ȯ��
            int result = binarySearch(arr, targets[i], 0, n - 1);
            if (result != -1) {
                System.out.print("yes ");
            }
            else {
                System.out.print("no ");
            }
        }
    }

}