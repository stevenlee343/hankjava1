package com.tom;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		int n = 4;
		int[] inte = new int[52];
		
		Card c = new Card(0);
		System.out.println(c.get());
		
		Poker poker = new Poker();
		poker.qwe();
		
		
//		Random random = new Random();
//		int rcard = random.nextInt(13)+1;
//		String alpha = "SHCD";
//		int A = alpha.length();
//		for(int i = 1; i<=13; i++){
//			System.out.print(rcard);
//			System.out.print(alpha.charAt(random.nextInt(A)));
//			
//			break;
//		}

	}
	

}


