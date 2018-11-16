package com.minarchenko.taskEightPartFour;

import java.util.concurrent.RecursiveTask;

public class ArraySumTask extends RecursiveTask<Long> {
    private int[] masInt;
    private int startPosition;
    private int lastPosition;


    public ArraySumTask(int[] a,int startPosition, int lastPosition) {
        this.masInt = a;
        this.startPosition=startPosition;
        this.lastPosition=lastPosition;
    }

    @Override
    protected Long compute() {
        Long resultSum=0L;
        int count = lastPosition - startPosition;
        if (count <=2){
            for (int i = startPosition; i <=lastPosition; i++) {
                resultSum=resultSum+masInt[i];
            }
        }else {
            ArraySumTask arraySumTaskLeft = new ArraySumTask(masInt, startPosition, startPosition + count / 2);
            ArraySumTask arraySumTaskRight = new ArraySumTask(masInt, startPosition + count / 2 + 1, lastPosition);
            arraySumTaskLeft.fork();
            arraySumTaskRight.fork();
            resultSum=arraySumTaskRight.join()+arraySumTaskLeft.join();
        }
        return resultSum;
    }
}
