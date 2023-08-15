import java.util.*;
class demo{
    void display(int[] arr)
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
public class sort {
    public static void main(String[] args) {
        demo dobj = new demo();
        int arr[] = {1,0,2,0,1,2,0};
        dobj.display(arr);
    }
}
