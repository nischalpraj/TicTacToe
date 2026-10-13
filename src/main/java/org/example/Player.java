package org.example;

import java.util.Scanner;

public class Player {
    String name;
    String type;

    Player(String type) {
        this.type = type;

        Scanner sc = new Scanner(System.in);

        if (type.equals("X")) {
            System.out.println("Player selecting X. Please enter your name:");
            name = sc.nextLine();
        } else if (type.equals("O")) {
            System.out.println("Player selecting O. Please enter your name:");
            name = sc.nextLine();
        }
    }
}