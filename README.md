### Laboratory 1

- [Laboratory 1](#содержание)
- [Task 1: Finding the minimum among N integers ](#task-1)
- [Task 2: Calculating the average value of N integers ](#task-2)
- [Task 3: Checking the number for simplicity ](#task-3)
- [Task 4: Calculating the factorial of the number N ](#task-4)
- [Task 5: Calculating the Fibonacci number ](#task-5)
- [Task 6: Raising the number a to the power of n ](#task-6)
- [Task 7: Reversal of an array of integers ](#task-7)
- [Task 8: Checking the string for numbers only ](#task-8)
- [Task 9: Calculation of the binomial coefficient C(n, k)](#task-9)
- [Task 10: Calculation of the greatest common divisor (GCD) ](#task-10)

---

### Task 1: 
```java
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void task1() {
    
        int n = scan.nextInt(); //read an integer n
        int mn = Integer.MAX_VALUE; //get the maximum number for find min value
        for (int i = 0; i < n; i++) { // using for loop 
            int a = scan.nextInt(); //entering array elements
            if (mn>a) { //condition for comparing array elements with a maximum number
                mn = a;
            }
        }

        System.out.println(mn); //our minimum number
    }
```


### Task 2: 
```java
import java.util.Scanner;
public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void task2() {
        
        int n = scan.nextInt(); //read an integer n
        float s = 0; //empty variable for collecting sum

        for (int i = 0; i < n; i++) { // 'for' loop for find sum
            int a = scan.nextInt(); //array element
            s += a; //summa
        }

        System.out.println(s/n); // our average value
    }
}

```

### Task 3: 

```java
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void task3() {
       
        int n = scan.nextInt(),s=0; //read an integer 

        if (n == 1) { //if the number is equal to or less than 1, it is not a prime number
            s=0;
        }
        else{ //otherwise
            for (int i = 2; i <= n; i++) { //loop to divide by all the numbers up to that number
            if (n % i == 0) {
                s=1;
                break; //if there is a divisible number the loop stops
            }
        }
        }
        

        if (s==0) { //in the end our solution
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

}

```

### Task 4: 

```java
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void task4() {
        int n = scan.nextInt(); // read an integer
        int fact = factorial(n); //called the function
        System.out.println(fact); //solution
    }

    private static int factorial(int n) { //recursive function
        if (n == 0 || n == 1) { //set the last condition and indicated the time when the recursion stops
            return 1;
        }
        return n * factorial(n - 1); //an operation that is repeated until the condition is met
    }
}

```

### Task 5: 

```java
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void task5() {
        
        int n = scan.nextInt(); //read an integer
        int fib = Fibonacci(n); //called the function
        System.out.println(fib); //solution
    }

    public static int Fibonacci(int n) {//recursive function
        if (n == 0 || n == 1) {//set the last condition and indicated the time when the recursion stops
            return n;
        }
        else{
            return Fibonacci(n - 1) + Fibonacci(n - 2); //an operation that is repeated until the condition is met
        }
        
    }
}

```

### Task 6: 

```java
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void task6() {
    
        int a = scan.nextInt(), n = scan.nextInt(),s=1; //read an integers n, a and empty set
        for(int i=0;i<n;i++){ // loop for find multiplication
            s*=a; //s=s*a  
        }
        System.out.println(s); //solution
    }
}

```

### Task 7: 

```java
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void task7() {
    
        int n = scan.nextInt(); //read an integer n
        int[] arr = new int[n]; //creat array

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt(); //include each element an array
        }

        reversearr(arr,0,n-1); //called the function
        System.out.println("reversed array:"); //solution
        for(int i=0; i<n; i++){ //loop for print each element an array
            System.out.print(arr[i]+" ");
        }
    }

    public static void reversearr(int[] arr, int start, int end){ //recursive function
        if(start>=end)  return; //set the last condition and indicated the time when the recursion return
        else{ //sswitch case
            int t=arr[start];
            arr[start]=arr[end];
            arr[end]=t;
            reversearr(arr, start+1, end-1); //recursive
        }
    }
}

```

### Task 8: 

```java
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static boolean digit(String s, int index){ //boolean type function
        if (index == s.length()) {
            return true; //final condition
        }
        char c = s.charAt(index); //each element string
        if (Character.isDigit(c)) { //check isdigit operation
            return digit(s, index + 1); //an operation that is repeated until the condition is met
        }
        else {
            return false; //final condition
        }
    }
    public static void task8() {
        String s = scan.next(); //read string s
        if (s == null || s.isEmpty()) { 
            System.out.println("NO");
        }
        else{
            if (digit(s, 0)) { //condition called of function
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

```

### Task 9:

```java
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static int bincof(int n, int k) { //recursive function
        if (k == 0 || n == k) { //set the last condition and indicated the time when the recursion stops 
            return 1;
        }
        else{
            return bincof(n-1,k-1)+bincof(n-1,k); //an operation that is repeated until the condition is met
        }
    }

    public static void task9(){
        int n = scan.nextInt(), k= scan.nextInt(); //read an integer n,k
        System.out.println(bincof(n,k)); //solution
    }
}

```

### Task 10: 

```java
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static int gcd(int a, int b){//recursive function
        if(b==0){ //set the last condition and indicated the time when the recursion stops
            return a;
        }
        else{
            return gcd(b,a%b); //an operation that is repeated until the condition is met
        }
    }
    public static void task10(){
        int a = scan.nextInt(), b= scan.nextInt(); //read an integers a,b
        System.out.println(gcd(a,b)); //solution
    }
}
```
