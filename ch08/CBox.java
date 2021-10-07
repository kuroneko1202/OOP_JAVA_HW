
public class CBox {
	int length;
	int width;
	int height;
	void volume()			//(b)
	{
		System.out.println("volume="+length*width*height);
	}
	void surfaceArea()		//(c)
	   {
	    System.out.println("surfaceArea="+(length+width+height));
	   }
	void showData()		//(d)
	   {
	    System.out.println("length="+length);
	    System.out.println("width="+width);
	    System.out.println("height="+height);
	   }
	void showAll()		//(e)
	   {
	    showData();
	    surfaceArea();
	    volume();
	   }
}

