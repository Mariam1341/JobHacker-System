//2-Write a program that prints out all the numbers between 1 and 100 that are divisible by 3.

import java.util.*;
public class divisibleThree {
    public static ArrayList divisibleByThree (){
        ArrayList res = new ArrayList();

        int j = 0;
        for (int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                res.add(i);
                j++;
            }
        }
        
        return res;
    }

    public static void main(String[] args){

        System.out.println("All the numbers between 1 and 100 that are divisible by 3 are : ");

        ArrayList arr = new ArrayList();

        arr =  divisibleByThree();

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

    }
}
