
// to find  a  avg of three  unmber  using  funtion 

// import java.util.*;

// public class dayy6 {

//     public static void printAverage(int a, int b, int c) {
//           int printAverage = (a+b+c)/3;
//           System.out.println(printAverage);
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         printAverage(a, b, c);
//     }
// }

// to print  sum of odd  number   in java 
// using function

// import java.util.*;

// public class dayy6 {
//     public static void sumOddNumber(int a) {
//         int sum = 0;

//         for (int i = 1; i <= a; i++) {
//             if (i % 2 != 0) {
//                 sum = sum + i;
//             }
//         }
//         System.out.println(sum);

//     }

//     public static void main(String[] args) {
//         // for input in function
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         sumOddNumber(a);
//     }
// }

// take  two number  and return greater of  those two 
// in java using  function 

// import java.util.*;

// public class dayy6 {

//     public static void printGreater(int a, int b) {
//         if (a <= b) {
//             System.out.println(b);

//         }else{
//             System.out.println(a);
//         }

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         printGreater(a, b);
//     }
// }

// Write a function that takes in the radius as
// input and returns the circumference of a circle

// import java.util.*;

// public class dayy6 {
//     public static void printCircumference(int a) {
//         double pI = 3.14;
//         double Circumference = 2 * pI * a;

//         System.out.println(Circumference);
// return;
//         // for  pi in java bult  in Math.pI hota hai 

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         // take radius as input
//         printCircumference(a);
//     }
// }

// write  a  function take age  as  input 
// return if  he  is  able  to vote or  not 

// import java.util.*;

// public class dayy6 {
//     public static void printVoting(int a) {
//         if (a < 0) {
//             System.out.println("error");
//         } else if (a >= 18) {
//             System.out.println("vote de ");
//         } else {
//             System.out.println("vote  mat  de bhai ");
//         }

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         printVoting(a);

//     }
// }

// write a infiate loop using do while  loop 

// import java.util.*;
// public class dayy6{
//     public static void main(String[]args){
//         int i = 1;

//         do{
//             System.out.println(i);
//             i++;

//         }while(true);

//     }
// }

// write   a program to user input x ,n and  find
// find  x power n 
// import java.util.*;

// public class dayy6 {
//     public static void printPower(int x, int n) {
//         int result = 1;
//         for (int i = 1; i <= n; i++) {
//             result = result * x;
//             System.out.println(result);

//         }

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int n = sc.nextInt();
//         printPower(x, n);

//     }
// }


// import java.util.Scanner;

// public class dayy6 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
      
//         int n = sc.nextInt();

//         int a = 0, b = 1;
//         for (int i = 0; i < n; i++) {
//             System.out.print(a + " ");
//             int next = a + b;
//             a = b;
//             b = next;
//         }
//     }
// }


// for  time  complexity  and  space  complexity in java



// time  complexity = how  much time  is  taken to run the code  
// space complexity  = how  much storage is  taekn in the  the  memory 


// base time  complexity = omega*n
// avg time  complexity = degreee*n+1?2
// wrost time  complexity  = O*n