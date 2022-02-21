
package br.edu.fatecfranca.ex0;

import javax.swing.JOptionPane;

public class Carro {
    //declaração das variáveis
    String modelo;
    int ano;
    float velocidade;
    boolean motor;
    
    
    //métodos construtores
    Carro(){
        
    }
    
    
    //métodos construtores
    Carro(String md, int an, float ve, boolean mt){
       this.modelo = md;
       this.ano = an;
       this.velocidade = ve;
       this.motor = mt;
    }
    
    //métodos
    void ligar(){
        this.motor = true;
        this.velocidade = 0;
    }
    void desligar(){
        this.motor = false;
        this.velocidade = 0;
    }
    void acelerar(float x){
        this.velocidade+= x;
    }
    void frear(float x){
        this.velocidade+= x;
    }
    void mostrar (){
        JOptionPane.showMessageDialog(null,"Modelo: " + this.modelo + "Ano:" + this.ano + " Vel: " + this.velocidade + " Motor " + this.motor);
    }
    
    
}
