package chapter05;

public class Exercise08 {

	public static void main(String[] args) {

		int[][] array = {
			{95,86},
			{83,92,96},
			{78,83,93,87,88}
		};
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		
		
		for(int i = 0; i < array.length; i++) {
			for(int k = 0; k < array[i].length; k++) {
				sum += array[i][k];
			}
			
			 cnt +=  array[i].length;
		}
		
		avg = sum/cnt;
		
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
		
		
	}

}
