package br.apphospital.modelo;

import java.io.Serializable;

public class Psicologo extends Funcionario implements Serializable{
    private String crp;
    private String salario;
    public String getCrp(){
        return crp;
    }

    public void setCrp(String crp) {
        this.crp = crp;
    }

    public String getSalario() {
        return salario;
    }

    //GET E SET
    public void setSalario(String salario) {
        this.salario = salario;
    }

    //CALCULO DE SALARIO
    public String calculaSalario() {
        if(numhorastrab <=20){
            return salario = "SALARIO DE: R$ 2.113,00";
        }else if (numhorastrab < 20 && numhorastrab <= 30){
            return salario = "SALARIO DE: R$ 5.503,00";
        }else if(numhorastrab < 30 && numhorastrab <= 40){
            return salario = "SALARIO DE: R$ 10.780,00";
        }
        return null;
    }
    //TO STRING (EXIBIR DADOS)

        @Override
  public String toString()
{
    super.toString();
           return"Psicólogo: "+nome+
            "| Numero de Horas: "+numhorastrab+
            "| CRM: "+crp+
            "| Salário: "+salario;
    
}
}

