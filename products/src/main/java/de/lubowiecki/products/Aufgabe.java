package de.lubowiecki.products;

public class Aufgabe {
    public static void main(String[] args) {
        int[] a = {3,2,1,0};
        int y = a.length;
        while(y >= 0) {
            System.out.print(a[--y]);
        }
    }
}