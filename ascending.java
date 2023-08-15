import java.util.*;
import java.util.Scanner;
class demo{
    void display(int arr[])
    {
        int no ;
        int no2;
        for(int i=0;i<arr.length;i++)
        {
            no = arr[i];
            for(int j=0;j<arr.length;j++)
            {
                if(no>arr[j+1])
                {
                    arr[i] = arr[j+1];
                    arr[j+1] = no;
                }
            }
        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
public class ascending {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter the array size");
        int no = sobj.nextInt();
        int [] arr = new int[no];
        for(int i=0;i<no;i++)
        {
            arr[i] = sobj.nextInt();
        }
        demo dobj = new demo();
        dobj.display(arr);
    }
}
