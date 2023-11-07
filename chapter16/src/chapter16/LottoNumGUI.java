package Chapter16;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Lotto extends JFrame implements ActionListener{
 private JLabel lotto_num = new JLabel();
 public Lotto() {
	 JButton lotto = new JButton("로또 번호 자동 생성");
	 Container ct = getContentPane();
	 ct.setLayout(new FlowLayout());
	 ct.add(lotto);
	 ct.add(lotto_num);
	 lotto.addActionListener(this);
	 setTitle("Lotto Number Generate");
	 setSize(300,250);
	 setVisible(true);
 }
  public void actionPerformed(ActionEvent ae) {
	  Random r = new Random();
	  int [] Inum = new int[6];
	  int tmp;
	  int i = 0;
	  a : while(i<6) {
		  tmp=r.nextInt(45)+1;
		  for(int j = 0; j<= i; j++) {
			  if(tmp == Inum[j])
				  continue a;
		  }
		 Inum[i]=tmp;
		 i++;
	  }
	  lotto_num.setText("이번 주 로또 당첨번호 : " +Arrays.toString(Inum));
  }
	 
}

public class LottoNumGUI {

	public static void main(String[] args) {
		new Lotto();

	}

}


