package chapter15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.FileInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class GUI2 extends JFrame implements ActionListener {
    private JTextArea contents;
    private JTextField f_name;

    public GUI2() {
        JButton jb = new JButton("파일 불러오기");
        f_name = new JTextField("파일의 이름을 입력하세요", 20);
        contents = new JTextArea(10, 20);
        contents.setEditable(false);

        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());

        JPanel p1 = new JPanel();
        p1.add(f_name);
        p1.add(jb);

        ct.add(contents);
        ct.add(p1);

        jb.addActionListener(this);

        setTitle("GUI TEST2");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            String s = f_name.getText();
            FileInputStream fis = new FileInputStream(s);
            DataInputStream dis = new DataInputStream(fis);
            contents.setText(dis.readUTF());
            fis.close();
            dis.close();
            System.out.println("파일이 읽어 왔습니다.");
        } catch (Exception e) {
            System.out.println("파일이 존재하지 않습니다");
        }
    }
}

public class GUITest2 {
    public static void main(String[] args) {
        new GUI2();
    }
}

