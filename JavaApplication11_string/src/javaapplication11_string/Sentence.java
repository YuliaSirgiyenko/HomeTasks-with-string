package javaapplication11_string;

public class Sentence {

    Sentence() {
    }

    boolean check(String sent) {
        int lastIndex = sent.lastIndexOf("ly");

        if ((sent.length() >= 2) && (lastIndex == (sent.length() - 2))) {
            return true;
        } else {
            return false;
        }

    }

    String half(String sent) {
        int half = sent.length() / 2;

        if (sent.length() % 2 == 0) {
            return sent.substring(0, half);
        } else {
            return sent.substring(0, half + 1);
        }
    }

}
