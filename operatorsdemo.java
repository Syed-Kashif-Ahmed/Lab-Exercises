package javaexamples;

public class operatorsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add,sub,mul,div,mod; //creating a integer variables
		int num1=6,num2=5,a=10;  	 // Assign values to int variables 
		add=num1+num2;
		div=num1/num2;
		sub=num1-num2;
		mul=num1*num2;
		mod=num1%num2;
		
		System.out.println(add+"\n"+sub+"\n"+mul+"\n"+div+"\n"+mod+"\n");
		System.out.println(10*6%7);
		System.out.println(10%6*7);
		a=a++ + a++ ;//+ (a++);
		System.out.println(a);
	}	

}
