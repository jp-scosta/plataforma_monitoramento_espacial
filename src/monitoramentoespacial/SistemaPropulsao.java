package monitoramentoespacial;

public abstract class SistemaPropulsao extends ComponenteEspacial {
	
    protected int potencia;

    public SistemaPropulsao(int id, String nome) {
        super(id, nome); 
        this.potencia = 0; 
    }

    public void acelerar(int porcentagem) {
    	
        if (!this.status.equals("Ligado")) {
            System.out.println("Erro em [" + nome + "]: Não é possível acelerar com os motores desligados.");
            return;
        }

        if (porcentagem >= 0 && porcentagem <= 100) {
            this.potencia = porcentagem;
            System.out.println("[" + nome + "] Acelerado para " + this.potencia + "% de potência.");
            System.out.println("Empuxo Atual: " + calcularEmpuxo() + " kN.");
        } else {
            System.out.println("Erro de Validação: Potência informada (" + porcentagem + "%) inválida. Use valores de 0 a 100.");
        }
    }

    public abstract double calcularEmpuxo();

    public int getPotencia() {
        return potencia;
    }
}