package proxy;

public class LazyImage implements IImage {

	private int width;
	private int height;
	private String fileName;
	private IImage realImage;

	public LazyImage(int width, int height, String fileName) {
		super();
		this.fileName = fileName;
		this.width = width;
		this.height = height;
	}

	@Override
	public int getWidth() {
		return realImage!=null ?
				realImage.getWidth():this.width;
	}

	@Override
	public int getHeight() {
		return realImage!=null ?
				realImage.getHeight():this.height;
	}

	@Override
	public void draw() {
		if(realImage==null){
			realImage = new ImageImpl(fileName);
		}
		realImage.draw();
	}

	@Override
	public String getFileName() {
		return this.fileName;
	}

}
