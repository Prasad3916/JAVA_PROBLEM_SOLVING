package _ProblemSolving;
public class _4AreaAndPerimeterOfDifferentShapes {
	void areaOfDifferentShapes(int ...a) {
		System.out.println("Area Of Square : "+a[0]*a[0]);
		System.out.println("Perimeter Of Square : "+4*a[0]);
		System.out.println("Area Of Rectangle : "+a[0]*a[1]);
		System.out.println("Perimeter Of Rectangle : "+2*(a[0]+a[1]));
		System.out.println("Area Of Triangle : "+(int)(0.5*a[0]*a[1]));
		System.out.println("Perimeter Of Triangle : "+(a[0]+a[1]+a[2]));
	}
	public static void main(String[] args) {
		new _4AreaAndPerimeterOfDifferentShapes().areaOfDifferentShapes(20,40,20);
	}
}
