import java.util.Scanner;

public class Pattern1 {             // 4
    //output 1234321
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();    //no =4
        for(int i=1;i<=no;i++)  //1234321
        {
            System.out.print(i);
        }
        for(int i=no-1;i>0;i--)
        {
            System.out.print(i);
        }
    }
}
