import java.util.*;
import java.util.Scanner;

public class readPrint{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int[] arr ;
        System.out.println("Enter the array size");
        int arrSize = sobj.nextInt();
        arr = new int[arrSize];
        for(int i=0;i<arrSize;i++)
        {

            arr[i] = sobj.nextInt();
        }
        System.out.println("The Array ");
        for(int j=0;j<arrSize;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}