package com.perscholas.java_basics;
import java.util.Arrays;
//String is immutable!
public class JavaStringMethods {
    public static void main(String[] args){
        int intValue = 100;
        String stringOfIntValue = String.valueOf(intValue);
        System.out.println(stringOfIntValue);
//        length() method
//        this is string literal
        String str1 = "Java";
        String str2 = "";
//        creates a new string object on the heap and
//        creates a literal "Welcome" in the STRING CONSTANT POOL

        String string3 = new String("Welcome");
//if I made another string (literal) with the value Welcome, it would not add it again to the constant bool, but would have both variables point to the same "place" in the constant pool memory
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println("Java".length());
        System.out.println("Java\n".length());
        System.out.println("Learn Java".length());

//   isEmpty();
        String s1 = "";
        String s2 = "hello";
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());

// trim()
//        removes the leading and trailing spaces
        String strin1 = "    hello   ";
        System.out.println(strin1 + " how are you"); //without trim()
        System.out.println(strin1.trim()+" how are you"); //with trim()

//  toLowerCase() method:
        String string_1 = "HELLO HOW Are You?";
        String s1lower = string_1.toLowerCase();
        System.out.println(s1lower);

//   toUpperCase() method:
        String string_2 = "hello how are you";
        String s1upper = string_2.toUpperCase();
        System.out.println(s1upper);

//  contact() method:
        String strng1 = "Learn ";
        String strng2 = "Java";

        System.out.println(strng1.concat(strng2));
//        you can also concat using the (+) operator.
//            valueOf: digs deep into the variable and stracts the value
//        split() method
//        divides the string at the specified regex and return and array of substrings
//        string.split(String regex, int limit)
//        regex - the string is divided at this regex
//        limit is optional and controls the number of resulting substrings
        String vowels = "a::b::c::d:e";
//        split the string at ::
//        storing the result in an array of strings
        String[] result = vowels.split("::");
        System.out.println(Arrays.toString(result));

//        charAt() getting characters from a String
        String message = "Welcome to Java";
        System.out.println("the first character of the message is: " + message.charAt(0));

//        equalsOrNot  if they refer to same string it returns true, if not it is false
//        equalsIgnoreCase - ignores capitalization

//        compareTo() method:compares the given string with the current string
        String compare1 = "hello";
        String compare2 = "hello";
        String compare3 = "hemlo";
        String compare4 = "flag";
        System.out.println(compare1.compareTo(compare2)); // 0 because they are equal
        System.out.println(compare1.compareTo(compare3)); //-1 becuase 'l' is one less than m
        System.out.println(compare1.compareTo(compare4)); // 2 because h is 2 times greater than f;

//        Substrings() method: extracts a substring from the string and returns it.
        String stringSub1 = "java is fun";
        System.out.println(stringSub1.substring(0,4));

//        indexOf() method: returns the index of the first occurrence of the character/substring within the string
        int result1;
//       getting index of character 's';
        result1 = stringSub1.indexOf('s');

//        lastIndexOf() method: will show the position of the last character/string
//          example: hello lake will shoe the position of the l in lake

        System.out.println(result); //6

        result1 = stringSub1.lastIndexOf("ava");

        System.out.println(result1); // the last occurrence of "ava" will print 1
        //so this would be 1, because it starts in index 1.

//        contains() method: checks whether the specified string is present in the string
        Boolean result2;
        result2 = stringSub1.contains("java");
        System.out.println(result2);//true

//        replace() method: replaces each matching occurence of the old character/text inn the string with the new character/text
        String stringReplace = "abc cba";
        System.out.println(stringReplace.replace('a','z'));

//        startsWith() method: checks if the string starts with the letter/string
//        endsWith() method: checks if the string ends with character/string

    }
}