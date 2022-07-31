//Guess number game

import java.util.*;
class number_game {
	public static void guess_num() {
		Scanner sc=new Scanner(System.in);
		int n;
		int rounds=5,guess,i,repeat,points=0;
		System.out.println("Hi Gamer!! This is guess number game");
		System.out.println("Input a number between 1 to 100");
		for(i=0;i<5;i++) {
			 n=1+(int)(100*Math.random());//random num generation
			System.out.println("Guess the number");
			guess=sc.nextInt();
			if(guess>100 || guess<0) {
				System.out.println("Bad Input!!");
			}
			else if(guess==n) {
				System.out.println("Hurray!! You guessed right");

				points+=5;
				System.out.println("your score"+points);
			}
			else if(guess>n && i!=rounds-1) {
				System.out.println("Oops!Your "+guess+" is greater than "+n);
			}
			else if(guess<n && i!=rounds-1) {
				System.out.println("Oops!Your "+guess+" is less than "+n);
			}

		}
		if(rounds==i) {
			System.out.println("Round is completed");
			System.out.println("Do you want to continue...");
			System.out.println("Enter 1 for continue...");
			repeat=sc.nextInt();
			if(repeat==1) {
				guess_num();
			}
			else {
				System.out.println("Great time!");
			}
		}

	}

	public static void main(String[] args) {
		guess_num();


	}

}