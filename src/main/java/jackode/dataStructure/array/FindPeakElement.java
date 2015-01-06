package jackode.dataStructure.array;

/**
 * Created by liujiankang on 1/3/15.
 * A peak element is an element that is greater than its neighbors.
 * <p/>
 * Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.
 * <p/>
 * The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
 * <p/>
 * You may imagine that num[-1] = num[n] = -∞.
 * <p/>
 * For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
 */
public class FindPeakElement {

    public int findPeakElement(int[] num) {
        int low = 0;
        int high = num.length - 1;
        while (low < high) {
            int mid1 = (low + high) / 2;
            int mid2 = mid1 + 1;
            if (num[mid1] < num[mid2])
                low = mid2;
            else
                high = mid1;
        }
        return low;
    }
}
