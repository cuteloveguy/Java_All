package day1031;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("1"+99+1);
        System.out.println(99+1+"1");
        int a=7;
        double b=10;
        a+=b;
        System.out.println(a);

        double aa=7;
        int bb=10;
        aa+=bb;
        System.out.println(aa);

//        Scanner scanner = new Scanner(System.in);
//        int num1=scanner.nextInt();

        int[][] arr=new int[2][3];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
        // 0 0 0
        // 0 0 0

        int[] arr1={1,2,3};
        int[] arr2={1,2,3};
        int[] arr3={1,2,3};

        int[][] arrTwo=new int[3][3];
        arrTwo[1]=arr1;
        arrTwo[2]=arr2;
        arrTwo[3]=arr3;

        //1 2 3
        //1 2 3
        //1 2 3



    }
}
