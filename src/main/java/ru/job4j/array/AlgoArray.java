package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        int temp1 = array[2];
        int temp2 = array[1];
        int temp3 = array[4];
        int temp4 = array[3];
        array[1] = temp1;
        array[2] = temp2;
        array[3] = temp3;
        array[4] = temp4;

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

}