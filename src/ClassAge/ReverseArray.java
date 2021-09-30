package ClassAge;

import java.util.Arrays;

class ReverseArray {
    public static void main(String[] args)
    {
        int [] arr = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] reversedArray = reverse(arr);

        System.out.println(Arrays.toString(reversedArray));
    }

    public static int[] reverse(int[] data)
    {
        int left = 0;
        int right = data.length - 1;

        while( left < right ) {
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;

            left++;
            right--;
        }
        return data;
    }
}