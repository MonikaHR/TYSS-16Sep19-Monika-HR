package co.testyantra.exception.second;

import java.util.Scanner;

public class TestC {
	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);                 //connection is not closed we should close by mentioning sc.close();

		try(Scanner sc = new Scanner(System.in)){              //try with resouses automatically it close the connection

			System.out.println("Enter age");
			int age = sc.nextInt();
			System.out.println("age is "+age);

			System.out.println(age/0);
		}

		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}

		finally {
			System.out.println("finally executed");
		}

	}
}
