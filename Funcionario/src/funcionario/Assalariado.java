
package funcionario;

import javax.swing.JOptionPane;

/**
 *
 * @author Iris Correa
 */
public class Assalariado {
    //metdos de entrada
    public double EntrarSalario(){
        double salarioBase = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu salario base: "));
        return salarioBase;
    }
    public int EntrarFaltas(){
        int faltas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de faltas: "));
        return faltas;
    }
    //metodo para cal salario 
    public double CalcularSalario(double salarioB, int nfalta){
        double salarioFinal = salarioB - (salarioB/30*nfalta);
        return salarioFinal;
    }
    //metodos de saida
    public void ExibirSalario( double salliq){
        JOptionPane.showMessageDialog(null,"Salario liquido: " + salliq);
    }
}
