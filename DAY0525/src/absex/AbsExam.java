package absex;

public class AbsExam extends AbsEx02{

	public static void main(String[] args) {
		AbsExam ae = new AbsExam() ;
		System.out.println("ae.getA():"+ae.getA());
		System.out.println("ae.getStr():"+ae.getStr());
	}

	@Override
	public String getStr() {//AbsEx02�� �߻� �޼ҵ带 ������
		return str; //AbsEx01�� ��� ����
	}

}
