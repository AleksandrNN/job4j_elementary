package ru.job4j.array;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class LengthArayArays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {2, 3}, {3, 4, 5}, {6, 7, 8, 9}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Размер вложенного массива равен: " + numbers[i].length);
        }
    }
}
