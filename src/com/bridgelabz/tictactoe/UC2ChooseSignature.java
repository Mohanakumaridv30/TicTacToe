package com.bridgelabz.tictactoe;

public class UC2ChooseSignature {
    public static void main(String[] args) {
        System.out.println("Welcome To TIC TOC Board Game");
        char[][] gameBoard = {{'_', '|', '_', '|', '_'}, {'_', '|', '_', '|', '_'}, {'_', '|', '_', '|', '_'}};
        printBOARD(gameBoard);
        updateBoard(1,1,gameBoard);
    }

    public static void printBOARD(char [][] gameBoard){
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void updateBoard(int position,int player,char[][] gameBoard){
        char character;
        if (player==1){
            character='x';
        }else {
            character='o';
        }
        switch (position){
            case 1:
                gameBoard [0][0]=character;
                printBOARD(gameBoard);
                break;
            case 2:
                gameBoard[0][2]=character;
                printBOARD(gameBoard);
                break;
            case 3:
                gameBoard[0][4]=character;
                printBOARD(gameBoard);
                break;
            case 4:
                gameBoard[1][0]=character;
                printBOARD(gameBoard);
                break;
            case 5:
                gameBoard[1][2]=character;
                printBOARD(gameBoard);
                break;
            case 6:
                gameBoard[1][4]=character;
                printBOARD(gameBoard);
                break;
            case 7:
                gameBoard[2][0]=character;
                printBOARD(gameBoard);
                break;
            case 8:
                gameBoard[2][2]=character;
                printBOARD(gameBoard);
                break;
            case 9:
                gameBoard[2][4]=character;
                printBOARD(gameBoard);
                break;
            default:
                break;
        }
    }
}
