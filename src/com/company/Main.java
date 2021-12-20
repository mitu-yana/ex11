package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
            System.out.println("введите число");
            Scanner L = new Scanner(System.in);
            String str = L.next();
            System.out.println("введите еще число");
            int numb = L.nextInt();
        System.out.println("Наибольшее число");
        System.out.println(Math.max(numb, Integer.parseInt(str)));
        System.out.println("Наименьшее число");
        System.out.println((double) Math.min(numb, Integer.parseInt(str)));

    }
}
