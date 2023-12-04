/*Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
Напишите метод, который запишет массив, возвращенный предыдущим методом в файл. 
Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.
 */
/*
# указываем обработчики логов - файловый и консольный
handlers = java.util.logging.FileHandler, java.util.logging.ConsoleHandler
# все логи уровня инфо и выше
java.util.logging.FileHandler.level     = INFO
# класс который отвечает за форматирование логов в файл
java.util.logging.FileHandler.formatter = java.util.logging.SimpleFormatter
# append    = true чтобы шла дозапись файла
java.util.logging.FileHandler.append    = true
# паттерн для создания строки в нужном формате
java.util.logging.FileHandler.pattern   = log.%u.%g.txt
# с какого уровня будем выводить сообщения в консоль
java.util.logging.ConsoleHandler.level     = INFO
# класс который отвечает за форматирование логов в консоль
java.util.logging.ConsoleHandler.formatter = java.util.logging.SimpleFormatter
*/
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class sem2flud {

public class Log {
    private static final Logger LOG = Log.log(Task5.class.getName());
private final static String PATH = ".";
    static {
        try(FileInputStream in = new FileInputStream("log.config")){ //относительный путь до файла с конфигами
            LogManager.getLogManager().readConfiguration(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Logger log(String className) {
        return Logger.getLogger(className);
    }
}
    
private static String[] getFileNamesInDir() {
        File dir = new File(PATH);
        String[] result = new String[0];
        File[] files;
        if (dir.isDirectory()) {
            files = dir.listFiles();
            if (files != null) {
                result = new String[files.length];
                for (int i = 0; i < files.length; i++) {
                    File file = files[i];
                    String name = file.getName();
                    if (file.isFile()) {
                        System.out.println("\tFile - " + name);
                    } else {
                        System.out.println("Directory - " + name);
                    }
                    result[i] = name;
                }
            }
        } else {
            System.out.println(dir.getName() + " не является папкой");
        }
        return result;
    }

public static void write() {
        try(FileWriter in = new FileWriter("task5.txt")) {
            String[] data = getFileNamesInDir();
            for (String s : data) {
                in.append(s).append("\n");
            }
            System.out.println("File names in goal dir recorded!");
            if (isThrow()) {
                throw new IOException("Some kind of mistake");
            }

        } catch (IOException e) {
            LOG.log(Level.INFO, e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
   
private static boolean isThrow() {
        int a = 0;
        int b = 2;
        int digit = a + (int) (Math.random() * b);
        System.out.println(digit);
        return digit > 0;
    }
}
