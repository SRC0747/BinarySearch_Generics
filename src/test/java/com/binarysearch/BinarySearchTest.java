package com.binarysearch;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    public static void main(String[] args) {
        String[] words = {"Alpha", "Bravo", "Charlie", "Delta", "Echo",
                "Foxtrot", "Golf", "Hotel", "India", "Juliet", "Kilo", "Lima",
                "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo",
                "Sierra", "Tango", "Uniform", "Victor", "Whiskey", "X-Ray",
                "Yankee", "Zulu"};
        BinarySearch<String> searcher = new BinarySearch<String>(words);
        System.out.println(searcher.search("November"));
        System.out.println("Expected: 13");
        System.out.println(searcher.search("October"));
        System.out.println("Expected: -1");
    }
}