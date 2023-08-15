import java.util.*;
import java.util.Scanner;
class demo{
    void inserted(int[] arr, int n)
    {
        arr[arr.length-1] = n;
        System.out.println("The Array =");
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j] + " ");
        }
    }
}
public class insertion {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the array size");
        int arrSize = sobj.nextInt();
        int[] arr = new int[arrSize+1];
        for(int i=0;i<arrSize;i++)
        {
            arr[i] = sobj.nextInt();
        }
        System.out.println("Enter the number you want to inserted");
        int n = sobj.nextInt();
        demo dobj = new demo();
        dobj.inserted(arr, n);

    }
}
