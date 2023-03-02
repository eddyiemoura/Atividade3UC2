
package atividade3uc2;

public class FabricaResistencia implements Modelo{

    
    public Corrida getCorrida() {
        return new CorridaDeResistencia();
    }

    
    public Musculacao getMusculacao() {
        return new Levantamento();
    }
    
}
