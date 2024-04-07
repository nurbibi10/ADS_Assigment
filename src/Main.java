
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello ");
        System.out.println("Enter task number: ");
        int task = scan.nextInt();
        switch (task) {
            case 1:
                task1();
                break;
        }
    }

    public static void task1(){
        int n = scan.nextInt(), min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int a = scan.nextInt();
            if (min>a) min=a;
        }
        System.out.println(min);
    }
}