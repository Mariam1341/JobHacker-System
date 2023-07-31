import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        for (int i = 0; i < T; i++) {
            int Q = input.nextInt();

            for (int j = 0; j < Q; j++) {
                String type = input.next();

                switch (type){
                    case "a":
                        set.add(input.nextInt());
                        break;
                    case "b":
                        Iterator<Integer> itr =  set.iterator();
                        while (itr.hasNext()){
                            System.out.print(itr.next());
                        }
                        System.out.println();
                        break;
                    case "c":
                        set.remove(input.nextInt());
                        break;
                    case "d":
                        if(set.contains(input.nextInt()))
                            System.out.println(1);
                        else
                            System.out.println(-1);
                        break;
                    case "e":
                        System.out.println(set.size());
                        break;
                    default:
                        System.out.println("Enter a valid operation");
                }

            }
        }
    }

}