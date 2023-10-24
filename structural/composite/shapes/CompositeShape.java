package composite.shapes;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape implements IShape {

	private List<IShape> shapes = new ArrayList<IShape>();

	@Override
	public void draw() {
		System.out.println("Drawing Composite - Start!");
		for(IShape shape: shapes){
			shape.draw();
		}
		System.out.println("Drawing Composite - End!");
	}

	public CompositeShape add(IShape shape){
		shapes.add(shape);
		return this;
	}

	public void remove(int index){
		shapes.remove(index);
	}

	public int getChildrenCount(){
		return shapes.size();
	}

	public IShape getChild(int index){
		return shapes.get(index);
	}

}
