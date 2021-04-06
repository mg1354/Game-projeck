package game;


import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Gui {
	
	static JFrame window;
	static JPanel panel;
	static JTextArea showRoom;
	static JTextArea showplayer;
	static JTextArea showperson;
	static JTextField input;
	static String command;
	static JButton button;
	static JButton save;
	
	

	public Gui() {
		window = new JFrame("Game");
		panel = new JPanel(new GridLayout(4, 4));
		showRoom = new JTextArea("Room");
		showplayer = new JTextArea("Player");
		showperson = new JTextArea("Person");
		input = new JTextField("command");
		button = new JButton("Change");
		save = new JButton("save");
		showRoom.setBackground(Color.yellow);
		showplayer.setBackground(Color.green);
		showperson.setBackground(Color.green);
		input.setBackground(Color.yellow);
		button.setBackground(Color.orange);
		save.setBackground(Color.cyan);

		window.add(panel);
		panel.add(showRoom);
		panel.add(showplayer);
		panel.add(showperson);
		panel.add(input);
		panel.add(button);
		panel.add(save);

		window.setSize(800, 600);
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setResizable(false);
	
	}

	public JTextArea getShowPerson() {
		return Gui.showperson;
	}

}
