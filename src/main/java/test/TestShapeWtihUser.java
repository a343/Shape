package test;

import java.util.Scanner;

import decorators.FillColorDecorator;
import decorators.LineColorDecorator;
import decorators.LineStyleDecorator;
import decorators.LineThinknessDecorator;
import objects.Circle;
import objects.Rectangle;
import objects.Shape;
import styles.Color;
import styles.LineStyle;

public class TestShapeWtihUser {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int option = 0;
		double thickness = 0d;

		Shape c = null;
		while (option < 1 || option > 2) {
			System.out.println("Please enter the kind of shape: ");
			System.out.println("1. Rectangle");
			System.out.println("2. Circle");

			try {
				option = input.nextInt();
			} catch (Exception e) {
				System.out.println("El valor no es correcto");
			}
		}

		if (option == 1) {
			c = new Rectangle();
		} else if (option == 2) {
			c = new Circle();

		} else {
			System.out.println("El valor no es correcto");

		}

		System.out.println("Please enter the value for the thickness line: ");
		thickness = input.nextDouble();
		LineThinknessDecorator lt = new LineThinknessDecorator(c, thickness);
		option=0;
		while (option < 1 || option > 3) {
			System.out.println("Please choose the style of the line: ");
			System.out.println("1. DOT");
			System.out.println("2. DASH");
			System.out.println("3. SOLID");
			try {
				option = input.nextInt();
			} catch (Exception e) {
				System.out.println("El valor no es correcto");
			}
		}
		LineStyleDecorator ls = null;

		if (option == 1) {
			ls = new LineStyleDecorator(lt, LineStyle.DOT);
		} else if (option == 2) {
			ls = new LineStyleDecorator(lt, LineStyle.DASH);

		} else if (option == 3) {
			ls = new LineStyleDecorator(lt, LineStyle.SOLID);

		}
		option=0;
		while (option < 1 || option > 4) {

			System.out.println("Please choose the color line: ");
			System.out.println("1. RED");
			System.out.println("2. GREEN");
			System.out.println("3. BLUE");
			System.out.println("4. YELLOW");

			try {
				option = input.nextInt();
			} catch (Exception e) {
				System.out.println("El valor no es correcto");
			}
		}
		LineColorDecorator lc = null;

		if (option == 1) {
			lc = new LineColorDecorator(ls, Color.RED);
		} else if (option == 2) {
			lc = new LineColorDecorator(ls, Color.GREEN);

		} else if (option == 3) {
			lc = new LineColorDecorator(ls, Color.BLUE);

		} else if (option == 4) {
			lc = new LineColorDecorator(ls, Color.BLUE);
		} else {
			System.out.println("Value not valid");
		}
		option=0;
		while (option < 1 || option > 4) {

			System.out.println("Please choose the color to fill: ");
			System.out.println("1. RED");
			System.out.println("2. GREEN");
			System.out.println("3. BLUE");
			System.out.println("4. YELLOW");
			try {
				option = input.nextInt();
			} catch (Exception e) {
				System.out.println("El valor no es correcto");
			}
		}
		
		FillColorDecorator fc = null;

		if (option == 1) {
			fc = new FillColorDecorator(lc, Color.RED);
		} else if (option == 2) {
			fc = new FillColorDecorator(lc, Color.GREEN);

		} else if (option == 3) {
			fc = new FillColorDecorator(lc, Color.BLUE);

		} else if (option == 4) {
			fc = new FillColorDecorator(lc, Color.BLUE);
		} else {
			System.out.println("Value not valid");
		}
		Shape circle = fc;
		circle.draw();
		System.out.println();
	}

}
