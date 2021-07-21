package decorators;
import objects.Shape;

public abstract class ShapeDecorator implements Shape {
      protected Shape decoratedShape;
      public ShapeDecorator(Shape decoratedShape) {
            super();
            this.decoratedShape = decoratedShape;
      }
}
