package br.apphospital.modelo;

import java.io.Serializable;

public class Medico extends Funcionario implements Serializable{
    private String crm;
    private String especialidade;
    private String salario;
    
    //GET E SET

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    
    
    //CALCULO DE SALARIO
    public String calculaSalario(){
        if(especialidade.equals("Pediatra") && numhorastrab <=20){
            return salario = "SALARIO DE: R$ 7.338,00";
        }else if (especialidade.equals("Médico do Trabalho") && numhorastrab <=20){
            return salario = "SALARIO DE: R$ 7.242,00";
        }else if(especialidade.equals("Clínica Geral") && numhorastrab <=20){
            return salario ="SALARIO DE: R$ 6.617,00";
        }else if(especialidade.equals("Ginecologista") && numhorastrab <=20){
            return salario ="SALARIO DE: R$ 6.2014,00";
        }else if(especialidade.equals("Psiquiatra") && numhorastrab <=20){
            return salario ="SALARIO DE: R$ 5.869,00";
        }else if(especialidade.equals("Cardiologista") && numhorastrab <=20){
            return salario ="SALARIO DE: R$ 5.419,00";
        //SEGUNDA PARTE DO IF
        }else if(especialidade.equals("Pediatra") && numhorastrab > 20 && numhorastrab <=40){
            return salario ="SALARIO DE: R$ 15.000,00";
        }else if (especialidade.equals("Médico do Trabalho") && numhorastrab > 20 && numhorastrab <=40){
            return salario ="SALARIO DE: R$ 14.000,00";
        }else if(especialidade.equals("Clínica Geral") && numhorastrab > 20 && numhorastrab <=40){
            return salario ="SALARIO DE: R$ 13.000,00";
        }else if(especialidade.equals("Ginecologista") && numhorastrab > 20 && numhorastrab <=40){
            return salario ="SALARIO DE: R$ 14.000,00";
        }else if(especialidade.equals("Psiquiatra") && numhorastrab > 20 && numhorastrab <=40){
            return salario ="SALARIO DE: R$ 11.000,00";
        }else if(especialidade.equals("Cardiologista") && numhorastrab > 20 && numhorastrab <=40){
            return salario ="SALARIO DE: R$ 12.500,00";
        }
        return null;
        
    }
    //TO STRING (EXIBIR DADOS)

    @Override
  public String toString()
{
    super.toString();
           return"Médico: "+nome+
            "| Numero de Horas: "+numhorastrab+
            "| CRM: "+crm+
            "| Especialidade: "+especialidade+
            "| Salário: "+salario;
}
  
}
