package com.sda.strings;

import java.util.Random;

public class Strings {
    public static void main(String[] args) {
        //a
        System.out.println(deleteSubstring("abcdabefabghabij", "ab"));

        //b
        System.out.println(countWords("One, two, three, four, five."));

        //c
        System.out.println(toTele("Hi, I sent you a message. Please, call me."));

        //d
        System.out.println(randomSmile("Hi, I sent you a message. Please, call me."));

        //e
        System.out.println(revert("String."));

        //f
        System.out.println(isAnagram("SDATEAM", "tEaMsDa"));

        //g
        areAnagrams("SDATEAM", "tEaMsDa", "stdmaae", "temadsa", "asaffw");

        //h
        System.out.println(stringRepresentation(123456789));

        //i
        System.out.println(camelCase("this is my text"));

        //j
        System.out.println(cesear("Hi, I sent you a message. Please, call me.", 2));

        //k
        showNumbers("Bla bla 1.23, bla 4, 5, 6.");

        //l
        System.out.println(isSymetric("asn1234554321nsa"));

        //m
        countLetters("asd ks dfjae hf slfqwrofi eptogkkpt");

        //n
        htmlText("“<html>\n<head></head>\n<body>\n<p>Tekst1 \n<div>Tekst2 </div>\n<p>Tekst3 \n</body>\n</html>");

    }

    //a
    static String deleteSubstring(String text, String substring) {
        return text.replace(substring, "");
    }

    //b
    static int countWords(String text) {
        return text.split(" ").length;
    }

    //c
    static String toTele(String text) {
        String stop = " STOP";
        return text.replace(",", stop).replace(".", stop);
    }

    //d
    static String randomSmile(String text) {
        String[] words = text.split(" ");
        String result = "";
        for (String word : words) {
            result += word + " ";
            //probability 1/4
            if (new Random().nextInt(4) == 1)
                result += ":D ";
        }
        return result;
    }

    //e
    static String revert(String text) {
        String tmp = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            tmp += (text.charAt(i));
        }
        return tmp;
    }

    //f
    static boolean isAnagram(String template, String toCheck) {
        template = template.toUpperCase();
        toCheck = toCheck.toUpperCase();
        if (template.length() != toCheck.length())
            return false;
        for (int i = 0; i < template.length(); i++) {
            String current = template.charAt(i) + "";
            if (toCheck.contains(current))
                toCheck = toCheck.replaceFirst(current, "");
            else
                return false;
        }
        return true;
    }

    //g
    static void areAnagrams(String template, String... strings) {
        for (String s : strings) {
            if (isAnagram(template, s)) {
                System.out.println(s + " is anagram of " + template);
            }
        }
    }

    //h
    static String stringRepresentation(int number) {
        String result = "";
        String text = String.valueOf(number);
        int beginningLength = text.length() % 3;
        for (int i = text.length() - 3; i >= 0; i -= 3) {
            result = " " + text.substring(i, i + 3) + result;
        }
        if (beginningLength > 0)
            result = text.substring(0, beginningLength) + result;
        return result;
    }

    //i
    static String camelCase(String text) {
        String tab[] = text.split(" ");
        String result = "";
        for (String part : tab) {
            result += part.substring(0, 1).toUpperCase() + part.substring(1);
        }
        return result;
    }

    //j
    static String cesear(String text, int offset) {
        char[] chars = text.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c != ' ' && c != '.' && c != ',')
                result += (char) (c + offset);
            else
                result += c;
        }
        return result;
    }

    //k
    static void showNumbers(String text) {
        char[] chars = text.toCharArray();
        for (char c : chars) {
            if (c >= '0' && c <= '9')
                System.out.print(c + " ");
        }
        System.out.println();
    }

    //l
    static boolean isSymetric(String text) {
        int center = text.length() / 2;
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i))
                return false;
        }
        return true;
    }

    //m
    static void countLetters(String text) {
        int[] counts = new int[26];
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current >= 'a' && current <= 'z')
                counts[text.charAt(i) - 97]++;
        }
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0)
                System.out.println((char) (i + 65) + ": " + counts[i]);
        }
    }

    //n
    static void htmlText(String html) {
        String[] lines = html.split("\n");
        String p = "<p>";
        String div = "<div>";
        for (String line : lines) {
            if (line.contains(p))
                System.out.println(line.substring(line.indexOf(p) + 3));
            if (line.contains(div))
                System.out.println(line.substring(line.indexOf(div) + 5, line.indexOf("</div>")));
        }
    }
}
