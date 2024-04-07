
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
            case 2:
                task2();
                break;
            case 3:
                task3();
                break;
            case 4:
                task4();
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

    public static void task2(){
        int n = scan.nextInt();
        float s = 0;
        for(int i=0;i<n;i++){
            int a = scan.nextInt();
            s+=a;
        }
        System.out.println(s/n);
    }
    public static void task3(){
        int n = scan.nextInt(),s=0;
        if (n==1) System.out.println(n+" is not a prime number");
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    s=1;
                    break;
                }
            }
            if(s==1){
                System.out.println(n+" is not a prime number");
            }
            else{
                System.out.println(n+" is a prime number");
            }
        }
    }
    public static int factorial(int n){
        if(n==0||n==1) return 1;
        else{
            return n*factorial(n-1);
        }
    }
    public static void task4(){
        int n = scan.nextInt();
        int fact=factorial(n);
        System.out.println(fact);
    }
}