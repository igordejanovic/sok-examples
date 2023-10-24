package composite;

import java.util.ArrayList;
import java.util.List;

import composite.shapes.Circle;
import composite.shapes.CompositeShape;
import composite.shapes.IShape;
import composite.shapes.Line;
import composite.shapes.Rectangle;


public class CompositeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<IShape> shapes = new ArrayList<IShape>();

		shapes.add(new Circle());

		// Kreiranje kompozita korišćenjem Fluent Interface obrasca
		shapes.add(new CompositeShape()
						.add(new Line())
						.add(new Circle())
						.add(new Rectangle()));

		shapes.add(new Line());
		shapes.add(new Rectangle());

		Canvas canvas = new Canvas(shapes);
		canvas.repaint();

	}

}
