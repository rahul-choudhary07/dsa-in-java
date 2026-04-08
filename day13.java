// public class day13 {

//     public static void printArray(int arr[]){
//         for(int i =  0 ; i<arr.length;i++){
//             System.out.println(arr[i]+" ");
//         }
//         System.out.println();
//     }
//   public static void main(String[]args){
//         int arr[] = {7 ,8, 3 ,5 ,9};

// // time  complex = o(n^2);
//         // bubble sort  in java 

//     for(int i = 0; i<arr.length-1;i++){
//         for(int j = 0; j<arr.length-i-1;j++){
//             if(arr[j]>arr[j+1]){
//                 // swap 

//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;

//             }
            
//         }
//     }
//     printArray(arr);
//     }
// }

public class day13 {

    public static void printArray(int arr[]){
        for(int i =  0 ; i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
  public static void main(String[]args){
        int arr[] = {7 ,8, 3 ,5 ,9};

// time  complex = o(n^2);
        // bubble sort  in java 

    for(int i = 0; i<arr.length-1;i++){
        for(int j = 0; j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                // swap 

                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

            }
            
        }
    }
    printArray(arr);
    }
}
