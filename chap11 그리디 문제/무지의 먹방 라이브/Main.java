
class Solution {
    public int solution(int[] food_times, long k) {
        int answer = 0;
        int sum = 0;
        int temp = 0;
        for(int i=0; i<food_times.length; i++){
            sum += food_times[i];
        }
        for(int i=0; i<sum; i++){
            temp = temp%food_times.length;
            while(food_times[temp] == 0) {
            	temp = (temp+1) % food_times.length;
            }
            food_times[temp]--;
            temp++;
            if(i==k) {
            	answer = temp;
            }
            
        }
        if(answer==0) answer = -1;
        return answer;
    }
}