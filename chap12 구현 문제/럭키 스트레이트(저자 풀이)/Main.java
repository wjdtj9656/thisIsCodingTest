import java.util.*;

public class Main {

    public static String str;
    public static int summary = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        // ���� �κ��� �ڸ����� �� ���ϱ�
        for (int i = 0; i < str.length() / 2; i++) {
            summary += str.charAt(i) - '0';
        }

        // ������ �κ��� �ڸ����� �� ����
        for (int i = str.length() / 2; i < str.length(); i++) {
            summary -= str.charAt(i) - '0';
        }

        // ���� �κа� ������ �κ��� �ڸ��� ���� �������� �˻�
        if (summary == 0) System.out.println("LUCKY");
        else System.out.println("READY");
    }
}