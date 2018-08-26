import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OXGameFrom implements ActionListener{
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JPanel mainPanel;

    OX ox = new OX();

    public OXGameFrom() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ox.put(0,0)) {
                    button1.setText(ox.get(0,0));
                    ox.switchPlayer();
                }
                System.out.println(ox.getTableString());
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ox.put(1,0)) {
                    button2.setText(ox.get(1,0));
                    ox.switchPlayer();
                }
                System.out.println(ox.getTableString());
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ox.put(2,0)) {
                    button3.setText(ox.get(2,0));
                    ox.switchPlayer();
                }
                System.out.println(ox.getTableString());
            }
        });
    }

    public static void main(String[] args) {


        JFrame frame = new JFrame();
        frame.setContentPane(new OXGameFrom().mainPanel);
        frame.setSize(600,600);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
