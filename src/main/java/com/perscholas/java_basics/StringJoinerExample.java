package com.perscholas.java_basics;
import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args){
        StringJoiner joinNames = new StringJoiner(",");
//        passing comma as a delimiter
//        ---- Adding values to the string Joiner ---
        joinNames.add("Java");
        joinNames.add("Python");
        joinNames.add("C Sharp");
        joinNames.add("Javascript");
        System.out.println(joinNames);
//        new StringJoiner(delimiter, prefix, suffix
        StringJoiner joinCities = new StringJoiner(",", "[","]");
        joinCities.add("Dallas");
        joinCities.add("Chicago");
        System.out.println(joinCities);

//         creating StringJoiner with :(colon) delimiter
        StringJoiner joinName2 = new StringJoiner(":","[","]");
        joinName2.add("New York");
        joinName2.add("New Jersey");
        System.out.println(joinName2.toString());

        StringJoiner mergeNames = joinCities.merge(joinName2);
        System.out.println(mergeNames);


    }
}
