package firstProjectPackage;

public class firstProjectClass {
	int a;
	public void firstMethod() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		firstProjectClass obj = new firstProjectClass();
		obj.a=0;
		obj.firstMethod();
	}

}
