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



# Lógica Condicional e Controle de Fluxos em Java

# Operadores relacionais
São símbolos usados para comparar determinados operandos e retornar um resultado.

*Tipos:*
Similaridade: igual (==), diferente (!=);
Tamanho: maior, menor, igual, maior ou igual, menor ou igual
Sempre haverão 2 operandos


# Operadores lógicos
São símbolos usados para comparar operandos lógicos ou expressões e retornar um resultado (não é possível comparar números, por ex)

*Tipos:*
Conjunção: é verdadeira quando ambos os operadores são verdadeiros (&&, and, e);
Disjunção: é falsa quando ambos são falsos (||, or, ou);
Disjunção exclusiva: é verdade quando ambos são opostos (^, xor)
Negação: inverte o valor lógico (!, inversão: se é falso, fica verdadeiro, se é verdadeiro, fica falso).

*Curiosidades:*
Operadores bitwise: & e | - não são operadores lógicos
Operadores shift: ~, >>, >>>, <<

*Boas práticas*
Criar variáveis auxiliares para guardar resultados intermediários


# Controle de fluxo
São estruturas que tem capacidade de direcionar o fluxo da execução do código

*Tipos:*
Decisão: if, if-else, if-else-if (esses 3 usam comparações entre booleanos), switch (compara valores exatos ou casos com variáveis - mais comuns: int, string e enum. Usar "default" ao final) e operador ternário ("condição ? true : false;" PORÉM, é para EVITAR usar operador ternário);
Repetição: for, while, do while;
Interrupção: break, continue, return.

*Boas práticas*
Evitar usar default do switch para cases genéricos
Evitar efeito flecha usando if (ir aninhando para o lado, de forma que saia da visualização da tela)


## Blocos
É um grupo de 0 ou mais códigos que trabalham em conjunto para executar uma operação

*Tipos:*
Locais: dentro de métodos (ex.: main);
Estáticos: dentro de classes;
Instância: dentro de classes.

*Ex.*
Locais {
...
}

if (autorizado) {
Carregar perfil
DirecionarPaginaPrincipal
}

if (menorIdade)
DirecionarPessoa

_se só houver uma linha de código, não precisa de {}_



# Estruturas de repetição e arrays em java

# E.R.: cada repetição é chamada de laço (loop): permite que uma sequência de comandos seja executada enquanto as condições forem satisfeitas;
*While*: repetição com teste no início - se usa quando precisa ser uma condição válida para iniciar a repetição;
*Do-while*: Repetição com teste no final, usa quando precisa executar pelo menos uma vez e depois verificar - usa pouco;
*For*: Repetição contada - usa quando precisar de contador;
*Break*: termina de forma abrupta uma repetição;
*Continue*: os comandos após o continue não são executados. Só pode ser usado dentro de uma estrutura de repetição - Existe, mas não é utilizado.

*Operadores de incremento e decremento*: ++num e --num _pré-fixados_
num++ e num-- _pós-fixados_

*Operações aritméticas*: numero += k é o mesmo que numero = numero + k

*Arrays*: é um objeto utilizado para armazenar sequencialmente dados do mesmo tipo.
Precisamos definir um *tamanho máximo* para o array (em java). Por ex., dizer que o tamanho é 10 e colocar 5 elementos, só não pode colocar que é 10 e ter 11 elementos;
Pode ser unidimencional ou multidimencional. Ex.: c[0]: array c, índice 0; ou a [0][1]: array a, índice da linha 0, índice da coluna 1.


# Programação Orientada a Objetos
É um paradigma de análise, projeto e programação de sistemas de softwares baseado na composição e interação entre diversas unidades de software chamadas de objetos.

## PE vs POO
*Paradigma Estruturado:* limitado, foca em "como fazer";
*Paradigma Orientado a Objetos:* mais complexa, maior nível de abstração, em foca em "o que fazer"; Melhor coesão (ideias trabalhando em conjunto, com unidades de códigos com responsabilidades únicas); melhor acoplamento; diminui o Gap semântico; coletos de lixo (vai liberando a memória conforme a informação nao for usada).

## Fundamentos
*Abstração:* pensar nas características essenciais e comuns de certos grupos que podem ser reutilizadas; características acidentais são add depois;
*Reuso:* novas unidades de código a partir de outras já existentes;
*Encapsulamento:* esconder complexidades e proteger dados.

## Estruturas:

*Classe:* são entidades do mundo real, concretos ou abstratos (bola, carro, venda,...) que têm nomes significativos de acordo com o contexto; é a unidade mínima e básica do POO que possui características similares, define o comportamento dos objetos através de métodos e os possíveis estados desses objetos através dos atributos. Vai ter vários objetos; _sempre se usa a delimitação de escopo {}_
Ex: class Carro {
...}

*Atributos:* elemento que define a estrutura de dados. Faz parte dos objetos da classe;
Ex: Carro: cor, marca.
_variável_: pode variar, tem um ciclo de vida mais curto. usa durante a operação dentro do código; para representar o conceito se usa o atributo.

