package array;

public class FindMaximumElementInArray {

    public static void main(String[] args) {
        int[] a = {3, 9, 7, 8, 12, 6, 15, 5 , 4, 10};
        System.out.println("Maximum number of element in array is: " + (a.length));
        int max = a[0];
        for(int i = 0; i < a.length-1; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Largest number of the array is: " + max);

    }



}
