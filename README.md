# Plataforma de Monitoramento de Sistemas Espaciais

Projeto desenvolvido para a **Global Solution** na disciplina de **Programação Orientada a Objetos (POO)**.

## Sobre o Projeto
O sistema simula uma plataforma de controle e telemetria para uma estação espacial, monitorando variáveis críticas de ambiente através de sensores, gerenciando sistemas de propulsão iônica/química e protegendo dados vitais da missão.

## Conceitos de POO Aplicados
* **Classe Abstrata:** Utilizada em `ComponenteEspacial` e `SistemaPropulsao` para reaproveitamento de código e moldagem de comportamentos comuns.
* **Interface:** Aplicada em `Sensor` para garantir o contrato de métodos obrigatórios (`lerValor`, `verificarFuncionamento`, `retornarTipo`).
* **Encapsulamento:** Implementado rigidamente em `DadosMissao`, validando níveis de combustível, disparando alertas automáticos e protegendo dados sensíveis (coordenadas) via senha de acesso.
* **Polimorfismo:** Evidenciado no método `realizarAutoDiagnostico()` e `calcularEmpuxo()`, onde classes filhas reagem de formas totalmente distintas para a mesma chamada de método.

## Integrantes do Grupo
* João Pedro da Silva Costa - RM: 565031
* Gabriel De Biasi Couto - RM: 563247

## Demonstração do Funcionamento
*Interface do Usuário*

<img width="600" alt="Captura de tela 2026-06-07 174434" src="https://github.com/user-attachments/assets/c4ae327e-152e-4003-a30a-725979c171e6" />

*Teste de Segurança*

<img width="600" alt="image" src="https://github.com/user-attachments/assets/c98a2cbe-0211-4184-9b33-b9948bf20fa8" />

*Ligando todos os sistemas e leitura dos sensores*

<img width="600" alt="image" src="https://github.com/user-attachments/assets/681e1eed-acee-406e-b9f2-03dae0c00b3a" />

<img width="600" alt="image" src="https://github.com/user-attachments/assets/78196752-4848-4a23-941b-9daaf390b893" />

*Auto-Diagnóstico*

<img width="600" alt="image" src="https://github.com/user-attachments/assets/2e9c1518-e7b7-466a-80e5-26918c965526" />

*Proteção de dados sensíveis*

<img width="600" alt="image" src="https://github.com/user-attachments/assets/3f269900-0814-490e-a2f3-aeb8d535627f" />

<img width="600" alt="image" src="https://github.com/user-attachments/assets/cd31d31f-3606-48ae-aa0b-28e8fbe60f38" />

*Alerta Automático de Combustível Baixo*

<img width="600" alt="image" src="https://github.com/user-attachments/assets/5de49138-f78e-461f-beba-0108823a04bc" />
