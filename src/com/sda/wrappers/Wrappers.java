package com.sda.wrappers;

public class Wrappers {
    public static void main(String[] args) {
        //a
        System.out.println(sum("1.25", "2.25", "3.25"));

        //b
        String[] tab = new String[]{"Adam is 15", "Eve turns 30", "Jim is almost 21"};
        System.out.println(whoIsTheOldest(tab));
    }

    //a
    static String sum(String... nums) {
        double sum = 0;
        for (String num : nums)
            sum += Double.parseDouble(num);
        return String.valueOf(sum);
    }

    //b
    static String whoIsTheOldest(String[] tab) {
        int maxAge = 0;
        String name = "";
        for (String sentence : tab){
            String[] words = sentence.split(" ");
            int age = Integer.parseInt(words[words.length-1]);
            if(age>maxAge) {
                maxAge = age;
                name = words[0];
            }
        }
        return name;
    }
}
