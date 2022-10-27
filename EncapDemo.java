package javaexamples;

public class EncapDemo {
	private int a, b;

	public EncapDemo(int a) {
		super();
		this.a = a;
	}

	public int getB() {	
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapDemo en = new EncapDemo(19);
		en.setB(10);
		System.out.println(en.a);
		System.out.println(en.getB());

	}
}
