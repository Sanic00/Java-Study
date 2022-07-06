package study;

/*
 * 배열 복사
 * 
 * -배열은 한번 생선된 후 배열의 크기를 변경할 수 없음
 * -크기를 더 늘리고 싶은 경우 같은 자료형 배열을 원하는 크기로 준비하고
 * 	기존의 배열을 복사하면 작업을 완료 할 수 있음.
 *
 *	System.arraycopy() 메소드 이용 
 *	
 *	public static void arraycopy(Object src, int srcPos, Object dest, int destPos, Int length){
 *	.....
 *	}
 *Pos : Postion(위치)
 *배열 복사 범위  : 배열 시작 점 포함한 length
 *위치는 인덱스 위치 
 *
 *
 *	src	:소스 배열
 *	srcPos : 소스배열의 복사 시작 위치
 *	dest : 복사 배열
 *	destPos : 복사 시작 위치
 *	length : 복사되는 배열의 요소의 수 
 *
 *
 */

public class ArrayCopyEx01 {

	public static void main(String[] args) {

		String [] src= {"Java","DataBase", "JSP", "Spring"};
		String [] dest = new String [6] ;
		dest[0] ="OS";
		dest[1] = "Network";
		
		System.arraycopy(src, 0, dest, 2,4);
		//System.arraycopy(src, 0, dest, 2,src.length);
		
		for(String str : dest) {
			System.out.println("dest value :"+str);
		}
		
		/*
		 * for(int i=0 ; i<dest.length;i++) { System.out.println(dest[i]); }
		 */		
		
		
	}

}
