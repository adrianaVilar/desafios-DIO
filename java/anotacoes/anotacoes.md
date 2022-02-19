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



# Variáveis, Tipo de dados e Operadores Matemáticos em Java

## Variável:
Um espaço na memória que armazena valores

*Tipos:*
Instância: objeto;
Classe: classe;
Local: dentro de métodos;
Parâmetro: na assinatura do método.

Padrão de definição:
<?visibilidade?><?modificador?> tipo nome <?=valorInicial?>;

V: public, protected ou private;
M: static ou final (quando usar o final, o valor vai ser aquele sempre. se desejar mudar, vai ter erro de compilação);
T: tipo de dado (obrigatório!);
N: nome da variável (obrigatório!);
VI: valor inicial.

- Não pode começar com números;
- Evitar usar "$" e "_";
- É case-sensitive (diferencia maiúsculo e minúsculo);
- Não pode usar espaço no nome da variável;
- Não pode usar as palavras reservadas.

*Boas práticas*
- Sempre iniciar com letra minúscula;
- Nomes expressivos em notação camelo;
- Qdo a variável for final (constante), usar tudo maiúsculo e separado por "_".


## Tipo de dados
São valores e operações que as variáveis podem assumir e sofrer

*Tipos*
Estática(forte: java é fortemente tipada) ou dinâmica (fraca);
Compilada ou interpretada (java é as duas);
Primitivo (números, texto...) ou composto (ligado a orientação objeto).

*Opções de tipos*
Textual, numeral, lógico ou objeto.

*Exemplos de numeral*
byte: -128 até 127 -> byte b=15;
short: -32.768 até 32.767 -> short s=-15785;
int: -2.147.483 até 2.147.483.647 -> int i = 8515785; (inteiro de 32 bits)
long: -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807 -> long l=5938515785L; (inteiro de 64 bits)
float: +- 3.40282347E+38F -> float f=3.14...(f); (reais de 32 bits)
double: +- 1.79769313486231570E+308 -> double d=3.14...(d); (reais de 64 bits)

*Exemplos textuais*
char: usa aspas simples, pq é caracter isolado. é pouco usado
String: não é primitivo! é um objeto, mas usa como primitivo

*Exemplos lógicos*
true or false

*Valores default*
os valores possuem valores default para evitar que se acesse alguma "sujeira" da memória erroneamente


## Operadores aritméticos
São símbolos capazes de realizar ações específicas e retornar um resultado

*Tipos*
pós-fixado: exp++ ou exp--;
prefixado: ++exp ou --exp;
aritmético: +, -, *, /, % (resto da divisão);
atribuição: =, +=, -=, *=, /= e %=.

*Precedências ou "Preferência"  na execução*
pós-fixado
prefixado
aritmético: *, /, %
aritmético: +, -
atribuição


## Conversões (casting)
Transformar uma variável de um tipo mais ou menos específico para outro menos ou mais específico

*Tipos*
Upcast (implícito ou pra cima ou promoção): a variável sai de um "espaço" menor para um maior, então não corre o risco de perder dados;
Downcast(explícito ou de menor capacidade, pode ser que perca dados).
_pode ser feito em tipos primitivos ou compostos_
Exemplo:
Long l; tranformar em int i=10 em long l=i; - não perde nada
int i; long l=100; i=(int) l; - pode ser que perca, pq sai do long para o int, então precisa identificar qual vai ser a transformação

_truncar_: termo para quando temos um float (real) e convertemos para um int (inteiro) e o número é arredondado.


# Métodos Java
É uma porção do código (sub-rotina) que é disponibilizada por uma classe (sempre é criado dentro de uma classe, se usa a palavra "static" na método para chamar ele do main depois) e é executado quando é feita uma requisição para ele. São responsáveis por definir e realizar um determinado comportamento.

## Criação
<?visibilidade?> <?tipo?> <?modificador?> retorno nome (<?parâmetros?>) <?exceções?> corpo
*Ex.*:
V: public, protectes ou private;
T: concreto ou abstrato;
M: static ou final;
R: tipo de dados ou void (vazio, ou seja, só executa, mas não retorna nada);
N: nome que é fornecido ao método;
P: parâmetros que pode receber;
E: exceções que pode lançar;
C: código que possui ou vazio, fica dentro de {} ou termina só com o ; quando for vazio.
*T, M e E não são tão usados

## Utilização
Se uma mensagem através de uma classe ou objeto:
nome_da_classe/objeto.nome_do_metodo() -> sem parâmetros
nome_da_classe/objeto.nome_do_metodo(...) -> com parâmetros

*Ex.*
Math.random()
Math.sqrt(4) -> raiz quadrada

_Classe Começa Com Maiúscula_
_objeto começa com minúscula_

## Particularidades

*Assinatura:* É a forma de identificar o método. => nome+parâmetros
*Construtor e destrutor:* usados na orientação a objetos
*Mensagem:* para solicitar que o método seja executado
*Passagem e parâmetros:* por valor/cópia ou por referência/endereço (OO)

## Boas práticas
Nomes: descritivos e curtos;
Notação: camel case;
Deve possuir entre 80 e 120 linhas - pode ser que se precise usar métodos auxiliares dentro dos métodos principais para diminuir o número de linhas;
Evite lista de parâmetros longas;
Visibilidades adequadas.


# Sobrecarga de métodos
É a capacidade de definir métodos para diferentes contextos, mas preservando seu nome: mesmo método, funcionando de formas diferentes conforme o contexto (mudam os parâmetros ou assinatura (nome+parâmetros))
*Ex.*: converterParaInteiro ou então pegar um objeto e retornar a string dele
*Sobrecarga x Sobrescrita*: são coisas diferentes! Sobrescrita tem a ver com herança


# Retornos
É uma instrução de interrupção; Simbologia: return
O método executa o retorno quando completa todas as instruções internas, chega numa declaração explícita de retorno ou lança uma exceção (erro);

É definido na criação e pode ser primitivo ou objeto;

Deve ser compatível com o método;

Se o método for "void", pode ou não ter retorno, mas se tiver, vai ser vazio (só termina com ;, por exemplo).




