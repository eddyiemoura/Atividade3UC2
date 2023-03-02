package atividade3uc2;

import java.util.Scanner;

public class Atividade3UC2 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe exercicios de: 1 - Velocidade; 2 - Resistencia");
        byte opc = leia.nextByte();
        
        Modelo modelo = null;
        switch(opc){
            case 1: modelo = new FabricaVelocidade(); break;
            case 2: modelo = new FabricaResistencia(); break;
        }
        
        ListaExercicios lista = new ListaExercicios(modelo);
        lista.gerar();
        
        System.out.println("Corrida: "+lista.getExercicioCorrida().toString());
        System.out.println("Musculação: "+lista.getExercicioMusculacao().toString());
    }
    
}
