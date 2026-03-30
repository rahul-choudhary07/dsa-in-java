import java.util.*;

public class dayy3 {
    public static void main(String[] args) {
        // for input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int op = sc.nextInt();

        // for output

        switch (op) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a/b);
                break;
            case 4:
                System.out.println(a%b);
                break;
            case 5:
                System.out.println(a*b);
                break;

            default:System.out.println("error");

        }

    }

}

// import java.util.*;

// public class dayy3 {
//     public static void main(String[]args){
//         // for  input


//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
    


//         // for output we  use  switch opration

//         switch (a) {
//             case 1:
//                 System.out.println("january");
//                 break;
//          case 2:
//             System.out.println("feburay");
//              break;
//             case 3:
//                 System.out.println("march");
//  break;
//              case 4:
//         System.out.println("april");
        
//  break;
//   case 5:
//         System.out.println("june");
//          break;

//           case 6:
//         System.out.println("july");
//          break;

//           case 7:
//         System.out.println("augest");
//          break;

//           case 8:
//         System.out.println("septmep");
//          break;


//           case 9:
//         System.out.println("octember");
//          break;


//           case 10:
//         System.out.println("november");
//          break;


//           case 11:
//         System.out.println("december");
//          break;

//           case 12:
//         System.out.println("may");
//          break;
















//             default:System.out.println("error");
                
//         }
        





//     }
// }
