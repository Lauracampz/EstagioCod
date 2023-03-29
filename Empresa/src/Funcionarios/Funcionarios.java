package Funcionarios;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Funcionarios {
    private double salario;
    private String dataContratacao;
    private int anosDeServico;
    private String nome;

    public Funcionarios(double salario, String dataContratacao, String nome ){
        this.salario = salario;
        this.nome=nome;
        this.dataContratacao =dataContratacao;

    }
    public int getAnosDeServico() {
        
        GregorianCalendar hoje = new GregorianCalendar();
        int mesh = hoje.get(Calendar.MONTH) + 1;
        int anoh = hoje.get(Calendar.YEAR);

        // Data da contratacao
        int mes = Integer.valueOf(this.dataContratacao.substring(0,1));
        int ano = Integer.valueOf(this.dataContratacao.substring(2,5));

        // Idade.
        int anosSer;

        if (mes < mesh || (mes == mesh ))
        anosSer = anoh - ano;
    else
        anosSer = (anoh - ano)-1;

        this.anosDeServico=anosSer;
        return (this.anosDeServico);
    }


    public double getSalario() {
        return (salario*anosDeServico);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public double calculaSalarioBeneficio(Funcionarios f) {
         return 0.0;
    }



}
