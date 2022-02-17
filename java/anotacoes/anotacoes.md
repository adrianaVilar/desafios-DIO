# Aula 01

para compilar o arquivo da IDE, se usa o gitBash ou cmd, por exemplo:
javac -d target/ -sourcepath src/ src/com/dio/MyFirstProject.java
_dessa forma vai ser criada a pasta "target" (o arquivo.java vai ser criado uma copia .class na pasta target)_
ou entra na pasta do arquivo a ser compilado e usa:
javac MyFirstProject.java
_dessa forma vai ser criado o MyFirstProject.class
para executar o programa da IDE, continua no git bash. por exemplo:
retorna para o diretorio raiz, e usa: java com.dio.MyFirstProject
ou executa esse codigo na IDE mesmo

# Aula 02

## Declaração de classes

package com.dio.base; _definição do pacote em que a classe se encontra_

import java.math.BigDecimal; _importação de uma classe de um pacote_

public _modificador de acesso_ class _palavra reservada_ Order _nome da classe, com a primeira letra em maiúsculo, representando um objeto do mundo real_ {

*definição dos atributos:*

// atributos
private _modificador de acesso_ final _palavra reservada_ String _tipo do atributo ou variável_ code _nome do atributo ou da variável_;
private final BigDecimal _atributo para representar o código do pedido_ totalValue _atributo para representar o valor total_;

// metodos
public _modificador de acesso_ BigDecimal _tipo de retorno_ calculaFee() _nome do metodo representando o que ele faz_ {
}

}


## Modificadores de acesso

public
protected
private
Sem modificador (apenas as classes definidas no pacote podem ter acesso)


## Métodos
construtores
comum


## Estrutura de condição
if - else
switch - case ("switch" para iniciar, "case" para cada caso e "default" para caso não seja nenhum dos casos listados)


## Estrutura de repetição
while
do - while
for
enhanced for


# Aula 03

## Comentarios
em linha: //
em bloco:
/**
*
*
*/

## Javadoc
ferramenta para documentação em HTML

## Tags javadoc
@author
@deprecated
@link
@param
@return
@see
@since
@throws
@version


# Teoria:

## JDK (Java Development Kit) - compila o código-fonte (.java)
## JVM (Java Virtual Machine) - executa o bytecode (.class)
## JRE (Java Runtime Environment) - ambiente de execução que permite que o JDK compile o código e a JVM execute.


## Versões do Java

OpenJDK: gratuita (existem outras, mas essa é muito usada)
JDK Oracle: requer licença da Oracle
LTS: java de longo suporte (as intermediárias são beta)


## IDE

"Ambiente de desenvolvimento integrado": é o "editor de texto" do código
A JDK faz parte do funcionamento das IDE's


## Eclipse

*Atalhos*
F2: renomear arquivos/pastas;
Ctrl + N: novo;
Ctrl + ou -: aumentar ou diminuir a fonte, respectivamente;
Ctrl + espaço: mostra as opções de completar;
Ctrl + 3: lupa;
Ctrl + D: apaga a linha;
Alt + setas: altera a linha ou bloco de lugar (pra cima ou pra baixo);
Ctrl + Shift + S: arruma formatacao;
Ctrl + Shift + O: importa as classes criadas.


## Inteliij

*Atalhos*
Alt + Insert: criar novo (se clicado quando o seletor do mouse estiver em cima de uma pasta);
Ctrl + Shift + F10: para rodar o código no terminal da IDE pela primeira vez;
Shift + F10: para rodar depois da primeira vez;
Ctrl + Shift + /: comenta o bloco que está selecionado;
Ctrl + Alt + O: limpa os "imports" que não estão sendo utilizados no código;
Ctrl + Y: deletar linha;
Ctrl + Z: desfazer;
Shift + F6: refatorar o nome da classe/renomear pasta;
Ctrl + Alt + L: organizar o código (espaçamentos);
Ctrl + D: duplica a linha;
Ctrl + Shift + seta: muda a linha pra cima ou pra baixo;
Ctrl + K: segundo commit por dentro da IDE;
Ctrl + Alt + V: escreve na linha qual é o tipo de variável;
F8: Step over (pular os passos);
F7: Step into (forçar);
Shift + F8: Voltar;
Alt + F9: run to cursor;
Ctrl + F4: fecha abas;
Ctrl + N: encontrar classes;
Ctrl + B: entra na classe que o mouse está em cima;

