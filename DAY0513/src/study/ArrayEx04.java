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
			
			
	//�� : 5, �� 3 // ���� ��ȭ, ���� ���� => �����迭(���� ���ؼ� Ȱ��)
	//��;����  = ��;������;���ϴ°� (�����迭������ ���� ������ ����, ���� ��ȭ�� ����)
	/*score[0] = new int[2]; //99,92
	score[1] = new int[3]; //78, 48, 78, 98
	score[2] = new int[4]; //95, 92, 30
	score[3] = new int[5]; //37,98,23,21,19
	score[4] = new int[3]; //29,64,83
	 */
	
	int sum = 0 ;
	for(int i =0 ; i<score.length;i++) {
		sum = 0 ; //������ �ٲ𶧸��� sum�� �ʱ�ȭ�ؾ� ���� ������ ����.
		for(int j = 0 ; j<score[i].length;j++) {
			sum += score[i][j];
			System.out.print(score[i][j]+" ");	
		}
		//System.out.println();
		System.out.printf("�հ�:%d, ���:%2f\n",sum,(double)sum/score[i].length);

	}
	

	}
}
