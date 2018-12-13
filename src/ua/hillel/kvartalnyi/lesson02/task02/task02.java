package ua.hillel.kvartalnyi.lesson02.task02;

import java.util.*;

public class task02 {
    public static void main(String[] args) {
        Scanner n;
        n = new Scanner(System.in);
        System.out.println("Ввод размер массива");
        int num = n.nextInt();
        int mas[] = new int[num];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i+1;
        }
        System.out.print(Arrays.toString(mas));
    }
}