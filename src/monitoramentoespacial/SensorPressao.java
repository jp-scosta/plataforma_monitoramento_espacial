package monitoramentoespacial;

import java.util.Random;

public class SensorPressao extends ComponenteEspacial implements Sensor {
    
    private final double limiteMaximoSeguro = 1.2; 
    private final double limiteMinimoSeguro = 0.8; 
    private final Random randomizador = new Random();

    public SensorPressao(int id, String nome) {
        super(id, nome);
    }

    @Override
    public double lerValor() {
        if (!verificarFuncionamento()) {
            System.out.println("[" + nome + "] Leitura impossível: Dispositivo desligado.");
            return 0.0;
        } // Implementação do método lerValor() da interface Sensor.
        
        // Simula uma pressão oscilando normalmente entre 0.5 ATM e 1.5 ATM
        return 0.5 + (randomizador.nextDouble() * 1.0);
    }

    @Override
    public boolean verificarFuncionamento() {
        return "Ligado".equalsIgnoreCase(this.status);
    } // Implementação do método verificarFuncionamento() da interface Sensor.

    @Override
    public String retornarTipo() {
        return "Pressão";
    } // Implementação do método retornarTipo() da interface Sensor.

    @Override
    public void realizarAutoDiagnostico() {
        System.out.println("[Auto-Diagnóstico] Testando integridade do diafragma mecânico do sensor: " + this.nome);
        System.out.println("Status Atual: " + this.status);
        System.out.println("Linhas de vácuo e vedação pneumática validadas com sucesso.");
    } // Implementação obrigatória do método abstrato de ComponenteEspacial.

    public double getLimiteMaximoSeguro() {
        return limiteMaximoSeguro;
    }

    public double getLimiteMinimoSeguro() {
        return limiteMinimoSeguro;
    }
}
