package monitoramentoespacial;

public class DadosMissao {
	
    private String trajetoria;
    private int numeroTripulantes;
    private double nivelCombustivel; 
    private String coordenadas;
    
    private final String codigoAcesso = "missao2026"; // Senha interna do sistema para liberar dados restritos

    public DadosMissao(String trajetoria, int numeroTripulantes, double combustivelInicial, String coordenadasIniciais) {
        this.trajetoria = trajetoria;
        this.numeroTripulantes = numeroTripulantes;
        
        setNivelCombustivel(combustivelInicial); 
        this.coordenadas = coordenadasIniciais;
    }

    public void setNivelCombustivel(double nivelCombustivel) {
        if (nivelCombustivel >= 0 && nivelCombustivel <= 100) {
            this.nivelCombustivel = nivelCombustivel;
            
            if (this.nivelCombustivel < 20) {
                System.out.println("\nATENÇÃO: Nível de combustível crítico: " + this.nivelCombustivel + "%!");
            }
        } else {
            System.out.println("Erro de Validação: O nível de combustível deve estar entre 0% e 100%.");
        }
    }

    public double getNivelCombustivel() {
        return this.nivelCombustivel;
    }

    // Proteção de dados sensíveis: Coordenadas só podem ser lidas se fornecer a senha correta
    public String getCoordenadas(String senha) {
        if (this.codigoAcesso.equals(senha)) {
            return this.coordenadas;
        } else {
            return "ACESSO NEGADO: Código de acesso incorreto.";
        }
    }

    // Alteração de dados sensíveis: Coordenadas só podem ser alteradas com a senha correta
    public void setCoordenadas(String novasCoordenadas, String senha) {
        if (this.codigoAcesso.equals(senha)) {
            this.coordenadas = novasCoordenadas;
            System.out.println("Coordenadas atualizadas com sucesso no sistema.");
        } else {
            System.out.println("Alteração Bloqueada: Código de acesso inválido.");
        }
    }

    public String getTrajetoria() {
        return trajetoria;
    }

    public void setTrajetoria(String trajetoria) {
        this.trajetoria = trajetoria;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        if (numeroTripulantes >= 0) {
            this.numeroTripulantes = numeroTripulantes;
        } else {
            System.out.println("Erro: O número de tripulantes não pode ser negativo.");
        }
    }
}