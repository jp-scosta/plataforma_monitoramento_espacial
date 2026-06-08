package monitoramentoespacial;

public abstract class ComponenteEspacial {

    protected int id;
    protected String nome;
    protected String status;
    protected double temperatura;

    public ComponenteEspacial(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.status = "Desligado"; 
        this.temperatura = 21.5; 
    }

    public void ligar() {
        this.status = "Ligado";
        System.out.println("[" + nome + "] Foi inicializado e está ligado.");
    }

    public void desligar() {
        this.status = "Desligado";
        System.out.println("[" + nome + "] Foi desativado e está desligado.");
    }

    public abstract void realizarAutoDiagnostico();

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getStatus() {
        return status;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}