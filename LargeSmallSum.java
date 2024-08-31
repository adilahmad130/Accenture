
import java.util.Arrays;
import java.util.Scanner;

public class LargeSmallSum {
    public static int LargeSmallSum_(int arr[]){
        int evenSize = (arr.length + 1) / 2;  
        int oddSize = arr.length / 2; 

        int[] arr_even = new int[evenSize];
        int[] arr_odd = new int[oddSize];

        int evenIndex = 0;
        int oddIndex = 0;

        for(int i = 0; i < arr.length; i++){
            if(i%2 == 0){
                arr_even[evenIndex++] = arr[i];
            }
            else{
                arr_odd[oddIndex++] = arr[i];
            }
        }
        Arrays.sort(arr_even);
        Arrays.sort(arr_odd);

        int sum = 0;

        sum = arr_even[arr_even.length-2] + arr_odd[1];

        if(arr.length <= 3 ){
            return 0;
        }

        return sum;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(LargeSmallSum_(arr));
    }
}
