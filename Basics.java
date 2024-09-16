import java.util.*;

public class Basics{
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;

        // System.out.println(array[3]);
        for(int i=0;i<array.length;i++){
            array[i]= sc.nextInt();
        }
        //method 1 of printing
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        // method 2 of printing
        for(int value: array){
            System.out.print(value+" ");
        }
        System.out.println();
        //method 3 of printing
        System.out.println(Arrays.toString(array));

        //String Array
        String[] arr = new String[4];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.next();
        }
        System.out.println(Arrays.toString(arr));

    }


}