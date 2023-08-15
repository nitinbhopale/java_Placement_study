import java.util.*;
import java.util.Scanner;
class demo{
    int count=0;
    int negative(int[] arr)
    {
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]<0)
                count++;
        }
        return count;
    }
}
public class noNegative {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int arrSize ;
        System.out.println("Enter the array size");
        arrSize = sobj.nextInt();
        System.out.println("Enter the "+ arrSize +" Numbers");
        int[] arr = new int[arrSize];
        for(int i=0;i<arrSize;i++)
        {
            arr[i] = sobj.nextInt();
        }
        demo dobj = new demo();
        int iRet = dobj.negative(arr);
        System.out.println("The negative number count ="+iRet);
    }
}
