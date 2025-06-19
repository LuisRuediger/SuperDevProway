const listaFuncionarios = [];

function adicionar() {
  const funcionario = document.getElementById('nome').value;

  listaFuncionarios.push(funcionario);

  // adicionar a lista ao localstorage
  localStorage.setItem('lista', JSON.stringify(listaFuncionarios));

}