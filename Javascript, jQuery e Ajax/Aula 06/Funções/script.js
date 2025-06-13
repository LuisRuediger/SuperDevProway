function realizarOperacao(operacao) {
  const a = Number(document.getElementById('numA').value);
  const b = Number(document.getElementById('numB').value);

  if (operacao == 'soma') {
    imprimirSomar(a,b);
  }

  if (operacao == 'subtrair') {
    imprimirSubtracao(a,b);
  }

  if (operacao == 'multiplicar') {
    // Capturando retorno da função 'multiplicar' e guardando na const 'resultado'
    const resultado = multiplicar(a, b);
    const divResultado = document.getElementById('resultado');
    divResultado.innerHTML = `A multiplicação entre ${a} e ${b} é ${resultado}`;
  }

  limparCampos();
};

function imprimirSomar(a, b) {
  const divResultado = document.getElementById('resultado');
  divResultado.innerHTML = `A soma entre ${a} e ${b} é ${a+b}`;
};

function imprimirSubtracao(a, b) {
  const divResultado = document.getElementById('resultado');
  divResultado.innerHTML = `A subtração entre ${a} e ${b} é ${a-b}`;
}

function limparCampos() {
  document.getElementById('numA').value = '';
  document.getElementById('numB').value = '';

  document.getElementById('numA').focus();
}

function multiplicar(a, b) {
  return a * b;
}