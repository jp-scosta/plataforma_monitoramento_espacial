package monitoramentoespacial;

public class PropulsaoQuimica extends SistemaPropulsao {

    private String tipoCombustivel; 
    private double pressaoCamaraCombustao; 

    public PropulsaoQuimica(int id, String nome, String tipoCombustivel, double pressaoInicial) {
        super(id, nome); 
        this.tipoCombustivel = tipoCombustivel;
        this.pressaoCamaraCombustao = pressaoInicial;
    }


    @Override
    public double calcularEmpuxo() {
        // Fórmula simulada: A potência atual multiplicada pela pressão da câmara
        return this.potencia * (this.pressaoCamaraCombustao / 10.0);
    }

    @Override
    public void realizarAutoDiagnostico() {
        System.out.println("[Auto-Diagnóstico - Química] Checando bicos injetores de " + this.tipoCombustivel + ".");
        System.out.println("Pressão atual da câmara de combustão: " + this.pressaoCamaraCombustao + " PSI.");
        System.out.println("Todos os sistemas do motor químico " + this.nome + " estão operacionais.");
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getPressaoCamaraCombustao() {
        return pressaoCamaraCombustao;
    }

    public void setPressaoCamaraCombustao(double pressaoCamaraCombustao) {
        if (pressaoCamaraCombustao >= 0) {
            this.pressaoCamaraCombustao = pressaoCamaraCombustao;
        }
    }
}
