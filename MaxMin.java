import java.util.*;
import java.util.Scanner;
class demo
{
    int arraySize;
    int Min,Max;
    int Mini(int[] arr)
    {
        arraySize  = arr.length;
        Min = arr[0];
        for(int j=1;j<arraySize;j++)
        {
            if(arr[j]<Min)
            {
                Min = arr[j];
            }
        }
        return Min;
    }
    int Maximum(int[] arr)
    {
        arraySize  = arr.length;
        Max = arr[0];
        for(int j=1;j<arraySize;j++)
        {
            if(arr[j]>Max)
            {
                Max = arr[j];
            }
        }
        return Max;
    }
}
public class MaxMin {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int arrSize;
        System.out.println("Enter the array size");
        arrSize = sobj.nextInt();
        int[] arr = new int[arrSize];
        System.out.println("Enter the "+arrSize+" Numbers");
        for(int i=0;i<arrSize;i++)
        {
            arr[i] = sobj.nextInt();
        }
        demo dobj = new demo();
        int iRet = dobj.Mini(arr);
        System.out.println("The minimum number ="+iRet);
        iRet = dobj.Maximum(arr);
        System.out.println("The Maximum number ="+iRet);
    }
}
