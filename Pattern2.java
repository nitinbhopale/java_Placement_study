import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        for(int i=1;i<=no;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+"#");
            }
            if(i%2!=0)
                System.out.print(i+"*");
            }
           
        }
    }
