package chapter15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JComBox1 extends JFrame implements ItemListener{
	JLabel jl;
	public JComBox1() {
		jl= new JLabel();
		JComboBox jcb = new JComboBox();
		String fr[] = {"persimmom","banana","pear","apple","cherry","grape"};
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		for(int i=0; i<6; i++) {
			jcb.addItem(fr[i]);
		}
		ct.add(jcb);
		ct.add(jl);
		jcb.addItemListener(this);
		setTitle("JComboBox Test1");
		setSize(200,200);
		setVisible(true);
	}
	@Override
	public void itemStateChanged(ItemEvent ie) {
		String fruit = (String)ie.getItem();
		jl.setIcon(new ImageIcon("image/"+fruit+".jpg"));
		
	}	
}
public class JComboxTest {

	public static void main(String[] args) {
		new JComBox1();

	}

}


