package com.tom;

import java.util.Random;

public class Poker {
	int[] cards = new int[52];
	public Poker(){
		for(int i=0; i<52; i++){
			cards[i] = i;
		}
	}
	
	public void qwe(){
		for(int i=0; i<52; i++){
			int flower = cards[i]/13;
			char c = 0;
			switch(flower) {
			case 0:
				c = 'S';
				break;
			case 1:
				c = 'H';
				break;
			case 2:
				c = 'D';
				break;
			case 3:
				c = 'C';
				break;
				
//			Random random = new Random();
//			int rcard = random.nextInt(13)+1;
//			String alpha = "SHCD";
//			int A = alpha.length();
			
//			for(int i = 1; i<=13; i++){
//				System.out.print(rcard);
//				System.out.print(alpha.charAt(random.nextInt(A)));
//				
//				break;
			}
			
			System.out.print(cards[i]%13+1 + "" + c + " ");
			if(i%13 == 12)
				System.out.println();
		}
	}

}
