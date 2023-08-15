import java.util.*;
import java.util.Scanner;
class demo
{
    void display(int[] arr)
    {
        int size = arr.length; 
        //int[] reverse = new int[size];
        int i=0;
        int j=size-1;
        int temp;
        while(i<j)
        {
            temp = arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("The reverse Array=");
        for(int k=0;k<size;k++)
        {
            System.out.print(arr[k]+" ");
        }
       // System.out.println(size);
       
    }
}
public class reverseArray {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter the array size");
        int arrSize = sobj.nextInt();
        int[] arr = new int[arrSize];
        System.out.println("Enter the"+arrSize+"Numbers");
        for(int i=0;i<arrSize;i++)
        {
            arr[i] =sobj.nextInt();
        }
        demo dobj = new demo();
        dobj.display(arr);
    }
}
