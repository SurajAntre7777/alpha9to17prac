

 
// public class pract2{
//     public static int largestvalue(int numbers[]){
//         int largest=Integer.MIN_VALUE;  

//         for (int i=0;i<numbers.length;i++){
//             if (largest < numbers[i]){
//                 largest = numbers[i];
//             }
//         }
//         return largest;

//     }
     
    
//     public static void main(String args[]){
//         int numbers[]={1,2,3,5,7,9,1};
     

//     }
// }



// public class pract2{
//     public static void revercearry(int numbers[]){
//         int first = 0; int last = numbers.length-1;

//         while(first<last){
//             int temp = numbers[first];
//             numbers[first] = numbers[last];
//             numbers[last] = temp;

//             first++;
//             last--;


//         }

//     }
//     public static void main (String[] args) {
//         int numbers[]={1,2,3,5,7,9};


//         for(int i=0; i<numbers.length; i++){
//             System.out.print(numbers[i]+" ");
//         }
//         System.out.println();
//     }

// }









// public class pract2{
//     public static void reversarr(int arr[]){
//     for (int i=0; i<arr.length; i++){

//         System.out.println(i);
//     }
// }
//     public static void main(String[] args){
//         int arr []={1,2,6,9,7,3};
        
//     }
// }



 
// public class pract2{
//     public static int largestvalue(int numbers[]){
//         int largest=Integer.MIN_VALUE;  

//         for (int i=0;i<numbers.length;i++){
//             if (largest < numbers[i]){
//                 largest = numbers[i];
//             }
//         }
//         return largest;

//     }
     
    
//     public static void main(String args[]){
//         int numbers[]={1,2,3,5,7,9,1};
     

//     }
// }



// public class pract2{
//     public static void revercearry(int numbers[]){
//         int first = 0; int last = numbers.length-1;

//         while(first<last){
//             int temp = numbers[first];
//             numbers[first] = numbers[last];
//             numbers[last] = temp;

//             first++;
//             last--;


//         }

//     }
//     public static void main (String[] args) {
//         int numbers[]={1,2,3,5,7,9};


//         for(int i=0; i<numbers.length; i++){
//             System.out.print(numbers[i]+" ");
//         }
//         System.out.println();
//     }

// }


// public class pract2{

//     public static void reverce(int numbers[]){
//         int first = 0;
//         int last = numbers.length-1;

//         while(first < last){

//             int temp = numbers[first];
//             numbers[first] = numbers[last];
//             numbers[last] = temp;

//             first++;
//             last--;
//         }

//     }
//     public static void main(String args[]){
//         int numbers[] = {1,2,3,4,5,7,9};

//         reverce(numbers);

//         for(int i=0; i<numbers.length; i++){
//             System.out.print( numbers[i]);
//         }
//         System.out.println();
//     }
// }













public class pract2{

    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos= i;

            for(int j=i+1;j<arr.length;j++) {
                if(arr [minPos] < arr[j]){
                    minPos = j;
                }

            }
            int temp = arr  [minPos];
            arr [minPos] = arr [i];
            arr[i] = temp;
}
    }
    public static void main (String[] args) {
        int arr[]={1,3,5,7,9,2};
        selection(arr);
        
    }

}