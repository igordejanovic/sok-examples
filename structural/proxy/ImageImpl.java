package proxy;

public class ImageImpl implements IImage {
	
	private int width;
	private int height;
	private String fileName;
	
	public ImageImpl(String fileName) {
		super();
		System.out.println("Kreiram ImageImpl i učitavam sliku " + fileName + " !");
		this.width = 50;
		this.height = 100;
		this.fileName = fileName;
	}

	@Override
	public int getWidth() {
		return this.width;
	}

	@Override
	public int getHeight() {
		return this.height;
	}

	@Override
	public void draw() {
		System.out.println("Prikazujem sliku!");
	}

	@Override
	public String getFileName() {
		return fileName;
	}

}
