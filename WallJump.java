import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class WallJump extends JPanel{

	private static final long serialVersionUID = 1L;
	private Graphics dbg;
	int posX =0; int posY=0;
	int dirX = 1;
	int dirY = 1;

 	public void paint(Graphics g) {
  		update(g);	
 	}
	
 	public void update (Graphics g){

   		 g.setColor(Color.black);
		 g.fillRect(0, 0, getSize().width, getSize().height);	
		 g.setColor(Color.RED);
		 g.fillOval(posX,300,100,100);
	
		 posX+=dirX;
		

		// make it bounce
		 if(posX>getSize().width){
		 	dirX = -1;
		 }
		 if(posX<0){
		 	dirX = 1;
		 }
		 

		 repaint();
	 }

}