package monitoramentoespacial;

public interface Sensor {
    
    double lerValor();

    boolean verificarFuncionamento();

    String retornarTipo(); // Identifica a categoria/tipo do sensor.
}