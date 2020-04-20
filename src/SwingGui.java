import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ForkJoinPool;

public class SwingGui {
    public static void main(String[] args) {
        SwingGui panel = new SwingGui();
        panel.go();

    }
    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel();             // eto sinij list ( fon v okne JFrame )
        JTextField field = new JTextField(20);
        JTextField field1 = new JTextField("Name");
        JTextArea text = new JTextArea(10,20);

        jPanel.setBackground(Color.BLUE);
        jPanel.setLayout((new BoxLayout(jPanel,BoxLayout.Y_AXIS)));
        JButton button = new JButton("Shock me");          // rabotaet pod upravleniem FLOW v rjad pojdut knopki
        JButton button1 = new JButton("Ok");
        JButton button2 = new JButton("Cancel");
        jPanel.add(button);
        jPanel.add(button1);
        jPanel.add(button2);
        jPanel.add(field);
        jPanel.add(field1);
        jPanel.add(text);
        frame.getContentPane().add(BorderLayout.EAST,jPanel);    // dobavili na6u panelj ( cvetnoj list vo frejm okno
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
