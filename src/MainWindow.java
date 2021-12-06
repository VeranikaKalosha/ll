import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MainWindow extends JFrame{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainWindow frame = new MainWindow();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }

    public MainWindow() throws HeadlessException {
        this("lab4");
    }

    private Random random = new Random();

    public MainWindow(String title) throws HeadlessException {
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(650, 470);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBounds(10, 11, 610, 350);
        setContentPane(panel);
        panel.setLayout(null);


        JButton btn = new JButton("Przycisk");
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if(e.getX()<80) {
                    btn.setLocation(random.nextInt(300), random.nextInt(300));
                }
            }

        });
        btn.setBounds(280, 390, 90, 23);
        panel.add(btn);

    }
}
