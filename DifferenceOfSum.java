import java.util.Scanner;

public class DifferenceOfSum {
    public static int Dif(int m, int n){
        int sum_d = 0;
        for(int i = 1; i <= m;i++){
            if (i % n == 0)
            {
                sum_d = sum_d + i;
            }
        }

        int sum_not = 0;

        for(int i = 1; i <= m;i++){
            if(i % n != 0)
            {
                sum_not = sum_not + i;
            }
        }

        int dif = Math.abs(sum_not - sum_d);

        return dif;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.print(Dif(m,n));
        
    }
}
