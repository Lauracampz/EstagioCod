package Funcionarios;

public class Gerente extends Funcionarios{
    private final double beneficio=0.0;
    private double salarioBenefico;


    public Gerente(int salario, String dataContratacao, String nome) {
        super(20000, dataContratacao, nome);
    }
    public double calculaSalarioBeneficio(Funcionarios f) {
        this.salarioBenefico = (f.getSalario())+(this.beneficio*(f.getSalario()));
        return salarioBenefico;
    }

}
