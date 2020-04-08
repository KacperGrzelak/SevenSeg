/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segment;


import java.awt.*;
import javax.swing.*;

/**
 *
 * @author dell
 */
public class NewIdea extends JPanel {
    
    private static final long serialVersionUID = -4980210296562972446L;
    
    private Rectangle[] rect = {
			new Rectangle(20,10,105,10),
			new Rectangle(125,20,10,115),
			new Rectangle(125,145,10,115),
			new Rectangle(20,260,105,10),
			new Rectangle(10,145,10,115),
			new Rectangle(10,20,10,115),
			new Rectangle(20,135,105,10),
                        new Rectangle(0,260,10,10),
            
                        new Rectangle(160,10,105,10),
			new Rectangle(265,20,10,115),
			new Rectangle(265,145,10,115),
			new Rectangle(160,260,105,10),
			new Rectangle(150,145,10,115),
			new Rectangle(150,20,10,115),
			new Rectangle(160,135,105,10),
                        new Rectangle(140,260,10,10),
                        
                        new Rectangle(300,10,105,10),
			new Rectangle(405,20,10,115),
			new Rectangle(405,145,10,115),
			new Rectangle(300,260,105,10),
			new Rectangle(290,145,10,115),
			new Rectangle(290,20,10,115),
			new Rectangle(300,135,105,10),
                        new Rectangle(280,260,10,10)
		};
    
    private JPanel[] pnlSeg;
	
	public JPanel getPanelSeg(int index)
	{
		return this.pnlSeg[index];
	}
        
        public NewIdea() {
		super();
                //this.setSize(900, 900);
		initSegment(new Dimension(450,300), Color.DARK_GRAY);
		
	}
    public NewIdea(Dimension dim, Color col) {
		super();
		initSegment(dim, col);
	}
    
    private void initSegment(Dimension dim, Color col)
	{
		this.setName("HauptSegment");
		this.setBackground(Color.DARK_GRAY);
		this.setSize(dim);
		this.pnlSeg = new JPanel[24];
		
		for (int j = 0; j < 24; j++)
		{
			this.pnlSeg[j] = new JPanel();
			this.pnlSeg[j].setName("SegmentTeil #"+j);
			this.pnlSeg[j].setToolTipText(this.pnlSeg[j].getName());
			this.pnlSeg[j].setBounds(rect[j]);
			this.pnlSeg[j].setLayout(null);
                        this.pnlSeg[j].setBackground(Color.RED);
                        this.pnlSeg[j].setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                        add(this.pnlSeg[j]);
		}
		
	}
    
    public Rectangle getRect(int index)
	{
		return rect[index];
	}
    
}
