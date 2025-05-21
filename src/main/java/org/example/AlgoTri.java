package org.example;

public class AlgoTri {
    int[] array;

    public AlgoTri(
            int[] array
    ){
       this.array = array;
    }

    private static int min_position(int[] array, int debut){
        int min = debut;
        for (int i = debut; i < array.length; i++){
            if(array[i] < array[min]){
                min = i;
            }
        }
        return min;
    }

    public static int[] tri_selection(int[] array){
        int temp;

        for (int i = 0; i< array.length; i++){
            int min = min_position(array, i);

            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        return array;
    }

}
