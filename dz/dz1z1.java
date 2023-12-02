package seminary.dz1;
/**Вычислить n-ое треугольного число(сумма чисел от 1 до n).

Внутри класса Answer напишите метод countNTriangle, который
принимает число n и возвращает его n-ое треугольное число.

Пример


n = 4 -> 10

n = 5 -> 15 */

//import java.util.Scanner;

/**import java.util.Scanner;

class Answer{

public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Введите первое число: ");
    int i = iScanner.nextInt();
    System.out.printf("Треугольное число: %d\n", giveMeNumber(i));
    iScanner.close();
}

public static int giveMeNumber(int a) {
    return (a * (a + 1)) / 2;
}
}
*/













class Answer {
    public int countNTriangle(int n){
      return (n * (n + 1)) / 2;//нужно было тоько вставить формулу

    }
}

public class Printer{ 
    public static void main(String[] args) { 
      int n = 0;
      
      if (args.length == 0) {
        n = 4;
      }
      else{
        n = Integer.parseInt(args[0]);
      }     
      
      Answer ans = new Answer(); 
      int itresume_res = ans.countNTriangle(n);     
      System.out.println(itresume_res);
    }
}


























// Эталонное решение от автора
/** 
class Answer { public int countNTriangle(int n){ int sum = 0; for(int i = 1; i <= n; i++){ sum += i; } return sum; } }

class Printer { public static void main(String[] args) { int n = 0;

    if (args.length == 0) {
        n = 4;
    } else {
        n = Integer.parseInt(args[0]);
    }

    Answer ans = new Answer();
    int itresume_res = ans.countNTriangle(n);
    System.out.println(itresume_res);
}
}*/
















