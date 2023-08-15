import java.util.*;
import java.util.Scanner;
class demo
{
    void display(int[] arr)
    {
        int[] evenArr = new int[arr.length];
        int[] oddArr = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {

                evenArr[i] = arr[i];
            } else 
            {
                oddArr[i] = arr[i];
            }
        }
        System.out.println("The Even Array");
        for(int k=0;k<evenArr.length;k++)
        {
            System.out.print(evenArr[k]);
        }
        System.out.println("The Odd Array");
        for(int k=0;k<oddArr.length;k++)
        {
            System.out.print(oddArr[k]);
        }
        

    }
}
public class oddEven {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int arrSize = sobj.nextInt();
        System.out.println("Enter the "+ arrSize+ " numbers");
        int [] arr = new int[arrSize];
        for(int i=0;i<arrSize;i++)
        {
            arr[i] = sobj.nextInt();
        }
        demo dobj = new demo();
        dobj.display(arr);
    }
}
