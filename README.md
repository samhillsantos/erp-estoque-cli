# ERP Estoque CLI

Aplicação CLI em Java desenvolvida como projeto de estudo (PoC) para consolidar conceitos de Programação Orientada a Objetos (POO) e Arquitetura de sistemas.

## Estrutura de Diretórios e Arquivos

O projeto está organizado em pacotes modulares para separar responsabilidades:

```text
src/
├── Main.java              # Ponto de entrada da aplicação
├── menu/
│   └── Menu.java          # Controladores de navegação e fluxos de telas (do-while / switch)
├── function/
│   ├── GalpoesFunction.java # Regras de negócio e persistência em memória (ArrayList) de galpões
│   └── ProdutosFunction.java# (Em desenvolvimento) Regras de negócio para produtos
├── objects/
│   ├── Galpoes.java       # Modelagem da entidade Galpão (Getters/Setters e atributos privados)
│   └── Produtos.java      # Modelagem da entidade Produto (Em desenvolvimento)
└── input/
    └── Input.java         # Utilitário centralizado de leitura de teclado e tratamento de buffer
```

## Como Executar

Certifique-se de ter o JDK (Java Development Kit) instalado em sua máquina.

Compile todas as classes a partir da raiz do código-fonte:
```bash
javac Main.java menu/*.java function/*.java objects/*.java input/*.java
```
Execute a aplicação:
```bash
java Main
```