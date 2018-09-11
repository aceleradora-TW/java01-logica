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

### Concluindo

Após concluir, preencha o formulário de feedbacks [clicando
aqui](https://docs.google.com/forms/d/e/1FAIpQLSfKYgYepw9weBvga-jLeyzrOmy_erFNQzqBbehU-ioQNmTbPw/viewform?usp=sf_link).
