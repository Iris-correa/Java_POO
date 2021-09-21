
package funcionario;

/**
 *
 * @author Iris Correa
 */
public class Funcionario {
    public static void main(String[] args) {
        //objeto para instanciar a class
        // nome class objeto(nome) = neew (instanciar) objeto(mesmo nome)();
        
        Assalariado assala = new Assalariado();
        Autonomo auto = new Autonomo();
        Comissionado comissionado = new Comissionado();
        
        // Chamar os métodos de entrada
        // Tipo da variável - nome da variável = objeto.método()
        
        //ASSALARIADO
        
        double salarioBase = assala.EntrarSalario();
        int falta = assala.EntrarFaltas();
        double calcSalario = assala.CalcularSalario(salarioBase, falta);
        
        //Chamar métodos de saída
        //Para saída, como o returno é zero eu não preciso criar uma variável
        
       assala.ExibirSalario(calcSalario);
       
       //AUTONOMO 
       //metodos de entrada
       double HorasTrabalhadas = auto.EntrarHorasTrabalhadas();
       double ValorHora = auto.EntrarValorHora();
       double CalSalario = auto.CalculoSalario(ValorHora, HorasTrabalhadas);
       //Metodos de saída 
       
       auto.ExibirSalario(CalSalario);
        
       //COMISSIONADO 
       //Métodos de entrada
       double TotalVendas = comissionado.EntrarTotalVendas();
       double PorcentComis = comissionado.EntrarComissao();
       double Calsal = comissionado.CalculoSalario(TotalVendas, PorcentComis);
       
       //Métodos de saída
       comissionado.ExibirSalario(Calsal);
       
    }
    
}
