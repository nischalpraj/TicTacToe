package org.example;

import java.util.Scanner;

public class Game {
    Scanner sc=new Scanner(System.in);
    Board board= new Board();
    Player player1= new Player("X");
    Player player2= new Player("O");

    Player currentPlayer= player1;

    void Play(){
        String message = "enter the position (1 - 9):";
        while(true){
            System.out.println(currentPlayer.name+ " "+ message);
            int position=sc.nextInt();

            if (board.updateBoard(position, currentPlayer.type)) {

                board.printBoard();

                if (board.checkWinner(currentPlayer.type)) {
                    System.out.println(currentPlayer.name + " wins!");
                    break;
                }


                else if (board.checkDraw()) {
                    System.out.println("Game is a draw!");
                    break;
                }

                else {
                    if (currentPlayer == player1) {
                        currentPlayer = player2;
                    }

                    else {
                        currentPlayer = player1;
                    }

                }
            }

        }
    }
}
