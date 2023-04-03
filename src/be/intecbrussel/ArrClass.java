package be.intecbrussel;


import java.util.Arrays;

public class ArrClass {

    public static void main(String[] args) {

        int[] myArrNum = {1, 500, 89, 20};
        // sorteert van klein naar groot.
        Arrays.sort(myArrNum);

        for (int index = myArrNum.length - 1; index >= 0; index--) {
            System.out.print(myArrNum[index] + " | ");
        }
        System.out.println();

        for (int index = 0; index < myArrNum.length; index++) {
            System.out.print(myArrNum[index] + " - ");
        }

        System.out.println();

        // print array uit
        System.out.println(Arrays.toString(myArrNum));

    }

}
