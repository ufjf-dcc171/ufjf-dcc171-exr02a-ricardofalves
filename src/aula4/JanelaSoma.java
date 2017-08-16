package aula4;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JanelaSoma extends JFrame {

    private final JLabel lblA;
    private final JLabel lblB;
    private final JLabel lblC;
    private final JTextField txtNumero1;
    private final JTextField txtNumero2;

    private int n1;
    private int n2;

    public JanelaSoma() throws HeadlessException {
        super("Soma");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        lblA = new JLabel("Numero 1: ");
        txtNumero1 = new JTextField(15);
        add(lblA);
        add(txtNumero1);
        lblB = new JLabel("Numero 2: ");
        txtNumero2 = new JTextField(15);
        add(lblB);
        add(txtNumero2);
        lblC = new JLabel("");
        add(lblC);

        txtNumero1.addActionListener(new Numero1Enter());
        txtNumero2.addActionListener(new Numero2Enter());
    }

    private class Numero1Enter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            n1 = Integer.parseInt(txtNumero1.getText());
            txtNumero2.requestFocus();

        }
    }
    
    private class Numero2Enter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            n2 = Integer.parseInt(txtNumero2.getText());
            lblC.setText(Integer.toString(n1 + n2));

        }
    }

}
