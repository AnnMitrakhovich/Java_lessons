//Напишите метод, который вернет содержимое текущей папки в виде массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
// оно должно записаться в лог-файл.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class lesson_2_file {
    static Logger logger = Log.log((lesson_2_file.class.getName()));

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFileStr(".")));
        write(".");    }
    public static String[] getFileStr(String path) {
        File dir1 = new File(path);
        if (dir1.isFile()) {
            throw new RuntimeException("Это не папка");
        } else {
            return dir1.list();        }    }
    public static void write(String path) {
        try (FileWriter in = new FileWriter("task5.txt", true)){
            String[] data = getFileStr(path);
            for (String s: data){
                in.append(s).append("\n");
                in.flush();            }
            throw new IOException();
        } catch (IOException e) {
            logger.log(Level.INFO, "ошибка");
        }
    }
}
/*
private static String[] getFileNamesInDir(String path) {
        File dir = new File(path);
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

https://github.com/SenzOne/JavaApi/tree/seminars/src/main/java/org/seminars/seminar2
 */