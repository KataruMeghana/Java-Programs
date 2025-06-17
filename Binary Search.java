public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // target found
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedNumbers = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int result = binarySearch(sortedNumbers, target);

        if (result == -1) {
            System.out.println("Element " + target + " not found in the array.");
        } else {
            System.out.println("Element " + target + " found at index " + result + ".");
        }
    }
}
