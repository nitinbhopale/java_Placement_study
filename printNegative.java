import java.util.*;
import java.util.Scanner;
class demo 
{
    int arraySize;
    void display(int[] arr)
    {
        arraySize = arr.length;
        for(int j=0;j<arraySize;j++)
        {
            if(arr[j]<0)
            {
                System.out.println(arr[j]);
            } 
        }
    }
}
public class printNegative {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int arrSize;
        System.out.println("Enter Array Size");
        arrSize = sobj.nextInt();
        int[] arr = new int[arrSize];
        System.out.println("Enter the "+arrSize+" Numbers");
        for(int i=0;i<arrSize;i++)
        {
            arr[i] = sobj.nextInt();
        }
        //
        demo dobj = new demo();
        System.out.println("The negative numbers =");
        dobj.display(arr);
    }
}
