import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N�� �Է¹ޱ�
        int n = sc.nextInt();

        // N���� ������ �Է¹޾� ����Ʈ�� ����
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // �⺻ ���� ���̺귯���� �̿��Ͽ� �������� ���� ����
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}