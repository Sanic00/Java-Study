package ch04;
import java.util.*;
public class Ex4_11 {

	public static void main(String[] args) {
	System.out.print("당신의 주민번호를 입력하세요. (011231-1111222)");
	
	Scanner sc = new Scanner(System.in);
	String negNo = sc.next();
	char gender = negNo.charAt(7);
	
	switch(gender)
	{
	case '1' : case '3':
		switch(gender)
		{
		case'1':
			System.out.println("당신은 2000년 이전에 출생한 남자입니다!");
			break;
		case'3':
			System.out.println("당신은 2000년 이후에 출생한 남자입니다!");
		}
	case '2': case'4':
		switch(gender)
		{
		case '2': 
			System.out.println("당신은 2000년 이전에 출생한 여자입니다!");
			break;
		case '4':
			System.out.println("당신은 2000년 이후에 출생한 여자입니다!");
			break;
		}
		break;
		default:
			System.out.println("외국인이누");
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
