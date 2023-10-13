import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class presentationPLO extends JFrame {
    private JTextField textField;
    private JButton button;
  // private JFrame frame;

    public presentationPLO() {
        // frame.setPreferredSize(new Dimension(150, 200));
        setLayout(new FlowLayout());

        textField = new JTextField(20);
        add(textField);

        button = new JButton("Display");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                JOptionPane.showMessageDialog(null, text);
            }
        });
        add(button);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }


}