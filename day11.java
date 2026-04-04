// public class day11 {
// public static void main(String[]args){
// String name = "rahul";
// String fullName = "rahul choudhary";
// String sentence = "my name is rahul choudhary ";
// }
// }

// taking input from user in string
// import java.util.*;
// public class day11{
// public static void main(String[]args){
// // for input of user in string
// Scanner sc = new Scanner(System.in);
// String name = sc.nextLine();

// System.out.println(name);
// }
// }

// funtion in string in java
// import java.util.*;

// public class day11 {
// public static void main(String[] args) {
// // concatention = adding two string in java
// String firstName = "rahul";
// String secondName = "choudhary";
// String fullName = firstName + secondName;
// System.out.println(fullName.length());

// // charAt
// for (int i = 0; i < fullName.length(); i++) {
// System.out.println(fullName.charAt(i));
// }
// }

// }

// comparsion of string in java
// import java.util.*;

// public class day11 {
// public static void main(String[] args) {
// String name1 = "rahul";
// String name2 = "choudhary";

// if (name1.compareTo(name2) == 0) {
// System.out.println("equal");
// } else {
// System.out.println("not equal");
// }
// }
// }

// substring is used for the any part result of dtring in java in name and
// senterce

// import java.util.*;

// public class day11 {
//     public static void main(String[] args) {
//         String name = "tony stark";
//         System.out.println(name.substring(0, 4));
//     }
// }

// converting string  into int  

// import  java.util.*;
// public class day11{
//     public static void main(String[]args){
//         String str = "123";
//         int number = Integer.parseInt(str);
//         System.out.println(number);
//     }
// }

// java  string are  immutable  in java 

// home work 

// import java.util.*;

// public class day11 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         String name[] = new String[size];
//         int totLength = 0;

//         // input for name in java
//         for (int i = 0; i < size; i++) {
//             name[i] = sc.next();
//             totLength += name[i].length();

//         }
//         System.out.println(totLength);
//     }
// }

// question 3  
// import java.util.*;

// public class day11 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         String result = "";

//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) == 'e') {
//                 result += 'i';
//             } else {
//                 result += str.charAt(i);
//             }
//         }

//         System.out.println(result);
//     }
// }

// question in java  
import java.util.*;

public class day11 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String email = sc.next();
    String userName = "";

    for (int i = 0; i < email.length(); i++) {
      if (email.charAt(i) == '@') {
        break;
      } else {
        userName += email.charAt(i);
      }
    }

    System.out.println(userName);
  }
}
