import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // ���� ����(N)�� ��û�� ���� ����(M)
        int n = sc.nextInt();
        int m = sc.nextInt();

        // �� ���� ���� ���� ���� 
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // ���� Ž���� ���� �������� ���� ����
        int start = 0;
        int end = (int) 1e9;
        // ���� Ž�� ���� (�ݺ���)
        int result = 0; 
        while (start <= end) {
            long total = 0;
            int mid = (start + end) / 2;
            for (int i = 0; i < n; i++) {
                // �߶��� ���� ���� �� ���
                if (arr[i] > mid) total += arr[i] - mid; 
            }
            if (total < m) { // ���� ���� ������ ��� �� ���� �ڸ���(���� �κ� Ž��)
                end = mid - 1;
            }
            else { // ���� ���� ����� ��� �� �ڸ���(������ �κ� Ž��)
                result = mid; // �ִ��� �� �߶��� ���� �����̹Ƿ�, ���⿡�� result�� ��� 
                start = mid + 1;
            }
        }

        System.out.println(result);
    }

}