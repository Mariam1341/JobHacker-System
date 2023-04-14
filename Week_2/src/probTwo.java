//2-Write a program that prints out all the numbers between 1 and 100 that are divisible by 3.
public class probTwo {
    public static int[] divisibleByThree (){

        int j = 0;
        int[] result = new int[33];

        for (int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                result [j] = i;
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args){

        System.out.println("All the numbers between 1 and 100 that are divisible by 3 are : ");

        int[] arr =  divisibleByThree();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
