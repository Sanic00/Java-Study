package com.excep2;

public class ExceptionTest {

	public static void main(String[] args) {
	
		try {
			install();
		} catch (InstallException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//		try {
//		startInstall(); //���α׷� ��ġ �غ�
//		copyFiles(); //���� ����
//		}catch (SpaceException e) {
//			System.out.println("������ �����Ͽ��� ����� Ȯ�� �ٶ��ϴ�.");
//			System.out.println("Ȯ���� �Ǽ����� �ٽ� ��ġ �ٶ��ϴ�.");
//		}catch (MemoryException me) {
//			System.out.println("�޸𸮰� �����Ͽ��� ����� Ȯ�� �ٶ��ϴ�.");
//		}finally {
//			deleteTempFiles();
//		}
	

	
	static void install() throws InstallException{
		try {
			startInstall(); // ���α׷� ��ġ�� �غ���
			copyFiles(); //���� ����
		} catch (SpaceException se) {
			InstallException ie = new InstallException("��ġ �� ���� �߻�....");
			ie.initCause(se); // ������ ���ܸ� �������� ����ϴ� ���
			throw ie;//���ο��ܸ� ��ȯ��.
		} catch(MemoryException me) {
			InstallException ie = new InstallException("��ġ �� ���� �߻�....");
			ie.initCause(me); // ������ ���ܸ� �������� ����ϴ� ���
			throw ie; //���ο��ܸ� ��ȯ��.
		} finally {
			deleteTempFiles(); // ���α׷� ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
		}
	}
	
	
	
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) { //���α׷� ��ġ�� ������ ������ ��� 
			throw new SpaceException("��ġ�� ������ �ſ� �����մϴ�...");
		}
		if(!enoughMemory()) { //���α׷� ��ġ�� �޸𸮰� ������ ���
			throw new MemoryException("�޸𸮰� �͹��� ���� �����մϴ�....");
		}
	}
		
	static boolean enoughSpace() {
		return false ;
	}
	
	static boolean enoughMemory(){
		return true ;
	}
	
	static void copyFiles() { //���� ����

}

	static void deleteTempFiles() { //�ӽ����� ����
		
	}
	
	
	
	}