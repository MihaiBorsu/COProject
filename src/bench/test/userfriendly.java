package bench.test;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ProgressMonitor;
import javax.swing.Timer;

import com.javapapers.java.SFM;
import com.javapapers.java.panica;

public class userfriendly {
  static ProgressMonitor monitor;

  static int progress;

  static Timer timer;

  public void AWT() {

    JFrame frame = new JFrame("COCK Spaceship");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = frame.getContentPane();
    contentPane.setLayout(new GridLayout(0, 1));

    // Define Start Button
    JButton startButton = new JButton("Test CPU.");
    ActionListener startActionListener = new ActionListener() 
    {
      public void actionPerformed(ActionEvent actionEvent) 
      {
          SFM send = new SFM();
          ((SFM) send).SendFromYahoo();

      }
    };
    startButton.addActionListener(startActionListener);
    contentPane.add(startButton);

    JButton increaseButton = new JButton("Panic!");
    ActionListener increaseActionListener = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) 
      {
            panica pnk = new panica();
          ((panica) pnk).SendFromYahoo();
            JOptionPane.showMessageDialog(null,"Hold on tight. Reinforcements "
                + "are on their way to you.");
      }
    };
    increaseButton.addActionListener(increaseActionListener);
    contentPane.add(increaseButton);


    JButton autoIncreaseButton = new JButton("Abort mission.");
    ActionListener autoIncreaseActionListener = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) 
      {
            JOptionPane.showMessageDialog(null,"See you later.");
            System.exit(0);
      }
    };
    autoIncreaseButton.addActionListener(autoIncreaseActionListener);
    contentPane.add(autoIncreaseButton);

    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}
