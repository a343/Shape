package decorators;

import objects.Shape;
import styles.Color;

public class FillColorDecorator extends ShapeDecorator {
	protected Color color;

	public FillColorDecorator(Shape decoratedShape, Color color) {
		super(decoratedShape);
		this.color = color;
	}

	public void draw() {
		decoratedShape.draw();
		System.out.println("Filling with Color: " + color);

	}

}
