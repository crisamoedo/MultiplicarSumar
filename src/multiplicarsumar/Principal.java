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
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
public class Principal extends JFrame implements ActionListener, ItemListener {

    JLabel multiplicar;
    JComboBox<Integer> listaNum;
    Boton[] numeros = new Boton[10];
    Boton[] igual = new Boton[10];
    Boton[] resultado = new Boton[10];
    JLabel numero1;
    JLabel numero2;
    JLabel resultadoSuma;
    JTextField introducir1;
    JTextField introducir2;
    JTextField introducirResultado;
    Boton sumar;

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

        //bucle para crear los botones
        for (int i = 0; i < 10; i++) {
            numeros[i] = new Boton(String.valueOf(i));
            igual[i] = new Boton("=");
            resultado[i] = new Boton(" ");
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
            constraints.insets = new Insets(0, 10, 10, 5);
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

        numero1 = new JLabel("Numero1: ");
        numero2 = new JLabel("Numero2: ");
        resultadoSuma = new JLabel("Resultado");
        sumar = new Boton("SUMAR");
        introducir1 = new JTextField();
        introducir2 = new JTextField();
        introducirResultado = new JTextField();

        JPanel panelInferior = new JPanel();
        panelInferior.setLayout(new GridBagLayout());
        GridBagConstraints constraints2 = new GridBagConstraints();

        constraints2.gridx = 0;
        constraints2.gridy = 0;
        constraints2.gridwidth = 1;
        constraints2.gridheight = 1;
        constraints2.weightx = 1.0;
        constraints2.weighty = 1.0;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        constraints2.insets = new Insets(0, 10, 10, 0);
        panelInferior.add(numero1, constraints2);

        constraints2.gridx = 0;
        constraints2.gridy = 1;
        constraints2.gridwidth = 1;
        constraints2.gridheight = 1;
        constraints2.weightx = 1.0;
        constraints2.weighty = 1.0;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        constraints2.insets = new Insets(0, 10, 10, 0);
        panelInferior.add(numero2, constraints2);

        constraints2.gridx = 0;
        constraints2.gridy = 2;
        constraints2.gridwidth = 1;
        constraints2.gridheight = 1;
        constraints2.weightx = 1.0;
        constraints2.weighty = 1.0;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        constraints2.insets = new Insets(0, 10, 10, 0);
        panelInferior.add(resultadoSuma, constraints2);

        constraints2.gridx = 1;
        constraints2.gridy = 0;
        constraints2.gridwidth = 1;
        constraints2.gridheight = 1;
        constraints2.weightx = 4.0;
        constraints2.weighty = 1.0;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        panelInferior.add(introducir1, constraints2);

        constraints2.gridx = 1;
        constraints2.gridy = 1;
        constraints2.gridwidth = 1;
        constraints2.gridheight = 1;
        constraints2.weightx = 4.0;
        constraints2.weighty = 1.0;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        panelInferior.add(introducir2, constraints2);

        constraints2.gridx = 1;
        constraints2.gridy = 2;
        constraints2.gridwidth = 1;
        constraints2.gridheight = 1;
        constraints2.weightx = 4.0;
        constraints2.weighty = 1.0;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        panelInferior.add(introducirResultado, constraints2);

        constraints2.gridx = 2;
        constraints2.gridy = 0;
        constraints2.gridwidth = 4;
        constraints2.gridheight = 4;
        constraints2.insets = new Insets(0, 10, 10, 5);
        constraints2.fill = GridBagConstraints.BOTH;
        panelInferior.add(sumar, constraints2);

        this.add(panelInferior, BorderLayout.SOUTH);

        listaNum.addItemListener(this);
        sumar.addActionListener(this);

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
        try {
            int num1 = Integer.parseInt(introducir1.getText());

            int num2 = Integer.parseInt(introducir2.getText());

            Matematica numero = new Matematica(num1);
            int resultadoSuma = numero.sumar(num2);
            introducirResultado.setText(String.valueOf(resultadoSuma));

        } catch (NumberFormatException number) {

            number.getMessage();
            System.out.println("Hay que introducir 2 números para poder sumar");
            
        }

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        listaNum.addItemListener(this);
        int valor = listaNum.getSelectedIndex();
        Matematica numero = new Matematica(valor);

        for (int i = 0; i < resultado.length; i++) {
            resultado[i].setText(String.valueOf(numero.multiplicar(i)));

        }
    }

}
