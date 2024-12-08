package com.ALGOLUTION.SET3;

import java.util.ArrayList;
import java.util.Arrays;

public class MrString {
    public static void main(String[] args) {
        int[] arr = {7, 4, 2};
        System.out.println("Pairs: " + pairs(arr));
    }

static String pairs(int[] arr) {
    ArrayList<String> list = new ArrayList<>();
    String[] name = {"one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
            "twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five",
            "twenty-six", "twenty-seven", "twenty-eight", "twenty-nine", "thirty",
            "thirty-one", "thirty-two", "thirty-three", "thirty-four", "thirty-five",
            "thirty-six", "thirty-seven", "thirty-eight", "thirty-nine", "forty",
            "forty-one", "forty-two", "forty-three", "forty-four", "forty-five",
            "forty-six", "forty-seven", "forty-eight", "forty-nine", "fifty",
            "fifty-one", "fifty-two", "fifty-three", "fifty-four", "fifty-five",
            "fifty-six", "fifty-seven", "fifty-eight", "fifty-nine", "sixty",
            "sixty-one", "sixty-two", "sixty-three", "sixty-four", "sixty-five",
            "sixty-six", "sixty-seven", "sixty-eight", "sixty-nine", "seventy",
            "seventy-one", "seventy-two", "seventy-three", "seventy-four", "seventy-five",
            "seventy-six", "seventy-seven", "seventy-eight", "seventy-nine", "eighty",
            "eighty-one", "eighty-two", "eighty-three", "eighty-four", "eighty-five",
            "eighty-six", "eighty-seven", "eighty-eight", "eighty-nine", "ninety",
            "ninety-one", "ninety-two", "ninety-three", "ninety-four", "ninety-five",
            "ninety-six", "ninety-seven", "ninety-eight", "ninety-nine", "hundred"};
    for (int i = 0; i < arr.length; i++) {
        list.add(name[arr[i] - 1]);
    }
    int vowelSum = 0;
    for (int i = 0; i < list.size(); i++) {
        vowelSum = vowelSum + countVowel(list.get(i));
    }

    int countPairs = 0;

    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] + arr[j] == vowelSum) {
                countPairs++;
            }
        }
    }
    System.out.println(Arrays.toString(arr));
    System.out.println(list);
    System.out.println("vowelSum: " + vowelSum);
    if(countPairs == 0){
        return "zero";
    }
    else{
        return name[countPairs - 1];
    }
}

    static int countVowel(String str) {
        int count = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                count++;
            }
        }
        return count;
    }
}
