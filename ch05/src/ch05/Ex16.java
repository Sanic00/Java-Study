package ch05;

public class Ex16 {
// run에 있는 런 컨피큐레이션으로 실행해야됨
	public static void main(String[] args) {
		System.out.println("매개변수의 개수:" + args.length);

		for (int i = 0; i < args.length; i++) {
			System.out.println("arg[" + i + "] = \"" + args[i] + "\"");
		}

	}

}
