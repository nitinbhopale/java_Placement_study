class demo{
    int display(int[] arr, int n)
    {
        int flag = 0;
        int no = 0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]==i)
                {
                    flag = 1;
                }
            }
            if(flag == 0)
            {
                no = i+1;
            }
        }
        return no;
    }
}
public class MissingNumber {
    public static void main(String[] args) {
        demo dobj = new demo();
        int arr[] ={1,2,3,5};
        int n = 5;
        int iRet = dobj.display(arr, n);
        System.out.println(iRet);
    }
}
