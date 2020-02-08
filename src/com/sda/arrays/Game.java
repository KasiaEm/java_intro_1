package com.sda.arrays;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        game();
    }

    static char[][] prepareTable() {
        char table[][] = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = '_';
            }
        }
        return table;
    }

    static void printTable(char table[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void game() {
        char table[][] = prepareTable();
        boolean isCross = false;

        while (true) {
            boolean gameOver = false;
            printTable(table);
            System.out.println("Move of the " + (isCross ? "X" : "O"));
            Scanner scanner = new Scanner(System.in);
            System.out.print("Choose row> ");
            int row = scanner.nextInt() - 1;
            System.out.print("Choose column> ");
            int col = scanner.nextInt() - 1;
            if (table[row][col] == '_') {
                table[row][col] = isCross ? 'X' : 'O';
            }
            gameOver = checkIfGameIsOver(table);
            if (gameOver) {
                break;
            }
            isCross = !isCross;
        }
        printTable(table);
        System.out.println("The winner is " + (isCross ? "X" : "O"));
    }

    static boolean checkIfGameIsOver(char table[][]) {
        //check rows
        for (int i = 0; i < 3; i++) {
            if (table[i][0] != '_' && table[i][0] == table[i][1] && table[i][1] == table[i][2]) {
                return true;
            }
        }
        //check cols
        for (int i = 0; i < 3; i++) {
            if (table[0][i] != '_' && table[0][i] == table[1][i] && table[1][i] == table[2][i]) {
                return true;
            }
        }
        //check diagonal
        if ((table[0][0] != '_' && table[0][0] == table[1][1] && table[1][1] == table[2][2]) || (table[0][2] != '_' && table[0][2] == table[1][1] && table[1][1] == table[2][0])) {
            return true;
        }
        //check it there's no more space
        boolean noSpace = true;
        for (int i=0; i<3; i++) {
            for(int j=0; j<3; j++){
                if(table[i][j]=='_') {
                    noSpace=false;
                    break;
                }
            }
        }
        if (noSpace) {
            System.out.println("No available space.");
            return noSpace;
        }
        return false;
    }
}
