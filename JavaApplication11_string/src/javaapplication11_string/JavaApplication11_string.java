package javaapplication11_string;

import java.util.Scanner;

public class JavaApplication11_string {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        /*Task 1 - дана строка, вернуть true, если она заканчивается на ly */
        System.out.println("Task 1 - pls., insert string for last letters check ('ly' or not 'ly'): ");
        String stringForCheck = scanner.nextLine();
        Sentence s = new Sentence(stringForCheck);
        System.out.println("Result for Task 1 - last letters are 'ly' in string '" + stringForCheck + "' it's " + s.check());

        /*Task 2 - дана строка произвольной длины, необходимо вернуть ее первую половину */
        System.out.println("Result for Task 2 (1st half of entered string) is '" + s.half() + "'");

        /*Task 3 - ввести n строк с консоли, упорядочить и вывести строки в порядке возрастания и убывания
        их длины.*/
        System.out.println("Task 3 - pls., insert how much sentences you can check");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        String sentence[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Pls., insert sentence " + (i + 1));
            sentence[i] = scanner.nextLine();
        }
        
        SentencesArray sent = new SentencesArray(sentence);
        sent.decrease(n);
        sent.growth(n);
    }

}
