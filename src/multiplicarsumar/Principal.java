/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicarsumar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author a21cristinaaf
 */
public class Principal extends JFrame implements ActionListener {

    JLabel multiplicar;
    JComboBox<Integer> listaNum;
    JButton[] numeros = new JButton[10];
    JButton[] igual = new JButton[10];
    JButton[] resultado = new JButton[10];
    JLabel num1;
    JLabel num2;
    JLabel resultadoSuma;
    JTextField introducirNumero;
    JButton sumar;

    public Principal() {

        multiplicar = new JLabel("Tabla de multiplicar");
        multiplicar.setHorizontalAlignment(JLabel.CENTER);
        multiplicar.setFont(new Font("Arial", Font.BOLD, 22));
        listaNum = new JComboBox<Integer>();

        for (int i = 0; i < 10; i++) {
            listaNum.addItem(i);

        }

        JPanel panel1 = new JPanel();
        panel1.add(multiplicar);
        panel1.add(listaNum);

        panel1.setLayout(new GridLayout(2, 1));
        this.add(panel1, BorderLayout.NORTH);
        System.out.println(numeros.length);

        //bucle para crear los botones
        for (int i = 0; i < 10; i++) {
            numeros[i] = new JButton(String.valueOf(i));
            igual[i] = new JButton("=");
            resultado[i] = new JButton(" ");
        }

        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        //bucle para añadir los botones de los números
        for (int i = 0; i < 10; i++) {
            constraints.gridx = 0;
            constraints.gridy = i;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.weightx = 1.0;
            constraints.weighty = 1.0;
            constraints.fill = GridBagConstraints.BOTH;
            

            panelCentral.add(numeros[i], constraints);

            constraints.gridx = 1;
            constraints.gridy = i;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.weightx = 1.0;
            constraints.weighty = 1.0;

            panelCentral.add(igual[i], constraints);

            constraints.gridx = 2;
            constraints.gridy = i;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.weightx = 1.0;
            constraints.weighty = 1.0;

            panelCentral.add(resultado[i], constraints);

        }

        this.add(panelCentral);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Principal frame = new Principal();

        frame.setSize(400, 600);
        frame.setTitle("Applet Viewer: interfaz_tabla_multiplicar.class");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // TODO code application logic here
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
