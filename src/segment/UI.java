/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segment;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class UI extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4621924450652779205L;
	private Segment[] segment = new Segment[8];
	
	public UI()
	{
		//this.setName("UI_Frame");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setIconImage(new ImageIcon(Constants.ICO_URL).getImage());
		//setTitle(Constants.APP_TITLE);
		setSize(880, 300);
		setLocation(800, 600);
		//setResizable(false);
		//getContentPane().setBackground(Color.DARK_GRAY);
                //setBackground(Color.blue);
		FlowLayout layout = new FlowLayout();
		layout.setHgap(8);
		layout.setVgap(0);
		layout.setAlignment(FlowLayout.LEFT);
		setLayout(layout);
		//setAlwaysOnTop(true);
		Dimension dim = new Dimension();
		
		for (int i = 0; i < 3; i++)
		{
			dim.setSize(getSize().width/6, 300);
			segment[i] = new Segment(dim, Color.LIGHT_GRAY);
			segment[i].setName("Segment #"+i);
			segment[i].setPreferredSize(dim);
			segment[i].setLayout(null);
			
			for (int j = 0; j < 8; j++)
			{
				segment[i].getPanelSeg(j).setBackground((i < 1) ? Color.RED : (i < 2) ? Color.RED : (i < 3) ? Color.RED : Color.WHITE);
				segment[i].getPanelSeg(j).setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
				segment[i].add(segment[i].getPanelSeg(j));
			}
			add(segment[i]);
		}

	}
        
        
        public void setValue (){
            
            
            
        }
}