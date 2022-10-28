package javaexamples;

public class StaticBlockDemo {
	static int a,b;
	static {
		a=10;
		b=20;
		int c=a+b;
		System.out.println("Sum of a + b = "+c);
	}
	static {
		System.out.println("Value of a : "+a+"\nValue of b : "+b);
		
		System.out.println("The 1st Static Block is invoked");
	}
	static {
		System.out.println("The 2nd Static Block is invoked");
	}
	static {
		System.out.println("The 3rd Static Block is invoked");
	}
	static {
		System.out.println("The 4th Static Block is invoked");
	}
	static {
		System.out.println("The 5th Static Block is invoked");
	}
	static {
		System.out.println("The 6th Static Block is invoked");
	}
	static {
		System.out.println("The 7th Static Block is invoked");
	}
	static {
		System.out.println("The 8th Static Block is invoked");
	}
	static {
		System.out.println("The 9th Static Block is invoked");
	}
	static {
		System.out.println("The 10th Static Block is invoked");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Checking whether the main function code will execute first or first invoke all static blocks");
		int ch=1;
		if(ch==1){
			switch(ch)
			{
				case 1: System.out.print(ch);
				break;
			}
		}
		else
			System.out.println("outside if");
	}
}
