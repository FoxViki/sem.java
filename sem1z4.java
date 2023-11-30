package seminary;
//Дан массив двоичных чисел, например [1,1,0,1,1,1],
//вывести максимальное количество подряд идущих 1.
//1,1,0,1,1,1

import java.util.Random;

public class sem1z4 {
   

// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
 {
    public static void main(String[] args) {
        int[] array = new int[] {1,1,0,1,1,1,1,0,1,1};
        // int[] arr = new int[6];
        int count = 0;
        int max = 0;
        for (int i : array) {
            if( i == 1) count++;
            else{
                if (count > max) {max = count;}
                count = 0;
            }
        }
        if (count > max) max = count;
        // System.out.println(max);
        System.out.println(max++);
        System.out.println(max);

    }
} 
}
