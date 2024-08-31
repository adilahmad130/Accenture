import java.util.Scanner;

public class findCount {
    public static int findCount(int arr[],int length, int num, int diff){
        int count = 0;
        for(int i = 0 ; i < length; i++){
            if(Math.abs(arr[i] - num) <= 2){
                count= count +1;
            }
        }
        if(count == 0){
            return -1;
        }

        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int num = sc.nextInt();
        int diff = sc.nextInt();
        int[] arr = new int[length];
        
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findCount(arr,length,num,diff));

    }
}
