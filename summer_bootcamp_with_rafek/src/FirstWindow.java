import javax.swing.*;
import java.awt.*;

public class FirstWindow extends JFrame{
    private JPanel panel1;
    private JLabel upperLabel;
    private JPanel centerPanel;
    private JButton logInButton;
    private JButton signUpButton;
    private JButton recoverPassword;
    private JLabel bottomLabel;
    public FirstWindow() {
        setTitle("STRATA.BP");
        setContentPane(panel1);
        setSize(new Dimension(1000, 1000));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();

        setVisible(true);

        logInButton.addActionListener(new LogInButtonListener(this));
        signUpButton.addActionListener(new SignUpListener());
        recoverPassword.addActionListener(new RecoverPasswordButtonListener());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FirstWindow::new);

    }

    /**
     * Change panel to other
     * @param panel - e.x SecondWindow mainPanel or other Window panel
     */
    public void changeWindow(JPanel panel){
        setContentPane(panel);
        revalidate();
        repaint();
        pack();
    }

    /**
     * Return mainPanel
     * @return - mainPanel
     */
    public JPanel getMainPanel(){
        return panel1;
    }
}
