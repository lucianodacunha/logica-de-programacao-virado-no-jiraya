package net.lucianodacunha.aula17;

/**
 * aula-17
 */
public class CalculaImpostoDeRenda {
    public static void main(String[] args) {
        double salarioBruto = 4650.0;
        double salarioLiquido ;
        double aliquota ;
        double imposto;
        double deducao;
        double redutorAdicional = 0.0;
        double valorTetoIsencao = 5000.0;

        if (salarioBruto <= 2428.80){
            imposto = 0.0;
            aliquota = 0.0;
            deducao = 0.0;
            salarioLiquido = salarioBruto - (imposto - deducao);
        } else if (salarioBruto >= 2428.81 && salarioBruto <= 2826.65){
            aliquota = 0.075;
            imposto = salarioBruto * aliquota;
            deducao = 182.16;
            if (salarioBruto <= valorTetoIsencao){
                redutorAdicional = salarioBruto - (salarioBruto - (imposto - deducao));
            }
            salarioLiquido = salarioBruto - (imposto - (deducao + redutorAdicional));
        } else if (salarioBruto >= 2826.66 && salarioBruto <= 3751.05){
            aliquota = 0.15;
            imposto = salarioBruto * aliquota;
            deducao = 394.16;
            if (salarioBruto <= valorTetoIsencao){
                redutorAdicional = salarioBruto - (salarioBruto - (imposto - deducao));
            }
            salarioLiquido = salarioBruto - (imposto - (deducao + redutorAdicional));
        } else if (salarioBruto >= 3751.06 && salarioBruto <= 4664.68){
            aliquota = 0.225;
            imposto = salarioBruto * aliquota;
            deducao = 675.49;
            if (salarioBruto <= valorTetoIsencao){
                redutorAdicional = salarioBruto - (salarioBruto - (imposto - deducao));
            }
            salarioLiquido = salarioBruto - (imposto - (deducao + redutorAdicional));
        } else {
            aliquota = 0.275;
            imposto = salarioBruto * aliquota;
            deducao = 908.73;
            if (salarioBruto <= valorTetoIsencao){
                redutorAdicional = salarioBruto - (salarioBruto - (imposto - deducao));
            }
            salarioLiquido = salarioBruto - (imposto - (deducao + redutorAdicional));
        }

        System.out.println("Salario Bruto: " + salarioBruto +
                "\nImposto (" + aliquota + "): " + imposto +
                "\nDeducao: " + deducao +
                "\nRedutor Adicional: " + redutorAdicional +
                "\nSalario Liquido: " + salarioLiquido
        );
    }
}
