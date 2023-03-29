package Empresa;
import Funcionarios.*;
import java.util.*;
public class Empresa {
    List<Funcionarios> listaFuncionarios = new ArrayList<>();
    public double ValorPagoSalarioBeneficio(List<Funcionarios> f, int mes) {
        double valor=0;
        for(int i=0; i<listaFuncionarios.size(); i++){
            Funcionarios c = listaFuncionarios.get(i);
            valor+=c.calculaSalarioBeneficio(c);
        }

        return valor;
    }
    public double ValorPagoSalario(List<Funcionarios> f, int mes) {
        double valor=0;
        for(int i=0; i<listaFuncionarios.size(); i++){
            Funcionarios c = listaFuncionarios.get(i);
            valor+=c.getSalario();
        }

        return valor;
    } // sem beneficio

    public List<Funcionarios> FuncionariosSemBeneficio(List<Funcionarios> f) {

        List<Funcionarios> listaFuncionariosSemBeneficio = new ArrayList<>();

        for(int i=0; i<listaFuncionarios.size(); i++){
            Funcionarios c = listaFuncionarios.get(i);
            if (c instanceof Vendedor){
                listaFuncionariosSemBeneficio.add(c);
            }
        }

        return listaFuncionariosSemBeneficio;
    }

    public double CalculaFuncionariosSemBeneficio(List<Funcionarios> f) {


        double valor=0;
        List<Funcionarios> listaFuncionariosSemBeneficio = new ArrayList<>();
        listaFuncionariosSemBeneficio= FuncionariosSemBeneficio(f);

        for(int i=0; i<listaFuncionariosSemBeneficio.size(); i++){
            Funcionarios c = listaFuncionariosSemBeneficio.get(i);
            valor+=c.getSalario();

        }
        return valor;
    }

    public Funcionarios ComparaMaiorSalario(List<Funcionarios> f) {

        int posicaoMaior=-1;
        double maiorSalario=0;

        for(int i=0; i<listaFuncionarios.size(); i++){
            Funcionarios c = listaFuncionarios.get(i);
            if (c.getSalario() > maiorSalario) {
                maiorSalario = c.getSalario();
                posicaoMaior = i;
            }
        }
        return listaFuncionarios.get(posicaoMaior);
    }









}


