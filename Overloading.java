package week12;

public class Overloading {
	int a;
	double b;
	
	public Overloading(){
		super();
		System.out.println("called");
		
	}
	
	public Overloading(int a) {
		a = 0;
		b = 0.0;
	}
	
	public Overloading(int c,double d) {
		a = c;
		b = d;
	}
	
	void display() {
		System.out.println( a +" "+ b);
	}
	
	public static void main(String[]arg) {
		Overloading opj1 = new Overloading(11,12.5);
		Overloading opj2 = new Overloading();
		System.out.format("a : %d,b : %f\n\n", opj1.a,opj1.b);
		opj1.display();
		opj1.display();
		
	}
}
