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
*(Será adicionado posteriormente.)*
