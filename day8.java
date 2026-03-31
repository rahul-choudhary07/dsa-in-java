// chapter wise  question in java  

// chapter  1  intro to java  

// question 1

// import  java.util.*;
//    public  class  day8{
//       public static void main(String[]args){
//         System.out.println("Hello world");
//       }
//    }

//   question 2

//     import java.util.*;
//       public class  day8{
//         public static  void  main(String[]args){

//             System.out.println("rahul kumar choudhary");
//  System.out.println("electrical ennggg.");
//         }
//       }

// question 3  

//  import  java.util.*;
//   public class day8{
//     public static void main(String[]args){
//       for(int  i = 0; i<=20; i++){

//         System.out.println(i);
//       }

//     }
//   }

// question 4 

//  import  java.util.*;
//   public class day8{
//     public static void main(String[]args){
//        for(int i =20; i>=1 ; i--){

//         System.out.println(i);
//        }
//     }
//   }

// qustion 5

// import java.util.*;

// public class day8 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 50; i++) {
//             if (i % 2 == 0) {
//                 System.out.println(i);
//             }
//         }

//     }
// }

// question 6 

// import  java.util.*;
//  public class  day8{
//     public static void main(String[]args){
//         for(int i = 1; i<=50; i++){
//             if(i%2!=0){
//                 System.out.println(i);
//             }
//         }
//     }
//  }

// question 7 

// import java.util.*;

// public class day8 {
//     public static void main(String[] args) {
//         int sum = 0;
//         for (int i = 1; i <= 100; i++) {

//             sum += i;
//             System.out.println(sum);
//         }
//     }
// }

// question 8 
// import java.util.*;

// public class day8 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(i * 5);
//         }
//     }
// }

// question 9 
// import java.util.*;

// public class day8 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(i * i);
//         }
//     }
// }

// question 10 

// import java.util.*;
//  public class day8{
//     public static void main(String[]args){
//         for(int i =1; i<=50;i++){
//              if(i%5!=0){
//                 System.out.println(i);
//              }
//         }
//     }
//  }

// chapter  2  varibles  and  data types 

// question 1
// import java.util.*;

// public class day8 {
//     public static void main(String[] args) {
//         int a = 2;
//         double deci = 3.19;
//         String name = "rahul";
//         boolean is = true;
//         float dec = (float) 3.3;
//     }
// }

// question 2

// import java.util.*;

// public class day8 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         System.out.println(age);

//     }
// }

// question 3  
// import java.util.*;

// public class day8 {
//     public static void main(String[] args) {

//         int a = 23;
//         int b = 34;

//         System.out.println(a);
//         System.out.println(b);

//     }
// }

// question 4 

// import java.util.*;

// public class day8 {
//     public static void main(String[] args) {
//         // for imput in java
//         int sum = 1;
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         // for output

//         for (int i = 1; i <= a; i++) {
//             sum += i;
//             System.out.println(sum);
//         }
//     }
// }

// question 6

// import java.util.*;

// public class day8 {
//     public static void main(String[] args) {
//         // for input

//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         // for output in java
//         int avg = a + b + c;
//         int avgg = avg / 3;

//         System.out.println(avgg);
//     }
// }

// question 7 

// import java.util.*;

// public class day8 {
//     public static void main(String[] args) {
//         // for input in java

//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();

//         // for output in java
//         double pI = 3.14;
//         int aOc = 2 * r;
//         double aOC = aOc * pI;
//         System.out.println(aOC);

//     }
// }

// question 8 

// import java.util.*;

// public class day8 {
//     public static void main(String[] args) {
//         // for input in java

//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int d = sc.nextInt();
//         int e = sc.nextInt();

//         // for output in java

//         int total = (a + b + c + d + e);
//         double perr = (total / 500.0) * 100;

//         System.out.println(perr);

//     }
// }

// questions  10 

// import java.util.*;

// public class day8 {
//     public static void main(String[] args) {
//         // for input in java

//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         // for output

//         double ans = a * 33.5;

//         System.out.println(ans);
//     }
// }

// chapter  3  input and output

// question 1 

// import java.util.*;

// public class day8 {
//     public static void main(String[] args) {
//         // for input in java
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         // for output

//         System.out.println("hii");

//     }
// }

// question 2 

// import java.util.*;

// public class day8 {
//     public static void main(String[] args) {
//         // for input

//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         // for output in java

//         System.out.println(a + b);

//     }
// }

// question 

// import java.util.*;

// public class day8 {
//     public static void main(String[] args) {
//         // for input

//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         // for output

//         System.out.println(a % 10);
//     }
// }

// chapter  4  conditional statement  

// import java.util.*;

// public class day8 {
//     public static void main(String[] args) {
//         // for input

//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         // for output

//         if (a % 2 == 0) {
//             System.out.println("even");
//         } else {
//             System.out.println("odd");
//         }
//     }
// }

// question 2 in java

// import java.util.*;

// public class day8 {
//     public static void main(String[] args) {
//         // for input in java

//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         // for output in java

//         if (a > 0) {
//             System.out.println("positive");
//         } else if (a < 0) {
//             System.out.println("negative");
//         } else {
//             System.out.println("zero");
//         }

//     }
// }

// questions 3 

// import java.util.*;

// public class day8 {
//     public static void main(String[] args) {
//         // for input in java

//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         // for output

//         if (a > b) {
//             System.out.println(a);
//         } else {
//             System.out.println(b);
//         }
//     }
// }

// question 4 

// import java.util.*;

// public class day8 {
//     public static void main(String[] args) {
//         // for input in java
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         // for output in java

//         if (a > b && a > c) {
//             System.out.println(a);
//         } else if (b > c) {
//             System.out.println(b);
//         } else {
//             System.out.println(c);
//         }
//     }
// }