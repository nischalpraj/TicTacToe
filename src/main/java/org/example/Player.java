package org.example;

import java.util.Scanner;

public class Player {
    String name;

    Player(String type){
        Scanner sc = new Scanner(System.in);

        if(type == "X"){
            System.out.println("Player selecting X. Please enter your name");
            name=sc.nextLine();
        }
        else if( type == "O"){
            System.out.println("Player selecting O. Please enter your name");
            name=sc.nextLine();
        }
    }
}
