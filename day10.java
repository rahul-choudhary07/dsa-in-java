// que ion on 2d  a

// import java.util.*;

// public class day10 {
//     public static void main(String[] args) {
//         // for input of size of array

//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int colom = sc.nextInt();

//         int[][] numbers = new int[row][colom];

//         // for input from user for row and colom
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < colom; j++) {
//                 numbers[i][j] = sc.nextInt();
//             }
//         }

//         // for out put

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < colom; j++) {
//                 System.out.print(numbers[i][j] + " ");
//             }
//             System.out.println();
//         }

//     }
// }

// question in java  on 2d  array in java  

import java.util.*;

public class day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colms = sc.nextInt();

        int number[][] = new int[row][colms];

        // for input of row and colom
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colms; j++) {
                number[i][j] = sc.nextInt();
            }

        }
        int x = sc.nextInt();

        // for output from user in JAVA in 2d array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colms; j++) {
                if (number[i][j] == x) {
                    System.out.println((i + " " + j));
                }
            }
            System.out.println();
        }
    }
}
