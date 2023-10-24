package proxy;

import java.util.ArrayList;

public class ProxyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("serial")
		Client c = new Client(new ArrayList<IImage>(){{
					add(new LazyImage(50, 50, "slika1.jpg"));
					add(new LazyImage(50, 50, "slika2.jpg"));
					}}
				);
		c.doJob();


	}

}
