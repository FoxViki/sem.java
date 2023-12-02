package seminary.dz1;
/**Напишите функцию printPrimeNums, которая выведет на экран
 * все простые числа в промежутке от 1 до 1000, каждое на новой строке.

Напишите свой код в методе printPrimeNums класса Answer.

Пример

2
3
5
7
11
... */

public class dz1z2 {
    

class Answer {
    public void printPrimeNums(){

        boolean isPrime;
        for (int i = 2; i < 1000; i++){//делимое перебираем
            isPrime = i == 1;
            for (int j = 2; j < 1000; j ++){//делители перебираем
                if (i >= j && i%j == 0){
                    if(j == i){
                        isPrime = true;
                    }
                break;
                }
            }
            if(isPrime) System.out.println(i);
    }
}
}
                
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      
      Answer ans = new Answer();      
      ans.printPrimeNums();
    }
}
}














/**
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int input = scanner.nextInt();
        scanner.close();
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= input; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                primes.add(i);
            }
        }
        System.out.println("Простые числа: " + primes);
    }
}

*/