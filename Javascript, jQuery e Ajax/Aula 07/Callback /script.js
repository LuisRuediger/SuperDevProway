function somar (numA, numB) {
  return numA + numB;
}

function subtrair (numA, numB) {
  return numA - numB;
}

function executarOperacao(operacao) {
  const resultado = operacao(7,2);
  console.log(resultado);
}

executarOperacao(subtrair);