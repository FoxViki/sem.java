package seminary;
import java.util.Arrays;
public class sem1z5 {
   // Во фразе "Добро пожаловать на курс по Java" переставить
   //слова в обратном порядке.


// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
 {
    public static void main(String[] args) {
        String m = "Добро пожаловать на курс по Java";
        String[] array = m.split(" ");
        System.out.println(Arrays.toString(array));

        for(int i = array.length-1; i >= 0;i--){
            System.out.print(array[i]+" ");
        }
    }
}

}
