package javaapplication11_string;

public class SentencesArray {

    String arr[];
    
    SentencesArray(String[] arr) {
        this.arr = arr;
    }
    
    void decrease(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].length() < arr[j].length()) {
                    String t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        
        System.out.println("Sentences sorted by length decrease: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    
    void growth(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].length() > arr[j].length()) {
                    String t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        
        System.out.println("Sentences sorted by length growth: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
