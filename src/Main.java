import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     int[] arr0 = {10,20,30,40,50};
     int[] arr1 = {0,0,0,0,0,0,0,0};

        System.out.println("arr0 " + Arrays.toString(arr0));
        System.out.println("arr1 " + Arrays.toString(arr1));

        System.arraycopy(arr0, 1, arr1,2,3);
        System.out.println("arr0: " + Arrays.toString(arr1));



    }

}
