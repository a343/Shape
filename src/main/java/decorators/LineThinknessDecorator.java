package decorators;
import objects.Shape;

public class LineThinknessDecorator extends ShapeDecorator {
	protected double thickness;

	public LineThinknessDecorator(Shape decoratedShape, double thickness) {
		super(decoratedShape);
		this.thickness = thickness;
	}

	public void draw() {
		decoratedShape.draw();
		System.out.println("Drawing with line thickness: " + thickness);
	}

}