import javax.swing.*;
import java.awt.event.*;


public class App {
    public static void main(String[] args) throws Exception {
        
    JFrame ventana = new JFrame("Calculadora ");
    ventana.setSize(500, 600);
    ventana.setLayout(null);
    
    JLabel numero1 = new JLabel("Ingresa el primer valor: ");
    numero1.setBounds(30,20,100,30);
    JTextField num1 = new JTextField();
    num1.setBounds(150,20,100,30);


    JLabel numero2 = new JLabel("Ingresa el segundo valor:");
    numero2.setBounds(30, 60, 100, 30);
    JTextField num2 = new JTextField();
    num2.setBounds(150,60,100,30);

    //Operaciones
    JButton suma = new JButton("Sumar" );
    suma.setBounds(30, 110, 100, 30);

    JButton resta = new JButton("Resta");
    resta.setBounds(150, 110, 110, 30);

    JButton multiplicacion = new JButton("Multiplicación");
    multiplicacion.setBounds (270, 110, 110, 30);  

    JButton division = new JButton("División");
    division.setBounds (390, 110, 110, 30);

    //Conversiones 
    JButton CaF = new JButton("Celsius  a Fahrenheit");
    CaF.setBounds(30, 160, 110, 30);

    JButton FaC = new JButton("Fahrenheit a Celsius");
    FaC.setBounds(150,160,110,30);

    JButton USD = new JButton("USD a COP");
    USD.setBounds(30,210,110,30);

    JButton COP = new JButton("COP a USD");
    COP.setBounds(150,210,110,30);

     //Eventos Diego
    suma.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent accionSuma) {
            if (num1.getText().isEmpty() || num2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debes llenar ambos campos");   
            } else {
                try{
                    int n1 = Integer.parseInt(num1.getText());
                    int n2 = Integer.parseInt(num2.getText());
                    int resultadoSuma = n1 + n2;
                    JOptionPane.showMessageDialog(null,"La suma es: "+ resultadoSuma);
                } catch (Exception error){
                    JOptionPane.showMessageDialog(null, "Ingrese solo números");
                }
            }

        }
    });


    resta.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent accionResta){
            if(num1.getText().isEmpty() || num2.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Debes llenar ambos campos");   
            } else {
                try{
                    int n1 = Integer.parseInt(num1.getText());
                    int n2 = Integer.parseInt(num2.getText());
                    int resultadoResta = n1 - n2;
                    JOptionPane.showMessageDialog(null,"La suma es: "+ resultadoResta);
                } catch (Exception error){
                    JOptionPane.showMessageDialog(null, "Ingrese solo números");
                }
            }
        }
    });




    ventana.add(numero1); ventana.add(num1);
    ventana.add(numero2); ventana.add(num2);
    ventana.add(suma); ventana.add(resta);

    ventana.setVisible(true);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
