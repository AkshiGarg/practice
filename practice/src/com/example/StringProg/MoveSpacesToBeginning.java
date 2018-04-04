package com.example.StringProg;

public class MoveSpacesToBeginning {

	public static void main(String[] args) {
		String s = "Hi how are you?";
		char[] c = s.toCharArray();
		
		int j = c.length;
		for(int i = c.length - 1; i >= 0 ; i--) {
			if(c[i] != ' ') {
				j--;
				swap(c,i,j);
			}
		}
		
		System.out.println(new String(c));
	}

	private static void swap(char[] c, int i, int j) {
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}
}