*Método:* é uma porção de código (sub-rotina) que identifica as ações e serviços que a classe oferece.
Ex.: Carro: ligar, correr. Para criar, se usa visibilidade, retorno, nome e parâmetros (se precisar).
class Carro {
void frear ( ) {
...
  }
}
_Métodos especiais_:
Construtor: cria objetos a partir das classes, tem obrigatóriamente o mesmo nome da classe. Pode ser também para passar parâmetros para os atributos. Nas BP fica embaixo dos atributos;
Destrutor: auxilia a destruição dos objetos, por ex. no coletor de lixo, ele chama os destrutores para liberar o espaço na memória. Usa quando o sistema for usar portas seriais no computador ou precisar liberar algum outro recurso
class Carro {
void finelize () {
  }
}
Sobrecarga: 
mudar a assinatura (nome+ prâmetros) conforme a necessidade.
Ex.:
m1 ()
m1 (int i)
m1 (float f)
m1 (String s, long l)
Usa por exemplo numa compra usar um "calcularTotal", depois se a compra tiver desconto ou se for parcelada usar o mesmo método.

*Objeto:* é a representação de um conceito/entidade do mundo real (físico ou não);
Como criar:
Carro carro = new Carro () ;
Tipo - objeto - construtor ^

*Mensagem:* solicitação para ativar um método;
Carro carro = new Carro ();
carro.<método>; - _objeto_
Carro.<método>; - _classe_


## Relações

# Herança
Uma subclasse (classe filha, classe derivada) que é uma extensão de uma superclasse (classe pai, mãe ou base); cria subtipos mais especializados dos que os já existentes; "membros" são os atributos e métodos;
Como criar:
class A extends B {
...
}
Ou seja, A é mais específica do que B, é um subtipo de B, herda B.

*Tipos:*
Simples: 1 classe filha tem 1 classe mãe
Múltipla: 1 classe filha tem 2 ou mais classes mãe -> *Não existe herança múltipla em java*
Upcast e Downcast: Up é quando uma classe filha vira classe mãe; Down é quando a classe mãe vira filha.
Upcast: A a = new B();
Downcast: B a = (B) new A ();

*Polimorfismo:*
A mesma ação, se comportando diferente. Geralmente se usa com herança.
Por ex.: pagamento pode ser com débito, crético, boleto, pix

*Sobrescrita:*
A mesma ação, podendo se comportar diferente.
Por ex.: uma conta que pode ser corrente, poupança, especial ou universitária que apresente um saldo. O saldo pode ou não ser o mesmo (poupança pode render, cheque especial pode cobrar coisas a mais);

# Associação
Possibilita um relacionamento entre classes/objetos OU ATRIBUTOS E MÉTODOS? VER! entre si (um usa o outro). Para saber usar: um USA o outro, mas não são a mesma coisa.

*Tipos:*
Estrutural: composição ou agregação (relacionado aos atributos);
Comportamental: dependência (relacionado aos métodos).

*Estrutural*

Composição: a "parte" só existe com o "todo". Por exemplo, uma pessoa tem um endereço. Se a pessoa sair do código, o endereço também sai.
class Pessoa {
	Endereço endereço
}

Agregação/Estrutural: não existe um vínculo tão forte. Ex.: Disciplina e aluno. Se não houver a disciplina ou o aluno, pode haver outra disciplina ou outro aluno
class Disciplina {
	Aluno aluno
}

*Comportamental*
O método depende do objeto.
class Compra {
...
finalizar (Cupom cupom, ...) {
...
}
}



#Interface
Necessário para determinado sistema funcionar.
interface A {
...
}
class B implements A {
...
}


# Pacotes
Organização física ou lógica que separa classes com responsabilidades distintas.
package ... ;
import ... ; -> para uma exergar uma classe que esteja em outro pacote


# Visibilidade ou Modificador de acesso
Determina até que ponto a classe, atributo ou método pode ser usado.

## Tipos
*Private:* só se enxerga dentro da classe
private

private int i;
private void do ();


*Protected:* enxerga dentro da classe, mesmo pacote e subclasses
protected

protected int i;
protected void do ();

*Public:* tudo é visível em qualquer lugar da aplicação
public

public int i;
public void do ();


# Pilares da Orientação a Objetos em Java

##Abstração:
Focar nos aspectos essenciais e ignorar características menos importantes ou acidentais.

##Encapsulamento:
Esconder a implementação dos objetos para criar interfaces de uso mais concisas e fáceis de usar/entender.

##Herança:
Uma classe filha que herda ou modifica o comportamento de uma classe pai.

##Polimorfismo:
Capacidade de um objeto ser referenciado de várias formas (de acordo com o contexto). Ex.: conta, conta corrente e conta poupança.


#Collections
É um objeto que agrupa múltiplos elementos (variáveis primitivas ou objetos) dentro de uma única unidade;
Armazena e processa coleções de dados de forma eficiente;

## Estrutura:
*Interface*
*Implementações ou classe*
*Algoritmos*

## Interface list
java.util.List (essa é a chamada da interface)
Características: garante a ordem de inserção dos elementos, mesmo que sejam duplicados

*ArrayList*: deve ser usado quando mais operações de pesquisa são necessárias;
*LinkedList*: deve ser usado onde mais operações de inserção e exclusão são necessárias.

*Ex.:*
Adicionar: nomedacollection.add(posição, valor)
Substituir: nomedacolletion.set(posição, valor)
Ver se existe na lista: nomedacollection.contains(valor)
Passar a posição e receber elemento: nomedacolletion.get(posição)
Exibir menor valor: Collections.min(nomedacollection)
Exibir maior valor: Collections.max(nomedacollection)
Exibir soma: precisa fazer uma iteração;
Remover uma nota: nomedacollection.remove(0d) => vai remover o valor double
Remover uma posição: nomedacollection.remove(0) => vai remover a posição 0
Apagar toda a lista: nomedacollection.clear();
Retornar se a lista está vazia: nomedacollection.isEmpty();
Para ordenar: usar o método Comparable








