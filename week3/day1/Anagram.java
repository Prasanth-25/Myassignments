package week3.day1;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1="stops";
        String s2="potss";
        if(s1.length()==s2.length())
        {
            char[] s1Arr = s1.toCharArray();
            char[] s2Arr = s2.toCharArray();
            Arrays.sort(s1Arr);
            Arrays.sort(s2Arr);
            boolean equals = Arrays.equals(s1Arr, s2Arr);
            if(equals==true)
            {
                System.out.println("The given strings are Anagram");
            }
            else
            {
                System.out.println("The given strings are not an Anagram");
            }
        }
        else
        {
            System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
        }
    }
}
