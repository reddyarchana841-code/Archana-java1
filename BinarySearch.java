 class BinarySearch
 {
    public static int binarySearch(int[] arr, int target)
    {
        int left = 0, right = arr.length - 1;
        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int target = 8;
        int index = binarySearch(arr, target);
        System.out.println(index == -1 ? "Not found" : "Found at index " + index);
    }
}

