# java01-logica

Primeiro, vamos quebrar o gelo com o IntelliJ.

### Exercício 01: Importar o projeto no IntelliJ

- Abrir a classe `App`
- Executar o comando `ctrl + shift + F10`

O projeto será executado e então a seguinte mensagem deve ser mostrada na saída do console do IntelliJ:

```

******************************
QUERO CAFEEEEEEEEEE
******************************

```

## Exercitando lógica de programação

Nesta parte, escreveremos código. Se quiser, vocês podem se apoiar nos testes que criamos para validar que suas soluções resolvem os exercícios corretamente. Para rodar os testes, execute o comando:

```
./gradlew test

```

### Exercício 02: Calculadora

Escreva a implementação dos métodos `soma, divide, multiplica e subtrai` da classe Calculadora. 

Tais métodos recebem dois números inteiros e devem retornar o resultado de cada operação aritmética:

```java

int soma = Calculadora.soma(1, 1); // soma == 2
int subtracao = Calculadora.subtrai(1, 1); // subtracao == 0
int multiplicacao = Calculadora.multiplica(2, 2) // multiplicacao == 4
int divisao = Calculadora.divide(2, 2) // divisao == 1

```

Utilize a classe `TesteCalculadora` para fazer os testes que você(s) achar(em) que são importantes para garantir a 
correta implementação da solução.


### Exercício 03: FizzBuzz

A classe `FizzBuzz` possui o método estático `calculaFizzBuzz`. Vocês devem implementar esse método para que o mesmo 
possa calcular corretamente o valor FizzBuzz de um número. O cálculo deve ser o seguinte:

- Se o número for divisível somente por `3`, o método retorna `Fizz`
- Se o número for divisível somente por `5`, o método retorna `Buzz`
- Se o número for divisível por ambos `3` e `5`, o método retorna `FizzBuzz`
- Se o número não for divisível por nenhum dos dois, o método retorna o próprio número em formato de String

__Dicas:__

Utilize o operador `%` para saber se um número é divisível por outro. Para saber se um número é divisível por 2, por 
exemplo, podemos usar o seguinte:

```java
int numero = 4;

if (numero % 2 == 0) {
    System.out.println("O numero eh divisivel por 2");
} else {
    System.out.println("O numero nao eh divisivel por 2");
}
```

Para converter um número inteiro para String, pode-se utilizar os métodos `Integer.toString()`, 
`String.valueOf` ou ainda `Objects.toString`:

```java
String numero = Integer.parseInt(2); // numero == "2"

// ou

String outroNumero = String.valueOf(4); // outroNumero == "4"

// ou

String maisUmNumero = Objects.toString(5); // maisUmNumero == "5"

```

Utilize a classe `TesteFizzBuzz` para fazer os testes que você(s) achar(em) que são importantes para garantir a 
correta implementação da solução.


### Exercício 04: Validador de Cartão de Créditos

Dado um número, determine se é válido ou não pela fórmula de Luhn.

O algoritmo Luhn é uma fórmula de soma de verificação simples usada para validar uma variedade de números de identificação, como números de cartão de crédito e números de seguro social canadense.

A tarefa é verificar se uma determinada string é válida.

Strings de comprimento 1 ou menos não são válidas. Espaços são permitidos na entrada, mas devem ser removidos antes da verificação. Todos os outros caracteres não dígitos não são permitidos.

__Exemplo 1: Número de cartão válido__

```
4539 1488 0343 6467
```

O primeiro passo do algoritmo Luhn é dobrar a cada segundo dígito, começando pela direita. No exemplo acima, 
dobraremos os seguintes números:

```

4539 1488 0343 6467
4_3_ 1_8_ 0_4_ 6_6_
```

Se o número dobrado resulta em um número maior que 9, subtraia 9 do resultado. 

Aplicando a lógica de dobrar no exemplo acima, teremos o seguinte resultado:

```
8569 2478 0383 3437
```

Depois de dobrar os valores, some todos os digitos:

```
8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80
```

Se o resultado da soma é divisível por `10`, então o número do cartão é válido. 
Nesse caso, nosso número é válido, pois `80` é divisível por `10`.

__Exemplo 2: Número de cartão inválido__

Dado o seguinte número de cartão de crédito:

```
8273 1232 7352 0569
```

Dobramos cada segundo dígito da direita para a esquerda (lembrando de subtrair 9 do resultado do 
dobro caso este seja maior que 9):

```
7253 2262 5312 0539
```

Então somamos os dígitos:

```
7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57
```

`57` não é inteiramente divisível por `10`, portanto, este número de cartão é inválido.

Fonte: [Exercism - Luhn - Community Solutions](https://exercism.io/tracks/java/exercises/luhn/solutions/15fc773616df4d46ae2e6439c37e2f21)


### Concluindo

Após concluir, preencha o formulário de feedbacks [clicando
aqui](https://docs.google.com/forms/d/e/1FAIpQLSfKYgYepw9weBvga-jLeyzrOmy_erFNQzqBbehU-ioQNmTbPw/viewform?usp=sf_link).
