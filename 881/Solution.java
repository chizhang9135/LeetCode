import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int numOfBoat = 0;
        Arrays.sort(people);
        int head = 0;
        int tail = people.length - 1;
        while (head <= tail) {
            if (people[head] + people[tail] <= limit) {
                head++;
                tail--;
            } 
            else {
                tail--;
            }
            numOfBoat++;
        }
        return numOfBoat;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] people = new int[]{3,2,2,1};
        int limit = 3;
        int result = solution.numRescueBoats(people, limit);
        System.out.println("The min num of boat is: " + result);
    }
        
}
