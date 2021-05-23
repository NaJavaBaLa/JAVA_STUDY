package ex13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePringExample {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 DD일"
				+ "E요일 k시 m분");
		System.out.println(sdf.format(now));
	}

}