class demo{
    void display(int[] arr,  int s )
    {
        //int sum = s;
        int arrSum = 0;
        int iPos = 0;
        int jPos = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arrSum = arr[i] + arr[j];
                if(arrSum == s)
                {
                    jPos = j+1;
                    break;
                }
            }
            if(arrSum==s){
                iPos = i+1;
                break;
            }
        }
        System.out.println(iPos + " "+jPos);

    }
}
public class Position {
    public static void main(String[] args) {
        demo dobj = new demo();
        int arr[] = {10,20,30,40,50};
        int n = 80;
        dobj.display(arr, n);
    }
}
