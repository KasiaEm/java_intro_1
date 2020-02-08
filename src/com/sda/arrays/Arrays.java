package com.sda.arrays;

public class Arrays {
    public static void main(String[] args) {
        //1.a
        System.out.println(contains(new char[]{'c', 'e', 'h'}, 'h'));

        //1.b
        System.out.println("index of " + indexOf(new char[]{'c', 'e', 'h'}, 'h'));

        //1.c
        System.out.println("avg " + average(1, 4, 6, 7));

        //1.d
        System.out.println("max " + max(4, 6, 2, 1));

        //1.e
        System.out.println("min " + min(4, 7, 3, 8));
        min(1,2);
        min(2, 3, 4, 5, 6, 7, 8, 0);

        //1.f
        System.out.println("duplicated " + duplicated(new int[]{1, 2, 3, 4, 6}));

        //1.g
        System.out.print("without duplicates ");
        printWithoutDuplicates(new int[]{1, 2, 2, 3, 4, 5, 4});

        //1.h
        System.out.print("common characters ");
        printCommonCharacters(new char[]{'a', 'b', 'c', 'd'}, new char[]{'c', 'd', 'e', 'f'});

        //1.i
        System.out.println("are equal? " + tablesEqual(new int[]{1, 2, 3}, new int[]{1, 2, 4}));

        //1.j
        revertTable2(new char[]{'a', 'b', 'c'});

        //1.k
        printIntTable(deleteIndex(new int[]{0, 1, 2, 3, 4}, 3));

        //1.l
        printIntTable(addElement(new int[]{1, 2, 3, 4}, 5));

        //1.m
        System.out.println("occurrences " + countOccurrences(new char[]{'a', 'b', 'a', 'c'}, 'a'));

        //1.n
        char tableWithoutCharacter[] = removeCharacter(new char[]{'a', 'b', 'a', 'c'}, 'a');
        for (char c : tableWithoutCharacter) {
            System.out.print(c + " ");
        }
        System.out.println();

        //1.o
        printIntTable(moveZeros(new int[]{0, 1, 2, 0, 4, 5}));

        //1.p
        System.out.println("max-min=" + minMaxDifference(new int[]{4, 2, 6, 7, 3}));
    }

    //1.a
    static boolean contains(char tab[], char c) {
        for (char i : tab) {
            if (i == c)
                return true;
        }
        return false;
    }

    //1.b
    static int indexOf(char tab[], char c) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == c)
                return i;
        }
        return -1;
    }

    //1.c
    static double average(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (double) sum / nums.length;
    }

    //1.d
    static int max(int... nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        return max;
    }

    //1.e
    static int min(int... nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
        }
        return min;
    }

    //1.f
    static boolean duplicated(int tab[]) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] == tab[j])
                    return true;
            }
        }
        return false;
    }

    //1.g
    static void printWithoutDuplicates(int tab[]) {
        for (int i = 0; i < tab.length; i++) {
            boolean duplicated = false;
            for (int j = 0; j < tab.length; j++) {
                if (i != j && tab[i] == tab[j]) {
                    duplicated = true;
                    break;
                }
            }
            if (!duplicated) {
                System.out.print(tab[i] + " ");
            }
        }
        System.out.println();
    }

    //1.h
    static void printCommonCharacters(char tab1[], char tab2[]) {
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab2.length; j++) {
                if (tab1[i] == tab2[j])
                    System.out.print(tab1[i] + " ");
            }
        }
        System.out.println();
    }

    //1.i
    static boolean tablesEqual(int tab1[], int tab2[]) {
        if (tab1.length != tab2.length)
            return false;
        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] != tab2[i])
                return false;
        }
        return true;
    }

    //1.j
    static char[] revertTable(char tab[]) {
        char[] result = new char[tab.length];
        for (int i = 0; i < tab.length; i++) {
            result[result.length - 1 - i] = tab[i];
        }
        for (char i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
        return result;
    }

    //1.j
    static char[] revertTable2(char tab[]) {
        char[] result = new char[tab.length];
        int maxIndex = tab.length - 1;
        for (int i = maxIndex; i >= 0; i--) {
            result[maxIndex - i] = tab[i];
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        return result;
    }

    //1.k
    static int[] deleteIndex(int tab[], int index) {
        int result[] = new int[tab.length - 1];
        int j = 0;
        for (int i = 0; i < tab.length; i++) {
            if (i != index)
                result[j++] = tab[i];
        }
        return result;
    }

    //1.l
    static int[] addElement(int tab[], int num) {
        int result[] = new int[tab.length + 1];
        for (int i = 0; i < tab.length; i++) {
            result[i] = tab[i];
        }
        result[result.length - 1] = num;
        return result;
    }

    //1.m
    static int countOccurrences(char tab[], char c) {
        int count = 0;
        for (char el : tab) {
            if (el == c)
                count++;
        }
        return count;
    }

    //1.n
    static char[] removeCharacter(char tab[], char c) {
        int count = countOccurrences(tab, c);
        char result[] = new char[tab.length - count];

        int i = 0;
        for (char el : tab) {
            if (el != c)
                result[i++] = el;
        }
        return result;
    }

    //1.o
    static int[] moveZeros(int tab[]) {
        int count = 0;
        int result[] = new int[tab.length];

        int i = 0;
        for (int num : tab) {
            if (num != 0) {
                result[i++] = num;
            } else {
                count++;
            }
        }
        for (int j = 0; j < count; j++) {
            result[i++] = 0;
        }
        return result;
    }

    //1.p
    static int minMaxDifference(int tab[]) {
        return max(tab) - min(tab);
    }

    //...
    static void printIntTable(int tab[]) {
        for (int num : tab)
            System.out.print(num + " ");
        System.out.println();
    }
}
