package ua.hillel.kvartalnyi.lesson02.task02;
import java.util.*;
public class task02 {
    public static void main(String[] args) {
        int n = 10;
        n=n+1;
        int mas[]= new int[n];
        for (int i = 0; i < mas.length;i++) {
            mas[i] = i;
        }
            System.out.print(Arrays.toString(mas));

    }
}


