function gerarParagrafos() {
  const divResult = document.getElementById('result');

  for (let i = 0; i <= 7; i++) {
    divResult.innerHTML += `<p>${i}</p>`   
  }
}