
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
            case 5:
                task5();
                break;
            case 6:
                task6();
                break;
            case 7:
                task7();
                break;
            case 8:
                task8();
                break;
            case 9:
                task9();
                break;
            case 10:
                task10();
                break;
        }
        //the time complexity remains constant, O(1).
    }

    public static void task1(){
        int n = scan.nextInt();
        int mn = Integer.MAX_VALUE;
        for(int i=1; i<n+1; i++){
            int a = scan.nextInt();
            if (mn>a) mn=a;}
        System.out.println(mn);
        //It reads 'n' integers and finds the minimum among them.
        // The time complexity is O(n) since it involves a loop iterating over 'n' elements.
    }

    public static void task2(){
        int n = scan.nextInt();
        float s = 0;
        for(int i=0;i<n;i++){
            int a = scan.nextInt();
            s+=a;
        }
        System.out.println(s/n);
        //Again, it has a time complexity of O(n) due to the loop.
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
        //The time complexity is O(n) in the worst case because it iterates up to 'n' to check for factors.
    }
    public static int factorial(int n){
        if(n==0||n==1) return 1;
        else{
            return n*factorial(n-1);
        }
        //The time complexity is O(n) because it calls itself recursively 'n' times.
    }
    public static void task4(){
        int n = scan.nextInt();
        int fact=factorial(n);
        System.out.println(fact);
    }
    public static int Fibonacci(int n){
        if(n==0||n==1) return n;
        else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
        //The time complexity of O(2^n) because each call branches into two recursive calls, leading to exponential growth.
    }
    public static void task5(){
        int n = scan.nextInt();
        int fib=Fibonacci(n);
        System.out.println(fib);
        //Calls Fibonacci(), so its time complexity is the same, O(2^n).
    }
    public static void task6(){
        int a = scan.nextInt(), n = scan.nextInt(), s=1;
        for(int i=0;i<n;i++){
            s*=a;
        }
        System.out.println(s);
        //The time complexity is O(n) since it involves a loop iterating 'n' times.
    }
    public static void reversearr(int[] arr, int start, int end){
        if(start>=end)  return;
        else{
            int t=arr[start];
            arr[start]=arr[end];
            arr[end]=t;
            reversearr(arr, start+1, end-1);
        }
        //The time complexity is O(n) because it iterates through half of the array swapping elements.
    }
    public static void task7(){
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        reversearr(arr,0, n-1);
        System.out.println("reversed array:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static boolean digit(String s, int index){
        if (index == s.length()) {
            return true;
        }
        char c = s.charAt(index);
        if (Character.isDigit(c)) {
            return digit(s, index + 1);
        }
        else {
            return false;
        }
        //The time complexity is O(n) where 'n' is the length of the string.
    }
    public static void task8() {
        String s = scan.next();
        if (s == null || s.isEmpty()) {
            System.out.println("NO");
        }
        else{
            if (digit(s, 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        //Calls digit(), so its time complexity is O(n) where 'n' is the length of the input string.
    }
    public static int bincof(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        }
        else{
            return bincof(n-1,k-1)+bincof(n-1,k);
        }
        //The time complexity is exponential, approximately O(2^n), as it performs redundant calculations.
    }

    public static void task9(){
        int n = scan.nextInt(), k= scan.nextInt();
        System.out.println(bincof(n,k));
        //Calls bincof(), so its time complexity is also exponential, approximately O(2^n).
    }
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
        //The time complexity is O(log(min(a, b))) using the Euclidean algorithm.
    }
    public static void task10(){
        int a = scan.nextInt(), b= scan.nextInt();
        System.out.println(gcd(a,b));
        //Calls gcd(), so its time complexity is the same as gcd(), O(log(min(a, b))).
    }
}