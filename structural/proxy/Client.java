package proxy;

import java.util.List;

public class Client {
	List<IImage> images;

	public Client(List<IImage> images) {
		super();
		this.images = images;
	}

	public void doJob(){
		for(IImage image: images){
			System.out.println("Dimenzije slike " + image.getFileName());
			System.out.println(image.getWidth() + "x" + image.getHeight());
			System.out.println("Iscrtavam sliku "+ image.getFileName());
			image.draw();
			System.out.println("Dimenzije slike " + image.getFileName());
			System.out.println(image.getWidth() + "x" + image.getHeight());
		}
	}

}
