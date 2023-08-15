import java.util.*;
import java.util.Scanner;
class demo
{
    int NoEven=0;
    int NoOdd=0;
    void display(int[] arr)
    {
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]%2==0)
                NoEven++;
            else 
                NoOdd++;   
        }
        System.out.println("No of Odd="+NoOdd);
        System.out.println("No of Even="+NoEven);
    }
}
public class noEvenOdd {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int arrSize;
        System.out.println("Enter the Array Size");
        arrSize = sobj.nextInt();
        System.out.println("Enter "+arrSize+ " Elements");
        int[] arr = new int[arrSize];
        for(int i=0;i<arrSize;i++)
        {
            arr[i] = sobj.nextInt();
        }
        demo dobj = new demo();
        dobj.display(arr);
    }
}
