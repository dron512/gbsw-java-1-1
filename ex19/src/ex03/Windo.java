package ex03;

import javax.swing.*;

public class Windo extends JFrame {
  public Windo() {
    JButton button = new JButton("수학 공부");
    button.addActionListener((e)->{
      System.out.println("수학 공부를 합니다.");
    });
    add(button);
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
}
