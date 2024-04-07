
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
        int n = scan.nextInt();
        int mn = Integer.MAX_VALUE;
        for(int i=1; i<n+1; i++){
            int a = scan.nextInt();
            if (mn>a) mn=a;}
        System.out.println(mn);
    }
}