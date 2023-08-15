import java.util.*;
import java.util.Scanner;
class demo
{
    void display(int[] arr1, int[] arr2)
    {
        int[] arr3 = new int[arr1.length+arr2.length];
        for(int i=0;i<arr3.length;i++)
        {
            arr3[i] = arr1[i];
            if(i==arr1.length-1)
                break;
        }
        int j=0;
        for(int i=arr1.length;i<arr3.length;i++)
        {
            arr3[i] = arr2[j];
            j++; 
        }
        System.out.println("the array=");
        for(int k=0;k<arr3.length;k++)
        {
            System.out.print(arr3[k]+" ");
        }
    }
}
public class mergeArray {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the First Array Size");
        int arrSize = sobj.nextInt();
        int [] arr1 = new int[arrSize];
        System.out.println("Enter the Second Array Size");
        arrSize = sobj.nextInt();
        int [] arr2 = new int[arrSize];
        System.out.println("Enter "+arr1.length+" Numbers");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i] = sobj.nextInt();
            
        }
        System.out.println("Enter "+arr2.length+" numbers");
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i] = sobj.nextInt();
        }
        demo dobj = new demo();
        dobj.display(arr1, arr2);
    }
}
