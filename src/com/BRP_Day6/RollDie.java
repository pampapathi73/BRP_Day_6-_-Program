package com.BRP_Day6;

public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int SIDES = 6;   
		 
        int roll = (int) (Math.random() * SIDES) + 1;
 
        System.out.println(roll);

	}

}
