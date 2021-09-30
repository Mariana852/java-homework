package ClassAge;

public class SmallestNumber
{
    public static void main(String[] args)
    {

        int [] arr = new int [] {25, 11, 7, 75, 56, 100, 16};
        int min = arr[0];
        for (int j : arr) {
            if (j < min)
                min = j;
        }
        System.out.println("Smallest element: " + min);
    }
}
