package segment;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JPanel;


public class Segment extends JPanel {

    private Segment[] segment = new Segment[8];
	/**
	 * 
	 */
	private static final long serialVersionUID = -4980210296562972446L;
	
	private Rectangle[] rect = {
			new Rectangle(20,10,105,10),
			new Rectangle(125,20,10,115),
			new Rectangle(125,145,10,115),
			new Rectangle(20,260,105,10),
			new Rectangle(10,145,10,115),
			new Rectangle(10,20,10,115),
			new Rectangle(20,135,105,10),
                        new Rectangle(0,260,10,10)
		};
	
	private JPanel[] pnlSeg;
	
	public JPanel getPanelSeg(int index)
	{
		return this.pnlSeg[index];
	}
	
	public Segment() {
		super();
		initSegment(new Dimension(90,90), Color.DARK_GRAY);
		
	}

	public Segment(Dimension dim, Color col) {
		super();
		initSegment(dim, col);
	}

	private void initSegment(Dimension dim, Color col)
	{
		this.setName("HauptSegment");
		//this.setBackground(Color.BLACK);
		this.setSize(dim);
		this.pnlSeg = new JPanel[8];
		
		for (int j = 0; j < 8; j++)
		{
			this.pnlSeg[j] = new JPanel();
			this.pnlSeg[j].setName("SegmentTeil #"+j);
			this.pnlSeg[j].setToolTipText(this.pnlSeg[j].getName());
			this.pnlSeg[j].setBounds(rect[j]);
			this.pnlSeg[j].setLayout(null);
		}
                
		
	}

	public Rectangle getRect(int index)
	{
		return rect[index];
	}
}
