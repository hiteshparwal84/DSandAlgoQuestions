package DSTopic.Arrays.easy;

public class RoatateArrayByDPlace {

    public static void main(String... args) {
        int arr[] = {2, 3, 6, 7, 8, 9};
        int d = 2;
        RoatateArrayByDPlace dPlace = new RoatateArrayByDPlace();
        dPlace.rotateFromLeft(arr, d);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);

        int arr2[] = {2, 3, 6, 7, 8, 9};
        int d2 = 2;
        System.out.println();

        dPlace.rorateFromRight(arr2, d2);
        for (int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i]);

    }

    public void reverseTheArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    /* Using reversal Algorithm time complexity O(n) space complexity O(n)*/
    public void rotateFromLeft(int arr[], int d) {

        reverseTheArray(arr, 0, d - 1);

        reverseTheArray(arr, d, arr.length - 1);

        reverseTheArray(arr, 0, arr.length - 1);

    }


    public void rorateFromRight(int arr[], int d) {

        reverseTheArray(arr, arr.length - d, arr.length - 1);

        reverseTheArray(arr, 0, arr.length - 1 - d);

        reverseTheArray(arr, 0, arr.length - 1);
    }


}
