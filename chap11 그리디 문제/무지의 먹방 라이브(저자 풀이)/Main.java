import java.util.*;

class Food implements Comparable<Food> {

    private int time;
    private int index;

    public Food(int time, int index) {
        this.time = time;
        this.index = index;
    }

    public int getTime() {
        return this.time;
    }

    public int getIndex() {
        return this.index;
    }

    // �ð��� ª�� ���� ���� �켱������ �������� ����
    @Override
    public int compareTo(Food other) {
        return Integer.compare(this.time, other.time);
    }
}

class Solution {
    public int solution(int[] food_times, long k) {
        // ��ü ������ �Դ� �ð����� k�� ũ�ų� ���ٸ� -1
        long summary = 0;
        for (int i = 0; i < food_times.length; i++) {
            summary += food_times[i];
        }
        if (summary <= k) return -1;

        // �ð��� ���� ���ĺ��� ���� �ϹǷ� �켱���� ť�� �̿�
        PriorityQueue<Food> pq = new PriorityQueue<>();
        for (int i = 0; i < food_times.length; i++) {
            // (���� �ð�, ���� ��ȣ) ���·� �켱���� ť�� ����
            pq.offer(new Food(food_times[i], i + 1));
        }

        summary = 0; // �Ա� ���� ����� �ð�
        long previous = 0; // ������ �� ���� ���� �ð�
        long length = food_times.length; // ���� ������ ����

        // summary + (������ ���� �ð� - ���� ���� �ð�) * ���� ���� ������ k ��
        while (summary + ((pq.peek().getTime() - previous) * length) <= k) {
            int now = pq.poll().getTime();
            summary += (now - previous) * length;
            length -= 1; // �� ���� ���� ����
            previous = now; // ���� ���� �ð� �缳��
        }

        // ���� ���� �߿��� �� ��° �������� Ȯ���Ͽ� ���
        ArrayList<Food> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }
        // ������ ��ȣ �������� ����
        Collections.sort(result, new Comparator<Food>() { 
            @Override
            public int compare(Food a, Food b) {
                return Integer.compare(a.getIndex(), b.getIndex());
            }
        });
        return result.get((int) ((k - summary) % length)).getIndex();
    }
}