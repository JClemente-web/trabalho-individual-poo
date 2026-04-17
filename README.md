# 📚 Trabalho Individual — Programação Orientada a Objetos

**Aluno:** João Vitor Clemente Ferreira
**Professor:** Carlos Eduardo (Cadu)
**Instituição:** SENAI SerratecH
**Disciplina:** Programação Orientada a Objetos (POO)

---

## 📖 Sobre o Repositório

Este repositório foi criado para registrar e entregar as resoluções dos exercícios práticos da disciplina de Programação Orientada a Objetos. Cada exercício possui seus próprios commits, refletindo o progresso e a evolução individual ao longo das aulas.

---

## 📂 Estrutura do Repositório

src/
├── exercicio1/   → Simulador de Caixa Eletrônico
├── exercicio2/   → Classe ContaBancaria
├── exercicio3/   → Sistema de E-commerce
└── exercicio4/   → Sistema de Veículos

---

## 🏋️ Exercícios

### Exercício 1 — Lógica e Estruturas de Controle
**Simulador de Caixa Eletrônico**

Implementação de um menu interativo utilizando `do-while` e `switch-case`, simulando as operações básicas de um caixa eletrônico: ver saldo, depositar, sacar e sair.

**Regras de negócio:**
- Limite máximo de **3 saques diários** por conta
- Valor máximo de **R$ 1.000,00** por saque

---

### Exercício 2 — Classes e Objetos
**Classe ContaBancaria**

Refatoração do exercício anterior para uma arquitetura Orientada a Objetos, encapsulando os dados e comportamentos dentro da classe `ContaBancaria`, com atributos `numero`, `titular` e `saldo`, e os métodos `depositar()` e `sacar()`.

**Regras de negócio:**
- Todas as regras do Exercício 1 se aplicam
- Toda conta criada recebe automaticamente um **bônus de boas-vindas de R$ 50,00** garantido pelo construtor

---

### Exercício 3 — Relacionamentos e Encapsulamento
**Sistema de E-commerce**

Modelagem de um sistema de pedidos com relacionamento entre as classes `Cliente`, `Pedido` e `ItemPedido`, aplicando os conceitos de encapsulamento e composição de objetos.

**Regras de negócio:**
- Método `fecharPedido()` calcula o frete automaticamente:
  - Pedidos acima de **R$ 250,00** → frete **grátis**
  - Pedidos abaixo de **R$ 250,00** → taxa fixa de **R$ 25,00**
- Emissão de recibo detalhado ao fechar o pedido

---

### Exercício 4 — Um Cadinho de Tudo
**Sistema de Veículos**

Implementação completa envolvendo interfaces, classes abstratas, herança e tratamento de exceções, modelando um sistema de locação e tributação de veículos.

**Estrutura:**
- Interface `Fretavel` → método `alugarVeiculo(pesoCarga, dias)`
- Interface `Tributavel` → método `calcularIpva()`
- Classe abstrata `Veiculo` → implementa ambas as interfaces
- Classe filha `Caminhao`
- Classe filha `CarroPasseio`

**Regras de negócio:**
- Sobrecarga acima da capacidade do caminhão aplica **acréscimo de 10%** sobre o valor total das diárias
- Veículos com **mais de 20 anos** de fabricação são **isentos de IPVA**
- `CarroPasseio` paga **4%** do valor FIPE de IPVA
- `Caminhao` paga **1,5%** do valor FIPE de IPVA
- Exceções tratadas nos construtores e métodos para parâmetros inválidos

---

## ✅ Checklist de Entrega

- [x] Repositório configurado como **Público**
- [x] README com nome completo do aluno
- [x] Histórico de commits refletindo o progresso por exercício
