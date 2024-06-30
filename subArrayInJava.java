public class subArrayInJava {
    public static void subArray(int number[]) {
        int sum = 0;
        int start;
        int end;
        for (int i = 0; i < number.length; i++) {
            start = i;
            for (int j = i; j < number.length; j++) {
                end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k]+ " ");
                }
                sum = sum + j;
                System.out.println();
            }
            System.out.println();
        }
    } 
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5};
        subArray(number);
    }

}