package Funcionarios;

public class Secretario extends Funcionarios {
    private final double beneficio=0.2;
    private double salarioBenefico;
    public Secretario (double salario, String dataContratacao, String nome) {
        super(7000, dataContratacao, nome);
    }

    public double calculaSalarioBeneficio(Funcionarios f) {
        this.salarioBenefico = (f.getSalario())+(this.beneficio*(f.getSalario()));
        return salarioBenefico;
    }


}
