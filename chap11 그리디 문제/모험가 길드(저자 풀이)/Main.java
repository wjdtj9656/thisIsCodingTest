import java.util.*;

public class Main {

    public static int n;
    public static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }

        Collections.sort(arrayList);

        int result = 0; // �� �׷��� ��
        int count = 0; // ���� �׷쿡 ���Ե� ���谡�� ��

        for (int i = 0; i < n; i++) { // �������� ���� �ͺ��� �ϳ��� Ȯ���ϸ�
            count += 1; // ���� �׷쿡 �ش� ���谡�� ���Խ�Ű��
            if (count >= arrayList.get(i)) { // ���� �׷쿡 ���Ե� ���谡�� ���� ������ ������ �̻��̶��, �׷� �Ἲ
                result += 1; // �� �׷��� �� ������Ű��
                count = 0; // ���� �׷쿡 ���Ե� ���谡�� �� �ʱ�ȭ
            }
        }

        System.out.println(result);
    }
}