package decorators;
import objects.Shape;
import styles.LineStyle;

public class LineStyleDecorator extends ShapeDecorator {
	protected LineStyle style;

	public LineStyleDecorator(Shape decoratedShape, LineStyle style) {
		super(decoratedShape);
		this.style = style;
	}

	public void draw() {
		decoratedShape.draw();
		System.out.println("Drawing with line Style: " + style);
	}

}