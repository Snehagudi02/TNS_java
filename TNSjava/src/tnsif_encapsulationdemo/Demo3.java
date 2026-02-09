package tnsif_encapsulationdemo;

public class Demo3 {
	int num;// data members or variables 
	String name;
	int age;
	
	void show() {// member function or fun
	System.out.println(num+" "+name+ " "+" "+age);	
	}
public static void main(String[] args) {
	Demo3 e=new Demo3();
	e.num=29;
	e.name="Love";
	e.age=23;
	
	e.show();
}
}