package chapter15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class GUI1 extends JFrame implements ActionListener {
    private JTextArea contents;
    private JTextField f_name;

    public GUI1() {
        contents = new JTextArea("파일의 내용을 입력하세요.", 10, 20);
        f_name = new JTextField("파일의 이름을 입력하세요", 20);

        JButton jb = new JButton("파일로 생성");
        jb.addActionListener(this);

        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());

        JPanel p1 = new JPanel();
        p1.add(f_name);
        p1.add(jb);

        ct.add(contents);
        ct.add(p1);

        setTitle("GUI TEST1");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            String s = f_name.getText();
            FileOutputStream fos = new FileOutputStream(s);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeUTF(contents.getText());

            fos.close();
            dos.close();
            System.out.println(s + " 파일이 생성 되었습니다");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class GUITest1 {
    public static void main(String[] args) {
        new GUI1();
    }
}
