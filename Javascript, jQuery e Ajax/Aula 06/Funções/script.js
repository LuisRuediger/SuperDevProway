function realizarOperacao(operacao) {
  const a = Number(document.getElementById('numA').value);
  const b = Number(document.getElementById('numB').value);

  if (operacao == 'soma') {
    imprimirSomar(a,b);
  }

  if (operacao == 'subtrair') {
    imprimirSubtracao(a,b);
  }
};

function imprimirSomar(a, b) {
  const divResultado = document.getElementById('resultado');
  divResultado.innerHTML = `A soma entre ${a} e ${b} é ${a+b}`;
};

function imprimirSubtracao(a, b) {
  const divResultado = document.getElementById('resultado');
  divResultado.innerHTML = `A subtração entre ${a} e ${b} é ${a-b}`;
}