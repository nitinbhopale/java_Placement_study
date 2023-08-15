import java.util.*;
import java.util.Scanner;
class demo{
    int[] copyArray;
    void display(int[] arr)
    {
        copyArray = new int[arr.length];
        for(int j=0;j<arr.length;j++)
        {
            copyArray[j] = arr[j]; 
        }
        System.out.println("The Users Array");
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        System.out.println("The copy Array");
        for(int l=0;l<arr.length;l++)
        {
            System.out.print(arr[l]+" ");
        }
    }
}
public class copy {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int arrSize = sobj.nextInt();
        System.out.println("Enter "+arrSize+ " numbers");
        int[] arr = new int[arrSize];
        for(int i=0;i<arrSize;i++)
        {
            arr[i] = sobj.nextInt();
        }
        demo dobj = new demo();
        dobj.display(arr);
    }
}
