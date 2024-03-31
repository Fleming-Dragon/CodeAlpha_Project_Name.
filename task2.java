import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task2 extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JButton countButton;
    private JLabel countLabel;

    public task2() {
        textArea = new JTextArea();
        textArea.setBounds(30, 40, 200, 200);
        textArea.setLineWrap(true); // Enable word wrap
        textArea.setWrapStyleWord(true); // Wrap by words rather than characters
        add(textArea);


        countButton = new JButton("Count Words");
        countButton.setBounds(100, 250, 120, 30);
        countButton.addActionListener(this);
        add(countButton);


        countLabel = new JLabel("Word Count: 0");
        countLabel.setBounds(100, 300, 120, 30);
        add(countLabel);


        setSize(300, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String text = textArea.getText();


        String words[] = text.split("\\s+");
        countLabel.setText("Word Count: " + words.length);
    }

    public static void main(String[] args) {
        new task2();
    }
}
