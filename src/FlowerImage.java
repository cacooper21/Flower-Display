
	import java.awt.Graphics2D;

	import javax.swing.ImageIcon;



	public class FlowerImage
	{
	    java.awt.Point _location;
	    java.awt.Image _fImage;
	    private int XLoc;
	    private int YLoc;

	    public FlowerImage(java.awt.Image image, java.awt.Point loc)
	    {
	       _fImage = new ImageIcon("daffodil1.gif").getImage();
	       XLoc = loc.x;
	       YLoc = loc.y;
	    }

	    public java.awt.Point getLoc()
	    {
	        return _location;
	    }

	    public int getX()
	    {
	        
	        return 0;
	    }

	    public int getY()
	    {
	        
	        return 0;
	    }

	    public java.awt.Image getImage()
	    {
	        return _fImage;
	    }
	    
	    public void paint(Graphics2D g) {
	    	g.drawImage(_fImage, XLoc, YLoc, null);
	    }
	
}
