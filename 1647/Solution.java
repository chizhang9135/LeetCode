import java.util.*;

public class Solution {
	public int solution(String s){
		int[] arr=new int[26];
        for(int i=0;i<s.length();i++)
        {
           arr[s.charAt(i)-'a']++;//count frequency
        }
        HashSet<Integer> freq=new HashSet<>();
        int del=0;
        for(int i=0;i<arr.length;i++)
        {
            while(arr[i]!=0 && freq.contains(arr[i]))//if set already contains that frequency then deletion is performed and frequency of that character will be reduced so arr[i]--,del++
            {
               arr[i]--;
               del++;
            }
            freq.add(arr[i]);
        }
        return del;
	}
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("aabbccdd"));
        
	}
}