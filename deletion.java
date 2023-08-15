import java.util.*;
import java.util.Scanner;
class demo{
    void display(int[] arr,  int n)
    {
        if(n>arr.length)
        {
            System.out.println("this position is not in array");
        } 
        else 
        {
            for(int i=0;i<arr.length;i++)
            {
                if((n-1)==i)
                {
                    for(int j=i;j<arr.length-1;j++)
                    {
                        arr[j-1] = arr[j+1];
                    }
                }
            }
        }
        System.out.println("The array=");
        for(int x=0;x<arr.length;x++)
        {
            System.out.print(arr[x]+" ");
        }
    }
}
public class deletion {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int arrSize = sobj.nextInt();

        System.out.println("Enter the "+arrSize+ " Numbers");
        int[] arr = new int[arrSize];
        for(int i=0;i<arrSize;i++)
        {
            arr[i] = sobj.nextInt();
        }
        System.out.println("enter which position no you want to delet");
        int n = sobj.nextInt();
        demo dobj = new demo();
        dobj.display(arr,n);
    }
}
