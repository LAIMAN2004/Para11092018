package org.istep.qa;
import java.util.Arrays;
import java.util.Scanner;
public class Lab11092018 {
    public static void main(String[] args) {
        //Задание 1
        /*String one = "test_test";
        String two = "t_t";
        if (one.contains(two)){
            System.out.println("Вторая строка содержится в первой");
        } else {
            System.out.println("Вторая строка не содержится в первой");
        }*/
        //задание 2
        /*
        //String testLine = "Мама  мыла раму";
        //String [] result = testLine.split(" "); //сплит возвращает массив из разделенных по пробелам масив
        //System.out.println("Количество слов равно " + result.length); // выводит чколько частей разделенных пробелом
        //System.out.println(Arrays.toString(result)); // показывает через разделитель что лежит в строке
        int counter = 0;
        for (int i=0; i<result.length; i++){
            if (!result[i].isEmpty()) {
                counter++;
            }
        }
        System.out.println("Колич слов равно " + counter);*/
        System.out.println("-----------------------------------------------");
        /*// тоже самое решение задачи 2 что и  выше, для блатных
        for (String tempValue : result){
            if (!tempValue.isEmpty()){
                counter++;
            }
        }
        System.out.println("Колич слов равно " + counter);*/
        System.out.println("-----------------------------------------------");
       /*
        //еще один вариант для 2 задачи
        String testLine = "Мама  мыла раму";
        String [] result = testLine.split(" +");
        System.out.println(Arrays.toString(result));
        System.out.println("Количество слов равно " + result.length);
*/
        //задание 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи один символ");
        String tempValue = scanner.next();
        if (tempValue.length() == 1) {
            char ch = tempValue.charAt(0);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {//проверям что буква явл латиницей
                if (Character.isLowerCase(ch)) {
                    System.out.println("Результат = " + Character.toUpperCase(ch));
                } else {
                    System.out.println("Результат = " + Character.toLowerCase(ch));
                }
                } else {
                System.out.println("Вы ввели нелатинскую букву");
            }
            } else{
                    System.out.println("Вы ввели слишком длинное значение");
                }
            }
        }
