import java.awt.GridLayout;
import java.awt.event.*;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.*;
/*Implement a calculator and it's add, minus, multiply and divide operations.
You can follow the pattern in the graph:*/

public class calculator extends JFrame implements ActionListener {

	int firstNumber, secendNumber;
	HashMap<JButton, Integer> h = new HashMap<JButton, Integer>();
	int count = 1;
	int result = 0;
	JButton buttona, buttonm, buttont, buttond, buttone;
	JTextArea a;

	public calculator() {
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setSize(300, 300);
		JPanel cp = new JPanel();
		JPanel cp1 = new JPanel();
		cp.setLayout(new GridLayout(4, 4));
		f.add(cp);
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button0 = new JButton("0");
		buttona = new JButton("+");
		buttonm = new JButton("-");
		buttont = new JButton("*");
		buttond = new JButton("/");
		buttone = new JButton("=");
		a = new JTextArea();
		a.setEditable(false);
		h.put(button1, 1);
		h.put(button2, 2);
		h.put(button3, 3);
		h.put(button4, 4);
		h.put(button5, 5);
		h.put(button6, 6);
		h.put(button7, 7);
		h.put(button8, 8);
		h.put(button9, 9);
		h.put(button0, 0);
		cp.add(button1);
		cp.add(button2);
		cp.add(button3);
		cp.add(button4);
		cp.add(button5);
		cp.add(button6);
		cp.add(button7);
		cp.add(button8);
		cp.add(buttona);
		cp.add(buttont);
		cp.add(button9);
		cp.add(button0);
		cp.add(buttonm);
		cp.add(buttond);
		cp.add(buttone);
		cp.add(a);
		button1.addActionListener(this);		
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		buttona.addActionListener(this);
		buttont.addActionListener(this);
		button9.addActionListener(this);
		button0.addActionListener(this);
		buttonm.addActionListener(this);
		buttond.addActionListener(this);
		buttone.addActionListener(this);

	}

	public static void main(String[] args) {
		new calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton jb = (JButton) e.getSource();

		if (h.containsKey(jb)) {// System.out.print("here");
			if (count == 1) {
				firstNumber = h.get(jb);
				count += 1;
			} else {
				secendNumber = h.get(jb);
				count = 1;
			}
		}
		if (jb == buttona) {

			result = firstNumber + secendNumber;
		} else if (jb == buttonm) {
			result = firstNumber - secendNumber;
		} else if (jb == buttont) {
			result = firstNumber * secendNumber;
		} else if (jb == buttond) {
			result = firstNumber / secendNumber;
		} else if (jb == buttone) {
			a.setText(result + "");
		}

	}
}
