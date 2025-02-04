// bubble sort 
// we go on comparing adjacent elements and ultimately largest number will bubble up 
// to its respective position , so we have to run th is iteration for n - 1 times   


public class bubble {
    public static void main (String [] args ){
        int [] array = { 10 ,5 , 4,3,7};
        System.out.println("\nunsorted array ");
  for(int z : array){
  System.out.print(z + " ");
 }

 bubblesort(array);
 System.out.println("\nsorted array ");
 for(int z : array){
  System.out.print(z + " ");
 }
}





    
    public static void bubblesort(int [] arr ){
        int temp;
        int k = 0 ;
        while(k < arr.length-1){
        for(int i = 0 ; i < arr.length - 1 ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[j] < arr[i]){
                    temp  = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        k++;
    }
    }
}
    

