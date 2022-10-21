// 기본 생성자

public class Circle {
	int radius;
	void set(int r) { radius = r; }
	double getArea() { return 3.14*radius*radius; }
	
	public Circle(int r) {};
	
	public static void main(String[] args) {
		Circle pizza = new Circle(3);
		System.out.println(pizza.getArea());
		
		Circle donut = new Circle(5);
		System.out.println(donut.getArea());
	}
}
