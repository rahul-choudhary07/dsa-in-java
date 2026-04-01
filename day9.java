// public class day9 {
// public static void main(String[] args) {
// int marks[] = new int[3];
// // marks as input in array
// marks[0] = 97;
// marks[1] = 92;
// marks[2] = 87;
// // we are using loop for 1 to 3 output in array which is optional
// for (int i = 1; i < 3; i++) {
// System.out.println(marks[i]);
// }
// }

// }

// 2nd type of writing a array in java

// import java.util.*;

// public class day9 {
// public static void main(String[] args) {
// // for size of array in java

// int marks[] = { 87, 85, 44 };

// // for output in java

// for (int i = 0; i < 3; i++) {
// System.out.println(marks[i]);
// }
// }
// }

// by taking input form user in java

// import java.util.*;

// public class day9 {
// public static void main(String[] args) {
// // for input from user in java

// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// int number[] = new int[size];

// // for output in java in by taking array

// for (int i = 0; i < size; i++) {
// System.out.println(number[i]);
// }

// }
// }

// new way of taking data from user in java

// import java.util.*;

// public class day9 {
// public static void main(String[] args) {
// // for input of size from user

// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// int number[] = new int[size];
// // for input of numbeer from user in array

// for (int i = 0; i < size; i++) {
// number[i] = sc.nextInt();

// }
// // for output in array
// for (int i = 0; i < size; i++) {
// System.out.println(number[i]);
// }
// }
// }

// question 1 on array in java

// import java.util.*;

// public class day9 {
// public static void main(String[] args) {
// // input from user
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// int number[] = new int[size];

// // input of number from user in array
// for (int i = 0; i < size; i++) {
// number[i] = sc.nextInt();
// }

// Object arr;
// for (int i = 0; i < number.length; i++) {
// System.out.println(number[i] + "");
// }

// }
// }

// question in array in java

// import java.util.*;

// public class day9 {
// public static void main(String[] args) {
// // input from user
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// String names[] = new String[size];

// // for array input from user in java
// for (int i = 0; i < size; i++) {
// names[i] = sc.next();
// }

// // loop for output in java
// for (int i = 0; i < size; i++) {
// System.out.println(names[i]);
// }

// }
// }

// question in java in array
// import java.util.*;

// public class day9 {
// public static void main(String[] args) {
// // for input in java
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// int numbers[] = new int[size];

// // for output of number
// for (int i = 0; i < size; i++) {
// numbers[i] = sc.nextInt();

// }

// // for output in java of max and mini number

// int max = Integer.MIN_VALUE;
// int min = Integer.MAX_VALUE;

// for (int i = 0; i < numbers.length; i++) {
// if (numbers[i] < min) {
// min = numbers[i];
// }
// if (numbers[i] > max) {
// max = numbers[i];
// }
// }
// System.out.println("Largest number is : " + max);
// System.out.println("Smallest number is : " + min);

// }
// for input