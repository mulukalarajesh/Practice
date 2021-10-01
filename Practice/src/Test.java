//question no4
class Circle extends Shape{
	int R;
	double pi = 3.14;

	Circle(int param){
		this.R=param;
	}
	@Override
	public double area() {
		return pi*R*R ;
	}
}

class Rectangle extends Shape{
 int l,b;
 
 public  Rectangle(int a,int c) {
this.l=a;
this.b=c;
 
 }
 
	@Override
	public double area() {
		
		return l*b;
	}
	
	
}
public class Test {
public static void main(String[] args) {
	
	
	Shape vec[] = {new Circle(3), new Rectangle(4,5), new Circle(4), new Circle(8)};
	for (int index=0; index<vec.length;index++ ) {
		System.out.println(vec[index]);
	}

}
}


