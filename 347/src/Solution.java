import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){ map.put(i, map.getOrDefault(i, 0) + 1); }

        Queue<Integer> maxheap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for(int key : map.keySet()){ maxheap.add(key); }

        int ans[] = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = maxheap.poll();
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] intArray = new int[]{ 1,1,1,2,2,3 };
        solution.topKFrequent(intArray,1);
    }
}
