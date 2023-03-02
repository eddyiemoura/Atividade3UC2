package atividade3uc2;

public class ListaExercicios {
    private Corrida exercicioCorrida;
    private Musculacao exercicioMusculacao;
    private Modelo fabricaModelo;
    
    public ListaExercicios (Modelo fabrica){
        fabricaModelo = fabrica;
    }
    
    public Corrida getExercicioCorrida(){
        return exercicioCorrida;
    }
    
    public Musculacao getExercicioMusculacao(){
        return exercicioMusculacao;
    }
    
    public void gerar(){
        exercicioCorrida = fabricaModelo.getCorrida();
        exercicioMusculacao = fabricaModelo.getMusculacao();
    }
}
