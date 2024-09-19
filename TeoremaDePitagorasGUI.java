package Pitagoras;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeoremaDePitagorasGUI extends JFrame {

    private JTextField x1Field, y1Field, x2Field, y2Field, resultField;

    public TeoremaDePitagorasGUI() {
    	getContentPane().setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
    	getContentPane().setBackground(SystemColor.controlHighlight);
        // Configuración básica de la ventana
        setTitle("Teorema de Pitágoras");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new GridLayout(6, 2, 10, 10));

        // Componentes de la interfaz
        JLabel x1Label = new JLabel("Coordenada X1:");
        x1Label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
        x1Field = new JTextField();
        x1Field.setBackground(SystemColor.activeCaption);
        JLabel y1Label = new JLabel("Coordenada Y1:");
        y1Label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
        y1Field = new JTextField();
        y1Field.setBackground(SystemColor.activeCaption);
        JLabel x2Label = new JLabel("Coordenada X2:");
        x2Label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
        x2Field = new JTextField();
        x2Field.setBackground(SystemColor.activeCaption);
        JLabel y2Label = new JLabel("Coordenada Y2:");
        y2Label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
        y2Field = new JTextField();
        y2Field.setBackground(SystemColor.activeCaption);
        JButton calcularButton = new JButton("Hipotenusa");
        calcularButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
        calcularButton.setBackground(SystemColor.activeCaption);
        resultField = new JTextField();
        resultField.setEditable(false);

        // Agregar componentes al frame
        getContentPane().add(x1Label);
        getContentPane().add(x1Field);
        getContentPane().add(y1Label);
        getContentPane().add(y1Field);
        getContentPane().add(x2Label);
        getContentPane().add(x2Field);
        getContentPane().add(y2Label);
        getContentPane().add(y2Field);
        getContentPane().add(calcularButton);
        getContentPane().add(resultField);

        // Acción al presionar el botón "Calcular Distancia"
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularDistancia();
            }
        });
    }

    private void calcularDistancia() {
        try {
            // Obtener los valores de las coordenadas ingresadas
            double x1 = Double.parseDouble(x1Field.getText());
            double y1 = Double.parseDouble(y1Field.getText());
            double x2 = Double.parseDouble(x2Field.getText());
            double y2 = Double.parseDouble(y2Field.getText());

            // Calcular la distancia utilizando el Teorema de Pitágoras
            double hipotenusa = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            // Mostrar el resultado
            resultField.setText(" " + String.format("%.2f", hipotenusa));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingresa valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Ejecutar la aplicación
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TeoremaDePitagorasGUI().setVisible(true);
            }
        });
    }
}
