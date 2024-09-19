package com.perscholas.java_basics;

//Character class helps
public class CharacterPractice {
    public static void main(String[] args){
//        recall static means we can use the CLASS NAME directly to access the method or variable, we do not need the object to access it

        Character letter = Character.valueOf('g');
        Character num = '7';
        System.out.println(letter);
        System.out.println(num);

        Character letterA = 'A';
        System.out.println(letterA);
        Character asciNumber = 97;
        System.out.println(asciNumber);
//        isLettter()
//        isDigit()
//       == compares the OBJECT itself
//        comparedTo(); is used for sorting aka giving a numerical order of the characters

    }
}
