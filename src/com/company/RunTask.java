package com.company;

public class RunTask implements  Runnable{

    final  int start;
    final  int end;
    final  int[] array;

    public RunTask(int start, int end, int[] array) {
        this.start = start;
        this.end = end;
        this.array = array;
    }

    @Override
    public void run() {

        for (int i = start; i < end; i++) {

            System.out.println( Thread.currentThread().getName() + " !! " + i + "element");
        }
    }
}
