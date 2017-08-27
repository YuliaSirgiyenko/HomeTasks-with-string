/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11_string;

public class Sentence {

    String s;
    
    Sentence (String s) {
        this.s = s;
    }
    
    int sentenceLength() {
        return this.s.length();
    }
    
    boolean check() {
        int lastIndex = this.s.lastIndexOf("ly");

        if (lastIndex == (sentenceLength() - 2)) {
            return true;
        } else {
            return false;
        }

    }

    String half() {
        String stringInit = s;
        int half = sentenceLength()/2;
        return stringInit.substring(0, half);
    }
    
}
