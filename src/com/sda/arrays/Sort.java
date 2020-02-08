package com.sda.arrays;

public class Sort {
    public static void main(String[] args) {
        int tab[] = new int[]{2, 4, 5, 6, 3, 2, 5, 6};
        int tab2[] = new int[]{2, 4, 5, 6, 3, 2, 5, 6, 1};

        Arrays.printIntTable(countingSort(tab));
        bubbleSort(tab);
        Arrays.printIntTable(tab);
        System.out.println("median " + median(tab));

        Arrays.printIntTable(countingSort(tab2));
        System.out.println("median " + median(tab2));
    }

    static int[] countingSort(int tab[]) {
        int max = Arrays.max(tab);
        int occurrences[] = new int[max + 1];
        int result[] = new int[tab.length];

        for (int num : tab) {
            occurrences[num]++;
        }

        int resultIndex = 0;
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < occurrences[i]; j++) {
                result[resultIndex++] = i;
            }
        }
        return result;
    }

    static void bubbleSort(int tab[]) {
        boolean change = false;
        do {
            change = false;
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    int tmp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = tmp;
                    change = true;
                }
            }
        } while (change);
    }

    static double median(int tab[]) {
        int sorted[] = countingSort(tab);
        if (sorted.length % 2 == 1) {
            return sorted[(sorted.length-1) / 2];
        } else {
            return (double) (sorted[(sorted.length-1) / 2] + sorted[(sorted.length-1) / 2 + 1]) / 2;
        }
    }
}
