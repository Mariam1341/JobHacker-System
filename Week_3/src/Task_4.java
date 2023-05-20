//Task 4:  write a program that extracts the minimum and maximum of the elements of an array of 1000 element.
import java.util.Random;
import java.util.Arrays;

public class Task_4 {
    public static int max(int arr[]){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static int min(int arr[]){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = new int[1000];

        Random rand = new Random();
        for(int i = 0; i < 1000; i++){
            arr[i] = rand.nextInt(100000);
        }

//        Arrays.sort(arr);
//        System.out.println("Max = "+ arr[arr.length -1] + " Min = " + arr[0]);

        System.out.println("Max = "+ max(arr) + " Min = " + min(arr));

    }
}
