Trabalho Individual - Programação Orientada a Objetos
Aluno: João Vitor Clemente Ferreira
📋 Sobre o Projeto
Repositório dedicado à resolução dos exercícios práticos da disciplina de Programação Orientada a Objetos (POO). Os exercícios foram desenvolvidos individualmente, com commits progressivos refletindo a evolução do desenvolvimento ao longo do curso.
🛠️ Tecnologias Utilizadas
Java
IntelliJ IDEA
Git / GitHub
📁 Estrutura do Repositório
Código
📝 Exercícios
✅ Exercício 1 - Simulador de Caixa Eletrônico
Tema: Lógica e Estruturas de Controle
Descrição:
Implementação de um simulador de caixa eletrônico utilizando estruturas de controle do-while e switch. O programa apresenta um menu interativo com as opções de Ver Saldo, Depositar, Sacar e Sair.
Regras de Negócio implementadas:
Limite máximo de 3 saques diários — ao atingir o limite, a operação é bloqueada com mensagem informativa
Valor máximo de R$ 1.000,00 por saque — valores acima são recusados automaticamente
Validação de saldo insuficiente — impede saques maiores que o saldo disponível
Validação de valores negativos tanto para depósito quanto para saque
✅ Exercício 2 - Classe ContaBancaria
Tema: Classes e Objetos
Descrição:
Migração da lógica do Exercício 1 para uma estrutura Orientada a Objetos. Criação da classe ContaBancaria com atributos numero, titular e saldo, e métodos depositar() e sacar().
Regras de Negócio implementadas:
Todas as regras do Exercício 1 mantidas
Bônus de boas-vindas de R$ 50,00 aplicado automaticamente no construtor ao criar uma nova conta
✅ Exercício 3 - E-commerce
Tema: Relacionamentos e Encapsulamento
Descrição:
Modelagem de um sistema de e-commerce com relacionamento entre as classes Cliente, Pedido e ItemPedido. Um pedido pertence a um cliente e contém uma lista de itens.
Regras de Negócio implementadas:
Método fecharPedido() que calcula o valor total dos itens
Frete grátis para pedidos acima de R$ 250,00
Taxa fixa de R$ 25,00 de frete para pedidos abaixo desse valor
Impressão de recibo detalhado ao fechar o pedido
✅ Exercício 4 - Sistema de Veículos
Tema: Herança, Interfaces, Abstração e Exceções
Descrição:
Modelagem de um sistema de veículos utilizando interfaces, classe abstrata e herança. Implementação das interfaces Fretavel e Tributavel, da classe abstrata Veiculo e das classes filhas Caminhao e CarroPasseio.
Regras de Negócio implementadas:
Cálculo de locação com acréscimo de 10% quando o peso da carga ultrapassa a capacidade do caminhão
Isenção de IPVA para veículos com mais de 20 anos de fabricação
CarroPasseio paga 4% do valor FIPE de IPVA
Caminhao paga 1,5% do valor FIPE de IPVA
Tratamento de exceções nos construtores e métodos para parâmetros inválidos
✅ Status Geral
#
Exercício
Status
1
Simulador de Caixa Eletrônico
✅ Concluído
2
Classes e Objetos - ContaBancaria
✅ Concluído
3
Relacionamentos e Encapsulamento - E-commerce
✅ Concluído
4
Sistema de Veículos
✅ Concluído
