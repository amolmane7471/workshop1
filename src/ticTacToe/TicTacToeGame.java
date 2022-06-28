package ticTacToe;
import java.util.Scanner;
public class TicTacToeGame {
	
public static void BoardUc1(char[][] board){
	System.out.println("Board:");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;++j)
		{
		System.out.print(board[i][j]='-');
		}
		System.out.println();
	}
	
}
			
	public static void ChooseXOrOUc2()
	{
		int player, player1=1,player2=2,computer=3;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1 for player1 , enter 2 for player2 & enter 3 for computer:");	
	player=sc.nextInt();
	if(player==player1)
		System.out.println("player 1 is select");
			else if(player==player2)
	    System.out.println("player 2 is select");
		else
		System.out.println("you choosen computer");

     
	}
	
	
	
	
	public static void main(String[] args) {
		char [][] board=new char[3][3];
		System.out.println("Welcome to 3*3 Tic Tac Toe Game");
		BoardUc1(board);
		ChooseXOrOUc2();

	}
}
