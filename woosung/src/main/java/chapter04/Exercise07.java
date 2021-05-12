package chapter04;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {

		boolean run = true;
		
		int balance = 10000; // 자
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------");
			System.out.print("선택 > " );
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1 : 
				System.out.print("예금액>");
				int input = scanner.nextInt();
				balance += input;
				continue;
				
			case 2 :
				System.out.print("출금액>");
				int output = scanner.nextInt();
				balance -= output;
				continue;
			case 3 :
				System.out.println("잔고>" + balance);
				continue;
				
			case 4 : 
				System.out.println("프로그램 종료 ");
				break;
				
			default :
				System.out.println();
				continue;
			}
			
			break;
			
		}
		
	}

}
