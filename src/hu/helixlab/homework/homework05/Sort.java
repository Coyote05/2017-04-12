package hu.helixlab.homework.homework05;

import java.util.Arrays;

public class Sort implements ISort{

    @Override
    public void bubbleSort(int[] bubble){

            for(int i = bubble.length; i > 1; --i){
                int swaps = 0;
                for(int j = 0; j < i-1; ++j){

                    if(bubble[j] > bubble[j + 1]){
                        int temp = bubble[j + 1];
                        bubble[j + 1] = bubble[j];
                        bubble[j] = temp;
                        swaps = swaps + 1;
                    }
                }
                if(swaps == 0){
                    break;
                }
            }
            System.out.println("\t" + Arrays.toString(bubble));
    }
}
