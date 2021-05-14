package chapter05;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------");
			System.out.print("선택 > ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				System.out.print("학생 수>");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]: ");
					scores[i] = sc.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < 3; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			} else if(selectNo == 4) { 
				int max = 0;
				double avg = 0.0;
				int total = 0;
				
				for(int i = 0; i < scores.length; i++) {
					if(scores[i] > max) {
						max = scores[i];
					}
					total += scores[i];
				}
				avg = total/scores.length;
				
				System.out.println("최고점수:" + max);
				System.err.println("평균점수:" + avg);
			}
			else if (selectNo == 5) {
				System.out.println("프로그램 종료. ");
				break;
			}
		}

	}
}
