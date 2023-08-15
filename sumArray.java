import java.util.*;
import java.util.Scanner;
class demo
{
    int sum = 0;
    int ArraySize;
    int sumOfArray(int[] arr)
    {
        ArraySize = arr.length;
        for(int j=0;j<ArraySize;j++)
        {
            sum = sum+arr[j];
        }
        return sum;
    }
}
public class sumArray {
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
        int iRet = dobj.sumOfArray(arr);
        System.out.println("The sum of Array ="+iRet);
    }
}
