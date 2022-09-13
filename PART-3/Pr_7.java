// Write a program that illustrates the significance of interface default method.

// Ankit Savani (21CE122)

import Pr_3_7.Pr_3_7;
import java.util.Objects;
import java.util.Scanner;

class main implements Pr_3_7 {
    Scanner sc = new Scanner(System.in);
    private int totalC;
    int sum = totalC;

    @Override
    public void placeOreder() {
        System.out.println(" ** List of food **");
        System.out.println("Burger, Pizza, Vadapav, Franki");
        System.out.println("Place your order : ");
        int flag = 1;
        int burger = 40;
        int pizza = 70;
        int vadapav = 25;
        int franki = 35;
        while (flag == 1) {
            String order = sc.next();
            System.out.println("Enter 1 for place the next order or else enter 0 to exit : ");
            flag = sc.nextInt();
            if (Objects.equals(order, "burger"))
                sum += burger;
            if (Objects.equals(order, "pizza"))
                sum += pizza;
            if (Objects.equals(order, "vadapav"))
                sum += vadapav;
            if (Objects.equals(order, "franki"))
                sum += franki;
        }
    }

    @Override
    public void totalCost() {
        System.out.println("Total Cost : " + sum);
        System.out.println("***Hope you enjoyed the food***");
    }
}

public class Pr_7 {
    public static void main(String[] args) {
        main r = new main();
        r.placeOreder();
        r.totalCost();
    }
}


