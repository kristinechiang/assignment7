import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*Based on problem 1, create a button and textarea on the same layout. 
Each time you click the button, it will read a string from ArrayList in order and show 
it in the textarea. When number of clicks beyond the ArrayList, pop up an alert menu.*/
public class readFileonP extends JFrame {
	JButton button;
	JTextArea textDisplay;
	int i = 0;

	void initiate() {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		button = new JButton("show a line");
		textDisplay = new JTextArea();
		f.add(p);
		p.add(button);
		p.add(textDisplay);
		f.setVisible(true);
		f.setSize(300, 300);
		buttonClick bc = new buttonClick();
		button.addActionListener(bc);
	}

	class buttonClick implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			readFile r = new readFile();
			try {
				ArrayList<String> list = new ArrayList<String>(r.readString());
				if (i > list.size() - 1) {
					JOptionPane.showMessageDialog(null, "beyond size of arraylist");
				} else {
					textDisplay.setText(list.get(i));
					i++;
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {
		readFileonP r = new readFileonP();
		r.initiate();

	}
}
