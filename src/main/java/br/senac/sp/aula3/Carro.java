/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula3;

/**
 *
 * @author fernando.fernandes
 */
public class Carro {
    
    private static String fabricante;
    private String rodas [];
    private String cor;
    private String modelo;
    private int velocidadeAtual;
    private int gasolina;
    private int max_gasolina;

    /*public Carro(int gasolina, int max_gasolina) {
        this.gasolina = gasolina;
        this.max_gasolina = max_gasolina;
    }*/
    
    
    //Retornar o fabricante do veiculo
public String getfabricante() {
        return fabricante;
}

//Definir o fabricante do veículo
public void setfabricante(String pfabricante) {
        this.fabricante = pfabricante;
}


    //Retornar a roda do veiculo
public String [] getrodas() {
        return rodas;
}

//Definir a roda do veículo
public void setrodas(String[] rodas) {
        this.rodas = rodas;
}

    
    //Retornar a cor do veiculo
public String getCor() {
        return cor;
}

//Definir a cor do veículo
public void setCor(String pCor) {
        this.cor = pCor;
}


    //Retornar o modelo do veiculo
public String getModelo() {
        return modelo;
}

//Definir o modelo do veículo
public void setModelo(String pModelo) {
        this.modelo = pModelo;
}


    //Retornar a velocidade Atual do veiculo
public int getVelocidadeAtual() {
        return velocidadeAtual;
}

    //Definir a velocidade Atual do veículo
public void setVelocidadeAtual(int pVelocidadeAtual) {
        this.velocidadeAtual = pVelocidadeAtual;
}




    //Método para retornar a descrição do veículo
public String descreve() {
        
        if (this.modelo == null){
          return "Um carro";
        }
        if(this.cor == null){
            return "Um "+this.modelo;
        }
        return "Um " + this.modelo + " na cor " + this.cor;
}

}
