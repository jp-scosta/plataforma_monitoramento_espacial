package monitoramentoespacial;

import java.util.Scanner;

public class SistemaMonitoramento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Inicializando os Dados da Missão
        DadosMissao dadosMissao = new DadosMissao(
            "Órbita Baixa da Terra -> Marte", // Trajetória
            5,                               // Tripulantes
            100.0,                           // Combustível inicial (%)
            "COORD-XYZ-9982-ALPHA"           // Coordenadas iniciais
        );

        // 2. Inicializando os Componentes 
        SensorTemperatura sensorTemp = new SensorTemperatura(101, "Sensor Térmico Principal");
        SensorPressao sensorPres = new SensorPressao(102, "Sensor de Pressão Interna");
        SensorRadiacao sensorRad = new SensorRadiacao(103, "Contador Geiger Externo");

        PropulsaoQuimica motorQuimico = new PropulsaoQuimica(201, "Propulsor Químico Booster", "Oxigênio Líquido", 350.0);
        PropulsaoEletrica motorEletrico = new PropulsaoEletrica(202, "Motor Iônico DeepSpace", 4.5, 0.92);

        System.out.println("====================================================");
        System.out.println(" PLATAFORMA DE MONITORAMENTO ESPACIAL INICIALIZADA! ");
        System.out.println("====================================================");

        boolean rodando = true;

        // 3. Loop Principal do Menu Interativo
        while (rodando) {
            System.out.println("\n--- MENU PRINCIPAL DE COMANDO ---");
            System.out.println("1. Ligar / Desligar Sistemas");
            System.out.println("2. Ler Sensores e Verificar Alertas");
            System.out.println("3. Acionar Sistemas de Propulsão (Acelerar)");
            System.out.println("4. Executar Auto-Diagnóstico de Hardware");
            System.out.println("5. Consultar Telemetria e Dados Sensíveis da Missão");
            System.out.println("6. Alterar Nível de Combustível");
            System.out.println("0. Sair do Sistema");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("\n[ Painel de Controle de Energia ]");
                    System.out.println("1. LIGAR todos os componentes");
                    System.out.println("2. DESLIGAR todos os componentes");
                    System.out.print("Opção: ");
                    int optEnergia = scanner.nextInt();
                    
                    if (optEnergia == 1) {
                        sensorTemp.ligar();
                        sensorPres.ligar();
                        sensorRad.ligar();
                        motorQuimico.ligar();
                        motorEletrico.ligar();
                    } else {
                        sensorTemp.desligar();
                        sensorPres.desligar();
                        sensorRad.desligar();
                        motorQuimico.desligar();
                        motorEletrico.desligar();
                    }
                    break;

                case 2:
                    System.out.println("\n[ TELEMETRIA DOS SENSORES EM TEMPO REAL ]");
                    
                    // Lendo e validando Sensor de Temperatura
                    double t = sensorTemp.lerValor();
                    if (sensorTemp.verificarFuncionamento()) {
                        System.out.print("-> " + sensorTemp.retornarTipo() + " (" + sensorTemp.getNome() + "): " + String.format("%.2f", t) + " °C ");
                        if (t > sensorTemp.getLimiteMaximoSeguro()) {
                            System.out.println("[CRÍTICO: Superaquecimento!]");
                        } else {
                            System.out.println("[OK]");
                        }
                    }

                    // Lendo e validando Sensor de Pressão
                    double p = sensorPres.lerValor();
                    if (sensorPres.verificarFuncionamento()) {
                        System.out.print("-> " + sensorPres.retornarTipo() + " (" + sensorPres.getNome() + "): " + String.format("%.2f", p) + " ATM ");
                        if (p > sensorPres.getLimiteMaximoSeguro() || p < sensorPres.getLimiteMinimoSeguro()) {
                            System.out.println("[CRÍTICO: Pressão fora dos limites!]");
                        } else {
                            System.out.println("[OK]");
                        }
                    }

                    // Lendo e validando Sensor de Radiação
                    double r = sensorRad.lerValor();
                    if (sensorRad.verificarFuncionamento()) {
                        System.out.print("-> " + sensorRad.retornarTipo() + " (" + sensorRad.getNome() + "): " + String.format("%.2f", r) + " µSv/h ");
                        if (r > sensorRad.getLimiteMaximoSeguro()) {
                            System.out.println("[CRÍTICO: Radiação Solar Elevada!]");
                        } else {
                            System.out.println("[OK]");
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n[ CONTROLE DE PROPULSÃO ]");
                    System.out.println("1. Acionar Motor Químico (Impulso Bruto)");
                    System.out.println("2. Acionar Motor Elétrico (Iônico - Eficiente)");
                    System.out.print("Escolha o motor: ");
                    int optMotor = scanner.nextInt();
                    
                    System.out.print("Digite a potência desejada (0 a 100%): ");
                    int pot = scanner.nextInt();

                    if (optMotor == 1) {
                        motorQuimico.acelerar(pot);
                    } else if (optMotor == 2) {
                        motorEletrico.acelerar(pot);
                    } else {
                        System.out.println("Motor inválido.");
                    }
                    break;

                case 4:
                    System.out.println("\n[ AUTO-DIAGNÓSTICO DOS COMPONENTES (POLIMORFISMO) ]");
                    // Chamando o mesmo método abstrato em objetos diferentes para mostrar o Polimorfismo
                    sensorTemp.realizarAutoDiagnostico();
                    System.out.println("------------------------------------");
                    sensorPres.realizarAutoDiagnostico();
                    System.out.println("------------------------------------");
                    sensorRad.realizarAutoDiagnostico();
                    System.out.println("------------------------------------");
                    motorQuimico.realizarAutoDiagnostico();
                    System.out.println("------------------------------------");
                    motorEletrico.realizarAutoDiagnostico();
                    break;

                case 5:
                    System.out.println("\n[ CONSULTA DE DADOS GERAIS DA MISSÃO ]");
                    System.out.println("Trajetória Atual: " + dadosMissao.getTrajetoria());
                    System.out.println("Tripulantes Abordo: " + dadosMissao.getNumeroTripulantes());
                    System.out.println("Combustível Restante: " + dadosMissao.getNivelCombustivel() + "%");
                    
                    System.out.println("\n[DADOS RESTRITOS]");
                    System.out.print("Insira a senha de segurança para ver as coordenadas: ");
                    String senha = scanner.next();
                    // Proteção por senha via encapsulamento
                    System.out.println("Resultado: " + dadosMissao.getCoordenadas(senha));
                    break;

                case 6:
                    System.out.print("\nDigite o novo nível de combustível (0 a 100%): ");
                    double novoCombustivel = scanner.nextDouble();
                    dadosMissao.setNivelCombustivel(novoCombustivel);
                    break;

                case 0:
                    System.out.println("\nShutting down... Conexão com a estação espacial encerrada. Boa viagem, astronauta!");
                    rodando = false;
                    break;

                default:
                    System.out.println("Opção inválida! Digite um número do menu.");
                    break;
            }
        }

        scanner.close();
    }
}
