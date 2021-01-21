import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class GUIexempel {
    public static void main(String[] args) {
        JFrame window = new JFrame("Window");
        window.setSize(800,600);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //<----VIKTIG!
        GridLayout gridLayout = new GridLayout(2,2,10,10);
        JPanel panel1 = new JPanel(gridLayout);

        JTextField textField1 = new JTextField("text");
        JTextField textField2 = new JTextField("text2");

        textField1.setColumns(20);
        textField2.setColumns(20);
        JButton button1 = new JButton("Klicka inte här!");

        panel1.add(textField2);
        panel1.add(button1);
        panel1.add(textField1);

        ActionListener buttonListener = e-> {
            String a = textField1.getText();
            textField1.setText(textField2.getText());
            textField2.setText(a);

        };
        ActionListener tf1Listener = e->{
           System.out.println(textField1.getText());
        } ;

        button1.addActionListener(buttonListener);
        textField1.addActionListener(tf1Listener);
        textField2.addActionListener(buttonListener);

        window.add(panel1);
        window.setVisible(true);


    }
}
