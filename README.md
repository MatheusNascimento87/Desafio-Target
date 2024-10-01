# Desafio Target 🎯 - Entrevista Técnica 
Este repositório contém soluções para cinco questões técnicas apresentadas pela Target Sistemas como parte de um processo seletivo. As questões abrangem tópicos como manipulação de laços, cálculo de sequências, operações em vetores e strings, além de análise de faturamento.

## Questões
### 1. Calculo de soma com laço
### o que foi solicitado:
Calcular a soma dos números de 1 até um valor definido como ÍNDICE usando um laço `while`.
###  como funciona:
- Itera sobre os valores de 1 até o `Indice`
- Acumula os valores na variável `Soma` até que o valor final seja 91
#### Execução: 
- No final o valor da variável `soma` é 91
#### Localização: `Target estagio/src/entrevistaTecnica/VariavelSoma`
---
### 2. Verificação de sequência de Fibonacci

### o que foi solicitado:
Dado um número informado, calcular a sequência de Fibonacci e verificar se o número pertence à sequência.

### Como funciona:
 O código tem 2 funções estáticas, uma recursiva que gera a sequência de fibonacci, e outra que irá checar se o número dado como input pertence a sequência. Logo abaixo temos o método `Main` que irá executar o programa, nele contém um bloco de `loop while` para repetir o problema caso o usuário digite algo errado e um bloco de `Try-Catch` para capturar erros de input e os tratar corretamente.

 #### Execução:
 - Entrada 1: 1597
 - Saída: 1597 Pertence a sequência de Fibonacci
 - Entrada 2: 1597.77
 - Saída: Valor inválido, a sequência de Fibonacci só aceita números inteiros, tente novamente 

 #### Localização: `Target estagio/src/entrevistaTecnica/Fibonacci`

 ---

### 3. Análise de Faturamento Diário

### o que foi solicitado: 
utilizando dados reais que a empresa disponibilizou em um drive, foi solicitado:
- O menor e o maior valor de faturamento ocorrido no mês ;
- O número de dias com faturamento superior a média mensal ;
- dias com faturamento 0 equivalem a feriados então não podem ser contabilizados na operação de média ;

### Como funciona:
O código recebe todos os dados fornecidos no drive pela empresa e aloca os faturamentos por dia em um vetor double de `faturamento`. Logo em seguida é efetuada uma iteração do vetor para fazer o `somatórioTotal`, dentro do mesmo loop ele abre uma condição para retirar os dias com faturamento 0 da conta e em seguida calcula o `menorFaturamento` e o `maiorFaturamento`. Depois temos um `loop for-each` para calcular a quantidade de dias que tem o faturamento acima da média. E no final é exibido de forma formatada em 2 casas decimais o `menorFaturamento`, `maiorFaturamento` e de forma inteira os `diasAcimaDaMedia`.

#### Execução:
- Menor valor de faturamento: 3071,33
- Maior valor de faturamento: 48.275,30
- Número de dias no mês em que o valor de faturamento diário foi superior à     média mensal: 14

#### Localização: `Target estagio/src/entrevistaTecnica/FaturamentoDiario`

---

### 4. Distribuição de Faturamento por Estado
### O que foi solicitado:
Calcular o percentual de participação de cada estado no faturamento mensal total da distribuidora.

### Como funciona:
 O programa recebe os valores de faturamento para cada estado, temos uma função que irá retornar o valor da porcentagem de participação de cada filial no total de faturamento, com isso podemos imprimir tanto o `total` de faturamento da empresa como as porcentagens de cada uma das filiais de cada estado.

 #### Execução:
 - Valor total mensal da distribuidora: 180.759,98 Reais 
 -  O percentual de representação de São paulo é de: 37,53% 
 -  O percentual de representação do Rio de janeiro é de: 20,29% 
 -  O percentual de representação de Minas gerais é de: 16,17% 
 -  O percentual de representação do Espirito santo é de: 15,03% 
 - O percentual de representação de outros estados é de: 10,98% 

 #### Localização: `Target estagio/src/entrevistaTecnica/FaturamentoMensalEmpresa`

 ---

### 5. Reversão de String
### O que foi solicitado:
Escrever um programa que inverte os caracteres de uma string sem utilizar funções prontas, como reverse.

### Como funciona:
O Scanner recebe um `input`, este input é transformado em um vetor de carácteres, depois é criado um for loop iterando de trás para frente e adicionando cada caracter da palavra, assim no final tendo o resultado da String solicitada porém ao contrário.

#### Execução: 
- Entrada: Hello World!
- Saída: !dlroW olleH

#### Localização: `Target estagio/src/entrevistaTecnica/InverterString`

---
## ⚙ Como usar
```bash
 # Clone o projeto
  - Faça um Fork do projeto
        ou
  $ git clone https://github.com/MatheusNascimento87/Desafio-Target.git
```
- Compile e execute o projeto

- Compile o projeto Java e execute as classes de cada programa 

## Requisitos:
- Versão do Java 8+
- JDK instalada
- Uma IDE ao seu gosto. NetBeans, Eclipse, VS Code, IntelliJ IDEA

## Contato
## 📱 [Linkedin](https://www.linkedin.com/in/matheus-pereira-do-nascimento/)


