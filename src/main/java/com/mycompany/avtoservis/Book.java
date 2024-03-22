/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.avtoservis;

/**
 *
 * @author Ксюша
 */
package com.mycompany.avtoservis;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Book {
     public static void main(String[] args) {
        System.out.println("Скворцова Ксения РИБО-04-22 вариант 5");
        Scanner scan = new Scanner(System.in);
        int numberOfCars = scan.nextInt();
        scan.nextLine();
}
    public static ArrayList <Dictionary> dictionary = new ArrayList<>() {{
        add(new Dictionary("Abdication","Отречение"));
        add(new Dictionary("Aperitif", "Аперитив"));
        add(new Dictionary("Mead", "Мед"));
        add(new Dictionary("Zizz", "Жужжание"));
        add(new Dictionary("Олененок", "Fawn"));
    }};
    private static Scanner scan = new Scanner(System.in);

    public static void start() {
        System.out.println("Выберите действие: ");
        System.out.println("1: добавить новое слово в список \n" +
                "2: удалить слово из списка \n" +
                "3: удалить все слова из списка \n" +
                "4: вывести весь список \n" +
                "5: выход \n");
        int choose = scan.nextInt();
        scan.nextLine();
        switch (choose) {
            case 1: {
                addWord();
                break;
            }
            case 2: {
                delByWord();
                break;
            }
            case 3: {
                delAll();
                break;
            }
            case 4: {
                outAllArr();
                break;
            }
            case 5:
                break;
        }
    }

    private static void outAllArr() {
        dictionary.forEach(System.out::println);
        start();
    }


    public static void addWord() {
        System.out.println("Введите слово");
        String word = scan.nextLine();
        System.out.println("Введите перевод");
        String meaning = scan.nextLine();
        }

        dictionary.add(new Dictionary(word, meaning));
        start();
    }

      private static void delByWord() {
        System.out.println("Введите слово: ");
        String word = scan.nextLine();
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
            printSortedDictionary();
        } else {
            System.out.println("Слова больше нет в списке");
        }
    }
        start();
    }

    private static void delAll() {
        dictionary.clear();
        start();
    }

    public static void main(String[] args) {
        start();
    }
}
