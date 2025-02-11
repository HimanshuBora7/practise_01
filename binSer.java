public class binSer {
    public static void main (String [] args ){
         int [] array = { 1 ,2,3 ,9, 5, 6, 7 };
         BinSearch(array, 9);

    }

public static void Sort(int [] array ){
int temp;

for(int i = 0 ; i < array.length - 1 ;i++){
    for(int j = i + 1 ; j < array.length ; j++){
        if(array[j] < array[i]){
            temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
    }
}
System.out.println("Sorted array ");
for(int x : array)
 System.out.print(x + " ");
}

   public static void BinSearch(int [] array , int target ){
     /*  we apply binary search only on sorted array so we have to make sure if the array is sorted or not    
    in binary seacrch we search our target element by dividing the array into 2 half
    we compare the middle element with our target element and adjust our weights situated at
    ends accordingly 
    if our mid element is smaller then our target element then we shift low towards mid+1
    if our mid element is greater then our target element then we shift our high to mid -1 ;
     */
    Sort(array);

    int mid;
    int flag = 0 ;
    int low = 0;
    int high = array.length  - 1;
    
     while (low <= high ){
    mid = (high+low)/2;

    if(array[mid] == target ){
        flag++;
        break;
    }
    else if( array [mid] > target ){
        high = mid -1 ;
    }
    else{
        low = mid+1 ;
    }

    }

if( flag != 0 ){
    System.out.println("\nelement found ");
}
else {
    System.out.println("\nelement not found ");
}

   }

}
