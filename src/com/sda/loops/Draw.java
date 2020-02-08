package com.sda.loops;

public class Draw {
    public static void main(String[] args) {
        //drawRectangle(4, 5, 'X');
        //drawChequer(10, 10, 'X', 'O');
        //drawEmptyRectangle(10, 10, 'C');
        //drawRectangularTriangle(5, '.');
        //drawTree(3, '.');
        drawX(5, '0');
    }

    static void drawRectangle(int width, int height, char c) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    static void drawChequer(int width, int height, char c1, char c2) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(j % 2 == 0 ? c1 : c2);
            }
            char tmp = c1;
            c1 = c2;
            c2 = tmp;
            System.out.println();
        }
    }

    static void drawEmptyRectangle(int width, int height, char c) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1)
                    System.out.print(c);
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }

    static void drawRectangularTriangle(int size, char c) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                    System.out.print(c);
            }
            System.out.println();
        }
    }

    static void drawTree(int height, char c) {
        //int width = (height - 1) * 2 + 1;
        /*int center = width / 2;
        for (int t = 0; t < 3; t++) {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (j == center || (j >= center - i && j <= center + i))
                        System.out.print(c);
                    else
                        System.out.print(' ');
                }
                System.out.println();
            }
        }*/
        for (int t = 0; t < 3; t++) {
        int spaces = height-1;
        int chars = 1;
            for(int i=0; i<height; i++){
                /*//spaces
                for(int s = 0; s< spaces; s++){
                    System.out.print(' ');
                }//chars
                for (int ch = 0; ch< chars; ch++){
                    System.out.print(c);
                }*/
                int tempSpaces = spaces;
                int tempChars = chars;
                while(tempSpaces-->0)
                    System.out.print(' ');
                while(tempChars-->0)
                    System.out.print(c);
                spaces--;
                chars+=2;
                System.out.println();
            }
        }
    }

    static void drawX(int size, char c) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i || j == size - i - 1)
                    System.out.print(c);
                else
                    System.out.print('.');
            }
            System.out.println();
        }
    }
}