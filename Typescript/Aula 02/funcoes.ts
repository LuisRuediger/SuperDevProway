// Função sem retorno e sem parâmetro
function dizerOla(): void {
  console.log('Olá, bem vindo!');
}

dizerOla();

// Função com retorno sem parâmetro
function obterMes11(): string {
  return 'Novembro';
}

const mes11: string = obterMes11();
console.log(mes11);
console.log(obterMes11());

// Função sem retorno e com parâmetro
function mostrarNome(nome: string) {
  console.log('Olá, meu nome é:' + nome);
}

mostrarNome('Luis');

// Função com retorno e com parâmetro
function somar(a: number, b: number): number {
  return a + b;
}

const resultadoSoma: number = somar(1, 2);
console.log(resultadoSoma);

// Função sem retorno e com parâmetros opcionais
function boasVindas(escola?: string): void {
  if (escola) {
    console.log('Bem vindo a escola ' + escola);
  } else {
    console.log('Bem vindo!');
  }
}

boasVindas('Proway');
boasVindas();

// Função com retorno e com parâmetro Default
function elevarNum(num: number, potencia: number = 2): number {
  return num ** potencia;
}

const resultadoPotencia = elevarNum(10, 3);
const resultadoPotencia2 = elevarNum(10);

console.log(resultadoPotencia);
console.log(resultadoPotencia2);