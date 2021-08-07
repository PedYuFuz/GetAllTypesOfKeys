package allKeysAndCommand;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class AllKeys extends JFrame{
	public AllKeys() {
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int cod = e.getKeyCode();
				int key = KeyEvent.VK_ENTER;
				
				if(cod==key) {
					System.out.println("It's working!");
					
				}
			}
		});
		
		setTitle("Add Image");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AllKeys();
	}
}
