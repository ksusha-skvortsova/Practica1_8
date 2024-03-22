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
        System.out.println("РЎРєРІРѕСЂС†РѕРІР° РљСЃРµРЅРёСЏ Р Р�Р‘Рћ-04-22 5 РІР°СЂРёР°РЅС‚");
        Scanner scan = new Scanner(System.in);
        int numberOfCars = scan.nextInt();
        scan.nextLine();
}
    public static ArrayList <Dictionary> dictionary = new ArrayList<>() {{
        add(new Dictionary("Abdication","РћС‚РєР°Р·"));
        add(new Dictionary("Aperitif", "РђРїРµСЂРёС‚РёРІ"));
        add(new Dictionary("Mead", "РњРµРґ"));
        add(new Dictionary("Zizz", "Р–СѓР¶Р¶Р°РЅРёРµ"));
        add(new Dictionary("РђР»РµРЅРµРЅРѕРє", "Fawn"));
    }};
    private static Scanner scan = new Scanner(System.in);

    public static void start() {
        System.out.println("Р’С‹Р±РµСЂРёС‚Рµ РґРµР№СЃС‚РІРёРµ: ");
        System.out.println("1: РґРѕР±Р°РІРёС‚СЊ РЅРѕРІРѕРµ СЃР»РѕРІРѕ РІ СЃР»РѕРІР°СЂСЊ \n" +
                "2: СѓРґР°Р»РёС‚СЊ СЃР»РѕРІРѕ РёР· СЃР»РѕРІР°СЂСЏ \n" +
                "3: СѓРґР°Р»РёС‚СЊ РІСЃРµ СЃР»РѕРІР° РёР· СЃР»РѕРІР°СЂСЏ \n" +
                "4: РІС‹РІРµСЃС‚Рё РІРµСЃСЊ СЃР»РѕРІР°СЂСЊ \n" +
                "5: РІС‹С…РѕРґ \n");
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
        System.out.println("Р’РІРµРґРёС‚Рµ СЃР»РѕРІРѕ");
        String word = scan.nextLine();
        System.out.println("Р’РІРµРґРёС‚Рµ РїРµСЂРµРІРѕРґ СЃР»РѕРІР°");
        String meaning = scan.nextLine();
        }

        dictionary.add(new Dictionary(word, meaning));
        start();
    }

      private static void delByWord() {
        System.out.println("Р’РІРµРґРёС‚Рµ СЃР»РѕРІРѕ РґР»СЏ СѓРґР°Р»РµРЅРёСЏ РёР· СЃР»РѕРІР°СЂСЏ: ");
        String word = scan.nextLine();
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
            printSortedDictionary();
        } else {
            System.out.println("РЎР»РѕРІРѕ РЅРµ РЅР°Р№РґРµРЅРѕ РІ СЃР»РѕРІР°СЂРµ");
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
