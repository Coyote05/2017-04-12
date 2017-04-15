package hu.helixlab.homework.homework05;

import java.util.Arrays;

public class Sort implements ISort{

    @Override
    public void bubbleSort(int[] bubble){

        int swaps = 0;
        int swapsTemp = 0;

            for(int i = bubble.length; i > 1; --i){
                for(int j = 0; j < i-1; ++j){

                    if(bubble[j] > bubble[j + 1]){
                        int temp = bubble[j + 1];
                        bubble[j + 1] = bubble[j];
                        bubble[j] = temp;
                        swapsTemp = swaps + 1;
                    }
                    if(swapsTemp == swaps){
                        break;
                    }
                }
            }
            System.out.println("\t" + Arrays.toString(bubble));
    }
}
