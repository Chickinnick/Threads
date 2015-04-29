package com.company;


import java.util.Random;

public class Moon {



    public static void main(String args[]){

        int currentArray[] = generateRandomArray(100);

        Thread thread = new Thread(new RunTask(0,currentArray.length/2 , currentArray));
        thread.start();
        Thread thread2 = new Thread(new RunTask(0,currentArray.length/2 , currentArray));
        thread2.start();
    }


    static int[] generateRandomArray(int num){

        int [] array = new int[num];

        Random random = new Random();

        for (int i = 0; i < num ; i++) {

            array[i] = random.nextInt(20);

        }

        return array;
    }

}
