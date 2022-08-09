package practice;

public abstract class shape {
	
	abstract void draw();
	
} 

class triangle extends shape{
	void draw() {
		System.out.println("draw triangle");
	}
	
	class rectangle extends shape{
		void draw() {
			System.out.println("draw rectangle");
		}
	}
	
}
	

