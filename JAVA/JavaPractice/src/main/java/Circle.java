// 기본 생성자

public class Circle {
	int radius;
	void set(int r) { radius = r; }
	double getArea() { return 3.14*radius*radius; }
	
	public Circle() {};
	
	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.set(3);
	}
}
