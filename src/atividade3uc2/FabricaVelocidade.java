
package atividade3uc2;

class FabricaVelocidade implements Modelo{
    public Corrida getCorrida(){
        return new CorridaDePista();
    }
    public Musculacao getMusculacao() {
        return new Esteira();
    }
    
    
}


