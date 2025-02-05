package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number to find all the primes within it: ");
		int n = in.nextInt();
		
		int[] numbers = new int[n+1]; 
		boolean[] isPrime = new boolean[n+1];
		int i = 0;
		isPrime[0] = true;
		
		for (int num = 2; num < numbers.length; num++) {
			numbers[i] = num;
			System.out.println(numbers[i]);
			i++;
		} 
		for (int j = 0; j <= isPrime.length; j++) {
			if(numbers[j] % 2 != 0) {
				isPrime[j] = true;
				System.out.println(isPrime[j]);
			}
			else {
				System.out.println("false");
			}
		
		}
	
		
				 
		}

	}
