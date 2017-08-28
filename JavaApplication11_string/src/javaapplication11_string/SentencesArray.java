package javaapplication11_string;

import java.util.Scanner;

public class SentencesArray {

    String arr[] = new String[10];
    Scanner scanner = new Scanner(System.in);

    SentencesArray() {
    }

    SentencesArray(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Pls., insert sentence " + (i + 1));
            arr[i] = scanner.nextLine();
        }
    }

    String[] decrease(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].length() < arr[j].length()) {
                    String t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }

        System.out.println("Sentences by lenght decrease:");
        printArray(n);
        return arr;
    }

    void printArray(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    String[] growth(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].length() > arr[j].length()) {
                    String t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }

        System.out.println("Sentences by lenght growth:");
        printArray(n);
        return arr;
        
    }

}
