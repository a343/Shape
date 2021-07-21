package decorators;
import objects.Shape;
import styles.Color;

public class LineColorDecorator extends ShapeDecorator {
	protected Color color;

	public LineColorDecorator(Shape decoratedShape, Color color) {
		super(decoratedShape);
		this.color = color;
	}

	public void draw() {
		decoratedShape.draw();
		System.out.println("Drawing with Line Color: " + color);
	}


}