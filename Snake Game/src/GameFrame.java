import javax.swing.*;
public class GameFrame extends JFrame{
	GameFrame()
	{
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);//frame cant be resized
		this.pack();//to add components snugly in frame
		this.setVisible(true);
		this.setLocationRelativeTo(null);//to appear at center
		
	}
}
