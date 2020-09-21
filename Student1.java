package week12;

public class Student1 {
	int rollno;
	String name;
	static String college = "IT";
	
	Student1(int r, String n){
		rollno=r;
		name= n;
	}
	void display() {
		System.out.println(rollno+" "+name+college);
	}
}
