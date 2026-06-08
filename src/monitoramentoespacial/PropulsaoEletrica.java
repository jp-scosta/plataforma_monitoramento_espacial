package monitoramentoespacial;

public class PropulsaoEletrica extends SistemaPropulsao {
   
    private double consumoMegawatts; 
    private double eficienciaIonica; 

    public PropulsaoEletrica(int id, String nome, double consumoMegawatts, double eficienciaIonica) {
        super(id, nome);
        this.consumoMegawatts = consumoMegawatts;
        
        if (eficienciaIonica >= 0.0 && eficienciaIonica <= 1.0) {
            this.eficienciaIonica = eficienciaIonica;
        } else {
            this.eficienciaIonica = 0.85; 
        }
    }

    @Override
    public double calcularEmpuxo() {
        
        return this.potencia * this.consumoMegawatts * this.eficienciaIonica;
    }


    @Override
    public void realizarAutoDiagnostico() {
        System.out.println("[Auto-Diagnóstico - Elétrica] Analisando grades de aceleração eletrostática de íons.");
        System.out.println("Consumo nominal de energia: " + this.consumoMegawatts + " MW.");
        System.out.println("Eficiência dos propulsores: " + (this.eficienciaIonica * 100) + "%.");
        System.out.println("Campo magnético e injetores de gás (Xenônio) operando estavelmente.");
    }

    public double getConsumoMegawatts() {
        return consumoMegawatts;
    }

    public double getEficienciaIonica() {
        return eficienciaIonica;
    }

    public void setEficienciaIonica(double eficienciaIonica) {
        if (eficienciaIonica >= 0.0 && eficienciaIonica <= 1.0) {
            this.eficienciaIonica = eficienciaIonica;
        }
    }
}
