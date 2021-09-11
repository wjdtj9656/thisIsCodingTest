import java.util.*;

class Solution {
    
    // "�������� ��ȣ ���ڿ�"�� �ε��� ��ȯ
    public int balancedIndex(String p) {
        int count = 0; // ���� ��ȣ�� ����
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') count += 1;
            else count -= 1;
            if (count == 0) return i;
        }
        return -1;
    }

    // "�ùٸ� ��ȣ ���ڿ�"���� �Ǵ�
    public boolean checkProper(String p) {
        int count = 0; // ���� ��ȣ�� ����
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') count += 1;
            else {
                if (count == 0) { // ���� ���� �ʴ� ��쿡 false ��ȯ
                    return false;
                }
                count -= 1;
            }
        }
        return true; // ���� �´� ��쿡 true ��ȯ
    }
    
    public String solution(String p) {
        String answer = "";
        if (p.equals("")) return answer;
        int index = balancedIndex(p);
        String u = p.substring(0, index + 1);
        String v = p.substring(index + 1);
        // "�ùٸ� ��ȣ ���ڿ�"�̸�, v�� ���� �Լ��� ������ ����� �ٿ� ��ȯ
        if (checkProper(u)) {
            answer = u + solution(v);
        }
        // "�ùٸ� ��ȣ ���ڿ�"�� �ƴ϶�� �Ʒ��� ������ ����
        else {
            answer = "(";
            answer += solution(v);
            answer += ")";
            u = u.substring(1, u.length() - 1); // ù ��°�� ������ ���ڸ� ����
            String temp = "";
            for (int i = 0; i < u.length(); i++) {
                if (u.charAt(i) == '(') temp += ")";
                else temp += "(";
            }
            answer += temp;
        }
        return answer;
    }
}