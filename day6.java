// import java.util.*;

// public class day6 {

// public static void printMyName(String name) {
// System.out.println(name);
// return;

// }

// public static void main(String[] args) {
// // for user input for java

// Scanner sc = new Scanner(System.in);
// String name = sc.next();

// // function ko call kiya

// printMyName(name);
// }
// }

// funtion sum of two number

// import java.util.*;

// public class day6 {

// public static int CalculateSum(int a, int b) {

// int sum = a + b;
// return sum;

// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();

// int sum = CalculateSum(a, b);
// System.out.println(sum);

// }
// }

// make a product of two number of java

// import java.util.*;

// public class day6 {

// public static int product(int a, int b) {
// int product = a * b;
// return product;

// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();

// int product = product(a, b);
// System.out.println(product);

// }
// }

// find a factorial of a number

import java.util.*;

public class day6 {
public static void printFactorial(int n ){
// we are using loop hare
int factorial = 1;

for(int i = n; i>=1;i--){
factorial = factorial*i;

}
System.out.println(factorial);
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
printFactorial(a);
}
}

// checking  if  prime  number  or  not  

// import java.util.*;

// public class day6 {
//     public static void primeNumber(int a) {
//         if (a <= 1) {
//             System.out.println("not a prime  number");
//             return;
//         }
//         for (int i = 2; i <= Math.sqrt(a); i++) {
//             System.out.println("not prime  number");
//             return;

//         }
//         System.out.println("prime number");
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         primeNumber(a);
//     }
// }

// to print  even and  odd in java using  funtion topic 

// import java.util.*;

// public class day6 {

//     public static void evenOrOdd(int a) {

//         if (a % 2 == 0) {
//             System.out.println("Even");
//         } else {
//             System.out.println("odd");
//         }
//         return;

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         evenOrOdd(a);
//     }
// }

// make  a funtion to print a  table  of  n in java

// import java.util.*;

// public class day6 {

//   public static void printTable(int a) {

//     for (int i = 1; i <= 10; i++) {
//       int printTable = i * a;
//       System.out.println(printTable);
//     }

//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     printTable(a);
//   }
// }

// read  about  recursion in java 