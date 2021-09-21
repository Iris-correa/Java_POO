
package ConsutorioAdvogados;

import javax.swing.JOptionPane;

/**
 *
 * @author Iris Correa
 */
public class Advogado {
    
    //Métodos de entrada 
    
    public double EntrarTrabalhista(){
        double valortrab= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da causa Trabalhista: "));
        return valortrab;
    }
    public double EntrarCriminal(){
        double valorcrim= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da causa Criminal: "));
        return valorcrim;
    }
    public double EntrarCivil(){
        double valorcivil= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da causa Civil: "));
        return valorcivil;
    }
    //Métodos de calculo
    public double CalculoTrabalhista(double trab){
        double trabalhista = trab*0.1;
        return trabalhista;
    }
    public double CalculoCriminal(double cr){
        double criminal = cr*0.2;
        return criminal;
    }
    public double CalculoCivil(double civ ){
        double civil = civ*0.3;
        return civil;
    }
    //Método de saída
    public void ExibirTotalHonorario(double trab, double cr, double civ){
        JOptionPane.showMessageDialog(null , "Honorario Trabalhista: " + trab + "\nHonorario Criminal: " + cr + "\nHonorario Civil: " + civ);
    }
}
