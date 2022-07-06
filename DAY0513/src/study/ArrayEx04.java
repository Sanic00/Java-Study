package study;

public class ArrayEx04 {

	public static void main(String[] args) {

						//new int [5][];
	int[][]score = {
			{99,92},
			{78, 48, 78, 98},
			{95, 92, 30},
			{37,98,23,21,19},	
			{29,64,83}
			};
			
			
	//행 : 5, 열 3 // 열의 변화, 행은 고정 => 가변배열(열을 변해서 활용)
	//행;왼쪽  = 열;오른쪽;변하는값 (가변배열에서는 행은 무조건 고정, 열이 변화가 있음)
	/*score[0] = new int[2]; //99,92
	score[1] = new int[3]; //78, 48, 78, 98
	score[2] = new int[4]; //95, 92, 30
	score[3] = new int[5]; //37,98,23,21,19
	score[4] = new int[3]; //29,64,83
	 */
	
	int sum = 0 ;
	for(int i =0 ; i<score.length;i++) {
		sum = 0 ; //라인이 바뀔때마다 sum을 초기화해야 값의 오류가 없다.
		for(int j = 0 ; j<score[i].length;j++) {
			sum += score[i][j];
			System.out.print(score[i][j]+" ");	
		}
		//System.out.println();
		System.out.printf("합계:%d, 평균:%2f\n",sum,(double)sum/score[i].length);

	}
	

	}
}
