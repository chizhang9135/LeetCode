import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result;

        int lengthNewArray = nums1.length + nums2.length;
        int[] intArray = new int[lengthNewArray];
        int indexForNewArray = 0;


        for (int j : nums1) {
            intArray[indexForNewArray] = j;
            indexForNewArray++;
        }
        for (int j : nums2) {
            intArray[indexForNewArray] = j;
            indexForNewArray++;
        }

        Arrays.sort(intArray);
        if (intArray.length % 2 != 0) {
            result = intArray[intArray.length/2];
        }
        else {
            result = (intArray[intArray.length/2] + intArray[intArray.length/2 + 1])/(double)2;
        }


        return result;
    }
}
