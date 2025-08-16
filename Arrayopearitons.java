 class Arrayoperations
 {

    // 1) Access element at given index
    public static int access(int[] arr, int index)
    {
        if (index < 0 || index >= arr.length)
        {
            System.out.println("Index out of bounds");
            return -1;
        }
        return arr[index];
    }

    // 2a) Insert element at start
    public static int[] insertAtStart(int[] arr, int value)
    {
        int[] newArr = new int[arr.length + 1];
        newArr[0] = value;
        for (int i = 0; i < arr.length; i++)
        {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    // 2b) Insert element at end
    public static int[] insertAtEnd(int[] arr, int value)
    {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++)
        {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = value;
        return newArr;
    }

    // 3a) Delete element at start
    public static int[] deleteAtStart(int[] arr)
    {
        if (arr.length == 0)
        {
            System.out.println("Array is empty, cannot delete");
            return arr;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++)
        {
            newArr[i - 1] = arr[i];
        }
        return newArr;
    }

    // 3b) Delete element at end
    public static int[] deleteAtEnd(int[] arr)
    {
        if (arr.length == 0)
        {
            System.out.println("Array is empty, cannot delete");
            return arr;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++)
        {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    // Helper method to print array
    public static void printArray(int[] arr)
    {
        for (int val : arr)
        {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40};

        System.out.println("Original array:");
        printArray(arr);

        // 1) Access element at index 2
        int index = 2;
        System.out.println("Access element at index " + index + ": " + access(arr, index));

        // 2) Insert at start
        arr = insertAtStart(arr, 5);
        System.out.println("After insertion at start (5):");
        printArray(arr);

        // Insert at end
        arr = insertAtEnd(arr, 50);
        System.out.println("After insertion at end (50):");
        printArray(arr);

        // 3) Delete at start
        arr = deleteAtStart(arr);
        System.out.println("After deletion at start:");
        printArray(arr);

        // Delete at end
        arr = deleteAtEnd(arr);
        System.out.println("After deletion at end:");
        printArray(arr);
    }
}
