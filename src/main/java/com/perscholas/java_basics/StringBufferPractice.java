package com.perscholas.java_basics;

public class StringBufferPractice {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("Java Full Stack Developer");
        int len = str.length();
        System.out.println("Length : " + len);

        int cap = str.capacity();
        System.out.println("Capacity: " + cap);

//        ------- append()

        str.append(" and Software Eng "); //append a string in the previously defined string
        System.out.println(str);

        str.append("Java is my favorite language ");
        str.append("but i love python");
        System.out.println(str);

//        ------reverse()
        StringBuffer stringName  = new StringBuffer("Welcome to Per Scholas");
        stringName.reverse();
        System.out.println(stringName);

//        ----insert
        StringBuffer s = new StringBuffer("Java");
        s.insert(4, "Language");
        System.out.println(s);

//        -------- replace()
        StringBuffer sT = new StringBuffer("Java");
        sT.replace(0,2,"Hello");
        System.out.println(sT);

        StringBuffer string1 = new StringBuffer("Welcome to Java Fullstack");
        System.out.println("Original string " + string1);
        System.out.println("substring with start index: " + str.substring(5));
        System.out.println("Substring with start and end index: " + str.substring(5,10));
    }
}
