package javaapplication11_string;

import java.util.Scanner;

public class JavaApplication11_string {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*Task 1 - дана строка, вернуть true, если она заканчивается на ly 
        (only small letters) */
        System.out.println("Task 1 - pls., insert string for last letters "
                + "check ('ly' or not) & for its half returning: ");
        String stringForCheck = scanner.nextLine();
        Sentence s = new Sentence();
        System.out.println("Result for Task 1 - last letters are 'ly' in "
                + "string '" + stringForCheck + "' it's " + s.check(stringForCheck));

        /*Task 2 - дана строка произвольной длины, необходимо вернуть ее 
        первую половину (бОльшую часть в случае нечетной длины строки) */
        System.out.println("Result for Task 2 - 1st half of entered string is"
                + " '" + s.half(stringForCheck) + "'");

        /*Task 3 - ввести n строк с консоли, упорядочить и вывести строки в
        порядке возрастания и убывания их длины.*/
        System.out.println("Task 3 - pls., insert how much sentences do you"
                + " want to check (not more than 10)");
        int n = scanner.nextInt();
        scanner.nextLine();

        if ((n <= 1) || (n > 10)) {
            System.out.println("Sorry, operation will be impossible"
                    + " or not to make sence");
        } else {
            SentencesArray sent = new SentencesArray(n);
            sent.decrease(n);
            sent.growth(n);
        }
    }

}
