package Funcionarios;

public class Vendedor extends Funcionarios{

    private double salarioBenefico;
    private final double beneficio=0.3;
    private int [] vendasPorMes;
    public Vendedor(int salario, String dataContratacao, String nome) {
        super(12000, dataContratacao, nome);
    }

    public int[] getVendasPorMes() {
        return vendasPorMes;
    }
    public void setVendasPorMes(int[] vendasPorMes) {
        this.vendasPorMes = vendasPorMes;
    }
    public double calculaSalarioBeneficio(Funcionarios f, int mes) {

        this.salarioBenefico = (f.getSalario())+(this.beneficio*(vendasPorMes[mes]));
        return salarioBenefico;
    }


}
