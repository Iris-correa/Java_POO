
package funcionario;

import javax.swing.JOptionPane;

/**
 *valor 
 * @author Iris Correa
 */
public class Autonomo {
    public double EntrarValorHora(){
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor por hora: "));
        return valorHora;
    }
    public double EntrarHorasTrabalhadas(){
        double trabalhoHora = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite horas trabalhadas: "));
        return trabalhoHora;
    }
    public double CalculoSalario(double vh , double ht){
        double salarioTotal = vh*ht*30;
        return salarioTotal;
    }
    public void ExibirSalario(double salarioTotal){
        JOptionPane.showMessageDialog(null,"O salario liquido é: " + salarioTotal);
    }
}
