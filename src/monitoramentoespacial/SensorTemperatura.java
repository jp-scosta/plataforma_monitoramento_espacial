package monitoramentoespacial;

import java.util.Random;

public class SensorTemperatura extends ComponenteEspacial implements Sensor {
    
    private final double limiteMaximoSeguro = 85.0; 
    private final Random randomizador = new Random();

    public SensorTemperatura(int id, String nome) {
        super(id, nome);
    }

    @Override
    public double lerValor() {
        if (!verificarFuncionamento()) {
            System.out.println("[" + nome + "] Leitura impossível: Dispositivo desligado.");
            return 0.0;
        }
        
        double valorSimulado = -10.0 + (randomizador.nextDouble() * 120.0);
        
        this.temperatura = valorSimulado;
        
        return valorSimulado;
    }

    @Override
    public boolean verificarFuncionamento() {
        return "Ligado".equalsIgnoreCase(this.status);
    }

    @Override
    public String retornarTipo() {
        return "Temperatura";
    } // Implementação do método retornarTipo() da interface Sensor.

    @Override
    public void realizarAutoDiagnostico() {
        System.out.println("[Auto-Diagnóstico] Analisando termopares e calibração do sensor: " + this.nome);
        System.out.println("Status Atual: " + this.status + " | Última Temperatura: " + String.format("%.2f", this.temperatura) + "°C");
        if (this.temperatura > limiteMaximoSeguro) {
            System.out.println("Alerta de Hardware: Sensor operou acima do limite seguro de " + limiteMaximoSeguro + "°C!");
        } else {
            System.out.println("Hardware operando dentro dos parâmetros térmicos normais.");
        } 
    } // Implementação do método abstrato da classe mãe ComponenteEspacial.

    public double getLimiteMaximoSeguro() {
        return limiteMaximoSeguro;
    }
}
