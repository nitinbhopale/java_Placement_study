import java.util.*;
import java.util.Scanner;
class demo{
    void ArraySort(int[] arr)
    {
        int zeroCnt = 0;
        int oneCnt = 0;
        int twoCnt = 0;
        int [] brr = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
                zeroCnt++;
            else if(arr[i]==1)
                oneCnt++;
            else 
                twoCnt++;
        }
        int x = 0;
        int y = zeroCnt;
        int z = zeroCnt+oneCnt;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==0)
            {
                brr[x] = arr[j];
                x++;
            } 
            else if(arr[j]==1)
            {
                brr[y] = arr[j];
                y++;
            } else {
                brr[z] = arr[j];
                z++;
            }
        }
        for(int a = 0; a<brr.length;a++)
        {
            System.out.print(brr[a]);
        }
    }
}
public class SortingArray {
    public static void main(String args[])
    {
        int[] array = {0,1,0,2,1,0,2};
        demo dobj = new demo();
        dobj.ArraySort(array);
    }
}
