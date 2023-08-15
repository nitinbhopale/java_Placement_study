import java.util.*;
import java.util.Scanner;
class demo
{
    int max;
    int index;
    void display(int[] arr)
    {
        max = arr[0];
        index = 0;
        for(int j=1;j<arr.length;j++)
        {
            if(max<arr[j])
            {
                max = arr[j];
                index = j;
            }
        }
        arr[index] = -1;
        max = arr[0];
        for(int k=1;k<arr.length;k++)
        {
            if(max<arr[k])
            {
                max = arr[k];
            }
        }
        System.out.println("second Max="+max);
        //System.out.println(max+"  "+index);
    }

}
public class secLarge {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int arrSize ;
        System.out.println("enter the array size");
        arrSize = sobj.nextInt();
        System.out.println("Enter "+arrSize+" Numbers");
        int[] arr = new int[arrSize];
        for(int i=0;i<arrSize;i++)
        {
            arr[i] = sobj.nextInt();
        }
        demo dobj = new demo();
        dobj.display(arr);
    }
}
