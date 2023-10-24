package composite;

import java.util.ArrayList;
import java.util.List;

import composite.shapes.IShape;


public class Canvas {

	private List<IShape> shapes = new ArrayList<IShape>();

	public Canvas(List<IShape> shapes) {
		super();
		this.shapes = shapes;
	}

	public void repaint(){
		for(IShape shape:shapes){
			shape.draw();
		}
	}
}
