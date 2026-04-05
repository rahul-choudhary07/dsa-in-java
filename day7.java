
// basic of  array in java 

// public class day7 {
//     public static void main(String[]args){
//         int[] marks = new int[3];
//          marks[0] = 97;
//          marks[1]= 98;
//         marks[2] = 100;

//        for(int i = 0;i<3; i++){
//           System.out.println(marks[i]);
//        }

//     }
// }

// defining of array 2nd  type 

// import java.util.*;
//      public class day7{
//         public static void main(String[]args){

//             int marks[] ={97, 98, 100};

//             for(int i= 0; i<3; i++){
//         System.out.println(marks[i]);
//             }
//         }
//      }

// making  a  array by  taking  input from user 

import java.util.*;

public class day7 {
    public static void main(String[] args) {
        // for input in java
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();

        }

        for (int i = 0; i < size; i++) {
            System.out.println(number[i]);
        }

    }
}

// takes an array  of  names  a s input from user and 
// print them on the  screeen 

// import java.util.*;

// public class day7 {
//     public static void main(String[] args) {
//         // for input for array

//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         String name[] = new String[size];

//         // loop for input in array
//         for (int i = 0; i < size; i++) {
//             name[i] = sc.next();
//         }

//         // for output in array in java

//         for (int i = 0; i < size; i++) {
//             System.out.println(name[i]);
//         }

//     }

// }