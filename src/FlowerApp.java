public class FlowerApp extends javax.swing.JFrame
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public FlowerApp(String title)
    {
        super(title);
        this.setSize(600, 450);
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        FlowerPanel panel = new FlowerPanel();
        this.add(panel);
        this.setVisible(true);
    }
    
    

    public static void main(String[] args)
    {
        FlowerApp app = new FlowerApp("test");
    }
}
