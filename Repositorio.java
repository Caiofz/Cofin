/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import com.mycompany.cofin.OperacaoEntrada;
import com.mycompany.cofin.OperacaoSaida; //É NECESSÁRIO IMPORTAR PARA USAR OS DADOS DE OPERACAOSAIDA / OPERACAOENTRADA
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author -
 */
public class Repositorio {
    public static List<OperacaoEntrada> entradas = new ArrayList<>();
    public static float somaReceita(){
        float soma = 0.0f;
        for ( OperacaoEntrada receita : entradas){
            soma += receita.getValor();
        }
        return soma;
    }
    public static List<OperacaoSaida> saidas = new ArrayList<>();
    public static float somaDespesa(){
        float soma = 0.0f;
        for ( OperacaoSaida despesa : saidas) {
            soma += despesa.getValor();
        }
        return soma;
    }
    public float saldo(){
        float resultado = somaReceita() - somaDespesa();
 //       Float.toString(resultado); // IRÁ RETORNAR UM RESULTADO TIPO STRING 
       return  resultado;//(PROFESSOR FALOU PRA FAZER ASSIM DEPOIS DE CRIAR DESPESA)
    }
    public String saldoString(){
        return Float.toString(saldo());
    }


    
}
