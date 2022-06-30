//hollowButterfly(rows);

import java.util.*;
public class Main {
    public static void solidRectangle(int r, int c){
        for (int i =0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }
    public static void hollowRectangle(int r, int c){
        for (int i = 0;i<r;i++){
            for (int j = 0;j<c;j++){
                if (j==0||j==(c-1)||i==0||i==(r-1)){
                    System.out.print("*");
                }else System.out.print(" ");
            }System.out.println(" ");
        }
    }
    public static void halfPyramid(int r, int c){
        for (int i = 0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                if (j > i) {
                    System.out.print(" ");
                } else System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void invertedPlusRotated(int r, int c){
        for (int i = 0;i<=r;i++) {
            for (int j = 0; j <= c; j++) {
                if (j <= i) {
                    System.out.print(" ");
                } else System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void inverted(int r,int c){
        for (int i = 0;i<r;i++){
            for (int j = c;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void mirroredPyramid(int r,int c){
        for (int i = (r-1);i>=0;i--){
            for (int j =0;j<c;j++){
                if (j>=i){
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void fullPyramid(int n){
                for (int i=0; i<n; i++) {
                    for (int j=n-i; j>1; j--) {
                        System.out.print(" ");
                    }
                    for (int j=0; j<=i; j++ ) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
    public static void invertedFullPyramid(int n){
        for (int i=n; i>=0; i--) {
            for (int j=n-i; j>=1; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void solidDiamond(int n){
        for (int j = 1;j<=n;j++){
            for (int i = 1; i<=n-j; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= (2*j)-1; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int j = n;j>=1;j--){
            for (int i = 1; i<=n-j; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= (2*j)-1; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    public static void rhombus(int n){
        for (int i=1;i<=n;i++){
            for (int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j= 1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void hollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n) {
                        System.out.print("*");
                    } else System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void horizontalPy(int n){
        for (int j = 1;j<=n;j++){
            for (int i = 1; i<=n-i; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= (2*j)-1; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int j = n;j>=1;j--){
            for (int i = 1; i<=n-i; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= (2*j)-1; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void hollowDiamond(int rows){
        int i ,j;
        for(i=1; i<=rows; i++){
            for(j=rows; j>i; j--){
                System.out.print(" ");//print space
            }
            System.out.print("*");  //print star
            for(j=1; j<(i-1)*2; j++){
                System.out.print(" ");
            }
            if(i==1){
                System.out.println(" ");//move to next line
            }
            else{
                System.out.print("*\n");
            }
        }
        //print lower triangle
        for(i=rows-1; i>=1; i--){
            for(j=rows; j>i; j--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(j=1; j<(i-1)*2; j++){
                System.out.print(" ");
            }
            if(i==1){
                System.out.println(" ");//move to next line
            }
            else{
                System.out.print("*\n");
            }
        }
    }
    public static void christmas(){
        int height = 4;
            //Assigning Width
            int width = 5;

            //Assigning Space
            int space = width*5;

            int x = 1;

            //Code to Print Upper Part of the Tree i.e. Pyramids.
            for(int a = 1;a <= height ;a++){

                for(int i = x;i <= width;i++){

                    for(int j = space;j >= i;j--){

                        System.out.print(" ");
                    }

                    for(int k = 1;k <= i;k++){

                        System.out.print("* ");
                    }

                    System.out.println();
                }

                x = x+2;
                width = width+2;
            }


            //Printing Branch of Christmas Tree
            for(int i = 1;i <= 4;i++){

                for(int j = space-3;j >= 1;j--){

                    System.out.print(" ");
                }

                for(int k= 1;k <= 4;k++){
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    public static void diaInRect(int rows){
        for (int i=1; i<=rows; i++)
        {
            for (int j = i; j <= rows; j++)
            {
                System.out.print("*");
            }
            for (int k = 1; k <= i*2-2; k++)
            {
                System.out.print(" ");
            }
            for (int l = i; l <= rows; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            for (int k = i*2-2; k < rows*2-2; k++)
            {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void hollowFullPyramid(int rows) {
       for (int i=1; i<=rows; i++)
        {
            // Print space in decreasing order
            for (int j=rows; j>i; j--)
            {
                System.out.print(" ");
            }
            // Print star in increasing order
            for (int k=1; k<=(i * 2) -1; k++)
            {
                if( k == 1 || k == (i * 2) -1 || i == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(17);
        switch (x) {
            case 0 -> hollowDiamond(10);
            case 1 -> rhombus(10);
            case 2 -> solidRectangle(8, 9);
            case 3 -> invertedPlusRotated(8, 8);
            case 4 -> mirroredPyramid(8, 8);
            case 5 -> horizontalPy(8);
            case 6 -> halfPyramid(7, 7);
            case 7 -> hollowRectangle(9, 8);
            case 8 -> christmas();
            case 9 -> hollowRhombus(8);
            case 10 -> invertedFullPyramid(8);
            case 11 -> diaInRect(8);
            case 12 -> inverted(8, 8);
            case 13 -> fullPyramid(8);
            case 14 -> solidDiamond(7);
            case 15 -> butterfly(7);
            case 16 -> hollowFullPyramid(9);
        }
        }
    }
