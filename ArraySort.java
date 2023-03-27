package ru.otus.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] arg) {
        System.out.println("Введите размер массива ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        int[] arrayForArrayList = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * size);
        }
        System.out.println("/////////////////////////////Bubble sort//////////////////////////////////////");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            arrayForArrayList[i] = array[i];
        }

        System.out.println("=================================================================================");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k]);
        }
        System.out.println();
        System.out.println("Затрачено времени  " + (endTime - startTime) + " ms");
        System.out.println("////////////////////////Collection.sort//////////////////////////////////");
        ArrayList arr = new ArrayList();
        for (int i = 0; i < arrayForArrayList.length; i++) {
            arr.add(arrayForArrayList[i]);
        }
        System.out.println(arr);
        System.out.println("================================================================================");

        long startTimeCollectionSort = System.currentTimeMillis();
        Collections.sort(arr);
        long endTimeCollectionSort = System.currentTimeMillis();
        System.out.println(arr);
        System.out.println("Затрачено времени  " + (endTimeCollectionSort - startTimeCollectionSort) + " ms");
    }
}

