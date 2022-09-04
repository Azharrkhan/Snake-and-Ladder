package com.bl.snakeandladder;

import java.util.Random;

import javax.management.ValueExp;

public class SnakeLadderSimulator {
	public static void main(String[] args) {
//	Single player at start position 0
		int position = 0;
		System.out.println("Player position is: " + position);
		while(position <= 100) {
//	Player rolls the dice to get a number between 1 to 6
		Random rn = new Random();
		int dice = 1 + rn.nextInt(6);
	
		System.out.println("dice number is :" + dice);
		
//	The player then checks for an option
		final byte ladder = 1;
		final byte snake = 2;
		int movesAhead;
		int movesBehind;
		
		int option = rn.nextInt(2);
		
		System.out.println("Option is: " + option);
		
		switch (option){
		case ladder: 
			movesAhead = dice + position; 
			position += dice;
//			System.out.println("Player already reached");
			if(movesAhead == 100) { 
				System.out.println("Player already reached");
				movesAhead = 100;
				break;
			}
			else {
				System.out.println("Player moves ahead by: " +movesAhead);
			}
			break;
//			System.out.println("Player moves ahead by: " +movesAhead);
//			break;
//			System.out.println("Player moves ahead by: " +movesAhead);
		
		case snake:
			movesBehind = dice - position; 
			position -= dice;
			System.out.println("Player moves behind by: " +movesBehind);
		break;
		
		default:
			
			System.out.println("Player stays on same position");
		}
		}
	}
}
