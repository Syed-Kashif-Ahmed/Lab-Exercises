package javaexamples;

public class CubeDemo {
	static int a=40;
static int cube(int x)
{
	return x*x*x;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		int res = cube(5); // we are not mentioning the class_name here because cube is a static method
		System.out.println(res);
		// Or we can call the cube method as
		res=CubeDemo.cube(6); // we are mentioning the class_name here because, we can use this method also
		System.out.println(res);
	}

}
