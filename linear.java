 class Linear
 {
    public static int linearSearch(int[] arr, int target)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] numbers = {5, 3, 7, 1, 9, 2};
        int target = 1;
        int result = linearSearch(numbers, target);
        if (result != -1)
        {
            System.out.println("Element found at index: " + result);
        } else
        {
            System.out.println("Element not found in the array.");
        }
    }
}
