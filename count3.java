//implementing count sort 

public class count3 {
public static void main (String [] args ){
  int [] arr = {10,3,2,1,8,4,7};
  System.out.println("unsorted array ");
 for(int z : arr){
  System.out.print(z + " ");
 }
  
 count( arr);
System.out.println("\nsorted array ");
 for(int z : arr){
  System.out.print(z + " ");
 }
}
public static void count(int [] array ){
    //first step is to find the largest number in the array 
     int max = array[0];
     for(int x : array){
        if( x > max)
         max = x;
     }
     System.out.println("max number : " + max );
    //second step is to make a new array with size max+1;
    int [] new_array = new int[max + 1 ];
   
    //next step is to mark the frequency of each number in new_array from og array to their
    //corresponding array 
    
    for(int i = 0 ; i < array.length ; i++){
      if(array[i] > 0 ){
        new_array[array[i]]++;
      }
    }
    //now last step is to adjust our original array on the basis of new_array 

    int index = 0 ;
    for(int i = 0 ; i < new_array.length ; i++ ){
        while(new_array[i] > 0 ){
            array[index] = i;
            index++;
            new_array[i]--;
        }
    }

}  
}
