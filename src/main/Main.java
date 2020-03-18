package main;


import java.util.Scanner;

import view.FrameMain;

public class Main {
	public static void main(String[] args) {
		FrameMain mainFrame = new FrameMain("CIMOL");
		Scanner input = new Scanner(System.in);
		int in = -1;
		try {
			in = input.nextInt();
		} catch (Exception e) {
			System.out.println("wrong input");
		}
		
		System.out.println(""+in);	
	}
}
