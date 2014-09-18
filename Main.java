

import javax.swing.JFrame;

public class Main {
	
	public Main(){
		
	}

	public static void main(String args[]){

		JFrame jframe=new JFrame();
		jframe.setSize(800, 600);

		
		WallJump bBall= new WallJump();
		
		jframe.add(bBall);
		jframe.setVisible(true);
	}
	
}