public class linearSearch {
    // public static int linearSearchInArray(int number[] , int key){
    //     for(int  i =0;i<number.length; i++){
    //         if(number[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static void main(String[] args) {

    //     int number[] = {1 , 2 , 4 , 5 , 4 , 6 , 7};
    //     int key = 4;

    //     int index  = linearSearchInArray(number, key);

    //     if(index == -1){
    //         System.out.println("Something wents wrong");
    //     }else{
    //         System.out.println("Element is founded at index is : "+ index);
    //     }
    // }

    // my method

    public static void linearSearchInArray(int number[] , int key){
        for(int  i =0;i<number.length; i++){
            if(number[i] == key){
               System.out.println("find the element successfully" +i);
            }
        }
       
    }

    public static void main(String[] args) {

        int number[] = {1 , 2 , 4 , 5 , 4 , 6 , 7};

        int key = 4;
       linearSearchInArray(number, key);
    }


}