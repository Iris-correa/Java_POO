
package funcionario;

import javax.swing.JOptionPane;

/**
 *
 * @author Iris Correa
 */
public class Comissionado {
    public double EntrarTotalVendas(){
        double totalVendas = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o total de vendas no mes: "));
        return totalVendas;
    }
    public double EntrarComissao(){
        double comissao = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a porcentagem de vendas: "));
        return comissao;
    }
    public double CalculoSalario(double tv, double comis){
        double CalSal = tv*(comis/100);
        return CalSal;
    }
    
    public void ExibirSalario(double sal){
        JOptionPane.showMessageDialog(null, "Sua comissao e de: " + sal);
    }
    
}
