package com.seis635;

import java.util.Random;

public class round {
	public void roundobjects() {
	Random die1 = new Random();
	Random die2 = new Random();

	Random die3 = new Random();
	Random die4 = new Random();

	int counter;
	int hrolls = 10;
	int sides = 6;{


	for(counter=0; counter < hrolls; ++counter) {
		int rollnumber = counter +1;
		int x = die1.nextInt(sides);
	++x;

	int y = die2.nextInt(sides);
	++ y;





	int p = die3.nextInt(sides);
	++p;

	int q = die4.nextInt(sides);
	++ q;
	System.out.println("Player 1 Round " + rollnumber + " die 2 rolled a " +y);
	System.out.println("Player 1 Round " + rollnumber + " die 1 rolled a " +x);
	System.out.println("Player 2 Round " + rollnumber + " die 1 rolled a " +p);
	System.out.println("Player 2 Round " + rollnumber + " die 2 rolled a " +q);;
}}}}