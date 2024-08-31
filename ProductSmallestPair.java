import java.util.Arrays;
import java.util.Scanner;

public class ProductSmallestPair {
    public static int ProductSmallestPair_(int arr[],int sum,int n){
        Arrays.sort(arr);
        
        if(arr[0] + arr[1] <= sum){
            return arr[0] * arr[1];
        }
        if(n < 2){
            return -1;
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int[] arr =  new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(ProductSmallestPair_(arr,sum,n));
    }
    
}
