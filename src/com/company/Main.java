package com.company;

public class Main {

    public static void main(String[] args) {
        //A nested for loop
        int max=9;
        for(int row=1; row <= max; row++){
            for(int col=1;col<= row; col++){
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
