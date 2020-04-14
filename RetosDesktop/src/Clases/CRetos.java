/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JTextField;

/**
 *
 * @author FrankS
 */
public class CRetos {
    
    public void promedio (JTextField num1, JTextField num2, JTextField num3, JTextField promedio, JTextField condicion)
    {
        
        
      /*Creamos el acumulador o variable que guardará el promedio en número*/
     double TotalPromedio=0;
     
     /*Calculamos el promedio de los número ingresados*/
     TotalPromedio = (Double.parseDouble(num1.getText()) + Double.parseDouble(num2.getText())+ Double.parseDouble(num3.getText()))/3;
     //Ingresamos en nuestro jtextfield el valor calculado del promedio
     
     double valorfinal = Math.round(TotalPromedio*100d)/100d;
     
     promedio.setText(String.valueOf(valorfinal));
     
     //Aquí mostraremos si cumplimos las notas para aprobar o desaprobar
     
        if (TotalPromedio>=10.5) {
            condicion.setText("Aprobado");
        }
        else
        {
            condicion.setText("Desaprobado");
        }
    }
    
    public void LimpiarCampos (JTextField num1, JTextField num2, JTextField num3, JTextField promedio, JTextField condicion)
    {
    num1.setText("");
    num2.setText("");
    num3.setText("");
    promedio.setText("");
    condicion.setText("");
    }
}
