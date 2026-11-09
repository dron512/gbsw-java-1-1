package ex03;

import javax.swing.*;
import java.awt.*;

public class Windo extends JFrame {
  public Windo() {
    setLayout(new FlowLayout());
    TextField tf1 = new TextField(10);
    add(tf1);
    JButton button = new JButton("수학 공부");
    button.addActionListener((e)->{
      System.out.println(tf1.getText());
      System.out.println("수학 공부를 합니다.");
    });
    add(button);
    JButton button1 = new JButton("코딩 공부");
    button1.addActionListener((e)->{
      System.out.println("코딩 공부를 합니다.");
    });
    add(button1);
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
}
