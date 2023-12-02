package seminary.dz1;
/**Реализуйте простой калькулятор

Напишите класс Calculator, который будет выполнять
математические операции (+, -, *, /) над двумя числами
и возвращать результат. В классе должен быть метод calculate,
который принимает оператор и значения аргументов и возвращает
результат вычислений.

При неверно переданном операторе, программа должна вывести
сообщение об ошибке "Некорректный оператор: 'оператор'".

Аргументы, передаваемые в метод/функцию:

'3'
'+'
'7'
На выходе:


10 */

public class dz1z3 {

class Calculator {
    public int calculate(char op, int a, int b) {
        // Введите свое решение ниже
    int res = 0; 
        switch(op) { 
            case '+': res = a + b; 
              break; 
            case '-': res = a - b; 
              break; 
            case '*': res = a*b; 
              break; 
            case '/': res = a / b; 
              break;
            default: 
              System.out.printf("Некорректный оператор: 'оператор'."); 
              break; 
        }
      return res;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
class Printer {
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 174;
            op = '*';
            b = 0;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}
}
















/*
class Calculator {
    public int calculate(char op, int a, int b) {
      // Введите свое решение ниже
       int result = 0;
        if (op == '+'){
            int rezult = a + b;
            return rezult;
        }
        else if (op == '-'){
            int rezult = a - b;
            return rezult;
        }
        else if (op == '*'){
            int rezult = a * b;
            return rezult;
        }
        else if (op == '/'){
            float rezult = a / b;
            return rezult;
        }
        else
            return "Некорректный оператор: 'оператор'";


    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}
*/ */