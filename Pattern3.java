import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        if(no<=0)
        {
            no=-no; //fillter
        }
        for(int i=1;i<=no;i++)
        {
            System.out.print(i);
        }
    }
}
