package monitoramentoespacial;

import java.util.Random;

public class SensorRadiacao extends ComponenteEspacial implements Sensor {
    
    // Atributo específico para simulação de limites de radiação segura (em µSv/h - MicroSieverts por hora)
    private final double limiteMaximoSeguro = 100.0; 
    private final Random randomizador = new Random();

    public SensorRadiacao(int id, String nome) {
        super(id, nome);
    }

    @Override
    public double lerValor() {
        if (!verificarFuncionamento()) {
            System.out.println("[" + nome + "] Leitura impossível: Dispositivo desligado.");
            return 0.0;
        }
        
        return randomizador.nextDouble() * 250.0;
    }

    @Override
    public boolean verificarFuncionamento() {
        return "Ligado".equalsIgnoreCase(this.status);
    }

    @Override
    public String retornarTipo() {
        return "Radiação";
    }

    @Override
    public void realizarAutoDiagnostico() {
        System.out.println("[Auto-Diagnóstico] Testando o tubo Geiger-Müller e placas de blindagem de chumbo de: " + this.nome);
        System.out.println("Status Atual: " + this.status);
        System.out.println("Sensores de ionização e atenuação calibrados perfeitamente.");
    }

    public double getLimiteMaximoSeguro() {
        return limiteMaximoSeguro;
    }
}
