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

<img width="600" alt="Captura de tela 2026-06-07 174434" src="https://github.com/user-attachments/assets/bd2b5217-8027-4a9b-bb3e-f31673c5e161" />

*Teste de Segurança*

<img width="600" alt="Captura de tela 2026-06-07 174722" src="https://github.com/user-attachments/assets/ec34982b-bf27-409b-9a35-1d8f2188b3c2" />

*Ligando todos os sistemas e leitura dos sensores*

<img width="600" alt="Captura de tela 2026-06-07 174917" src="https://github.com/user-attachments/assets/ad302a05-ebd7-4b2b-837d-619c61065ea4" />

<img width="600" alt="Captura de tela 2026-06-07 175053" src="https://github.com/user-attachments/assets/19869770-9922-46bb-b515-f233dc5d28b7" />

*Auto-Diagnóstico*

<img width="600" alt="Captura de tela 2026-06-07 175454" src="https://github.com/user-attachments/assets/1df86313-d56b-4cbc-8bfd-03b0ca31cf7c" />

*Proteção de dados sensíveis*

<img width="600" alt="Captura de tela 2026-06-07 175605" src="https://github.com/user-attachments/assets/b6cd0a0c-669c-448d-aea7-12f3d98a1f06" />

<img width="600" alt="Captura de tela 2026-06-07 175734" src="https://github.com/user-attachments/assets/b1667097-5392-4008-8589-a2e661349278" />

*Alerta Automático de Combustível Baixo*

<img width="600" alt="Captura de tela 2026-06-07 175909" src="https://github.com/user-attachments/assets/e7db61ae-a895-4c23-b7d4-d5e18951a7d1" />
