// binary opertor  in java  
// public class day12{
//     public static void main(String[]args){
//         int a = 10;
//         int b = 0;

//         b = ++a;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }

// bit manupliCTION IN JAVA
// public class  day12{
//     public static void main(String[]args){
//         int n = 5;
//         int pos = 3;
//         int bitMask = 1;

//         if((bitMask & n )== 0 ){
//             System.out.println("bit was  zero");
//         }else{
//             System.out.println("bit was  one v");
//         }
//     }
// }



// question on bit manuplication in java in dsa  course  


// question 1 if number  is poower  of  2  or  not  
// import  java.util.*;
// public class  day12{
//     public static void main(String[]args){
//   int n = 16; // change number here

//         if (n > 0 && (n & (n - 1)) == 0) {
//             System.out.println(n + " is a Power of 2");
//         } else {
//             System.out.println(n + " is NOT a Power of 2");
//         }
//     }
// }

// full question in java  on bit  manupliction 

public class day12 {

    public static int toggleBit(int n, int pos) {
        return n ^ (1 << pos);
    }

    public static int countOnesFast(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static String decimalToBinary(int n) {
        if (n == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    public static int binaryToDecimal(String binary) {
        int result = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                result += Math.pow(2, power);
            }
            power++;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        int pos = 1;

        System.out.println("Toggle: " + toggleBit(n, pos));
        System.out.println("Count 1s: " + countOnesFast(n));
        System.out.println("Binary: " + decimalToBinary(n));
        System.out.println("Decimal: " + binaryToDecimal("1010"));
    }
}