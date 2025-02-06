package com.java.prac;

import java.util.*;

public class GroupPatternString {

    // Method 1: Grouping strings by sorting characters
    public void GroupPatternStringByUsingSortArray(String arr[], Map<String, List<String>> m1){
        for(String s: arr){
            // Convert the string to char array and sort it
            char[] stringCharacters = s.toCharArray();
            Arrays.sort(stringCharacters);
            String sortedString = new String(stringCharacters);

            // Add the original string to the map under the sorted string key
            m1.putIfAbsent(sortedString, new ArrayList<>());
            m1.get(sortedString).add(s);
        }

        // Print the grouped anagrams
        System.out.println("Grouped by sorted array:");
        for(Map.Entry<String, List<String>> entry: m1.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    // Method 2: Grouping strings by comparing character counts
    public void GroupPatternStringByUsingCount(String arr[], Map<String, List<String>> m1){
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                String s1 = arr[j];
                if (s.length() == s1.length() && !s.equals(s1)) {
                    int count = 0;
                    // Compare each character of s with each character of s1
                    for (char c : s.toCharArray()) {
                        for (char c1 : s1.toCharArray()) {
                            if (c1 == c) {
                                count++;
                            }
                        }
                    }
                    // If count matches the length, then they are anagrams
                    if (count == s.length()) {
                        m1.putIfAbsent(s, new ArrayList<>());
                        m1.get(s).add(s1);
                    }
                }
            }
        }

        // Print the grouped strings
        System.out.println("Grouped by character count:");
        for(Map.Entry<String , List<String>> entry: m1.entrySet()) {
            System.out.println("{" + entry.getKey() + " -> " + entry.getValue() + "}");
        }
    }

    public static void main(String[] args) {
        String arr[] = {"abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm"};
        Map<String, List<String>> m1 = new HashMap<>();

        GroupPatternString groupPatternString = new GroupPatternString();

        // Group using the count method
        groupPatternString.GroupPatternStringByUsingCount(arr, m1);

        // Reset map to avoid combining results from both methods
        m1.clear();

        // Group using the sorted array method
        groupPatternString.GroupPatternStringByUsingSortArray(arr, m1);
    }
}
