 package com.rakuten.reverse;

public class ReverseNumber {
public static void main(String[] args) {
	int n1 = 123;
	String nums = n1+"";
	String reverse = "";
	for(int i = nums.length()-1; i>=0; i--){
		reverse = reverse + nums.charAt(i);
	}
	int n = Integer.parseInt(reverse);
	System.out.println(n); 
}
}