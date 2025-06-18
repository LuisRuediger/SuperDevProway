// Função sem retorno e sem parâmetro
function dizerOla() {
    console.log('Olá, bem vindo!');
}
dizerOla();
// Função com retorno sem parâmetro
function obterMes11() {
    return 'Novembro';
}
var mes11 = obterMes11();
console.log(mes11);
console.log(obterMes11());
// Função sem retorno e com parâmetro
function mostrarNome(nome) {
    console.log('Olá, meu nome é:' + nome);
}
mostrarNome('Luis');
// Função com retorno e com parâmetro
function somar(a, b) {
    return a + b;
}
var resultadoSoma = somar(1, 2);
console.log(resultadoSoma);
// Função sem retorno e com parâmetros opcionais
function boasVindas(escola) {
    if (escola) {
        console.log('Bem vindo a escola ' + escola);
    }
    else {
        console.log('Bem vindo!');
    }
}
boasVindas('Proway');
boasVindas();
// Função com retorno e com parâmetro Default
function elevarNum(num, potencia) {
    if (potencia === void 0) { potencia = 2; }
    return Math.pow(num, potencia);
}
var resultadoPotencia = elevarNum(10, 3);
var resultadoPotencia2 = elevarNum(10);
console.log(resultadoPotencia);
console.log(resultadoPotencia2);
