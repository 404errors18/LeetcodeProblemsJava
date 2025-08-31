package leetcode.medium;

public class P852_PeakIndexInAMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (mid == 0) {
                left++;
                continue;
            } else if (mid == arr.length) {
                right--;
                continue;
            }

            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            } else if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
