function sum() {
  const numA = Number(document.getElementById('numA').value);
  const numB = Number(document.getElementById('numB').value);

  const divResult = document.getElementById('result');

  const sum = numA + numB;

  // divResult.innerText = sum;
  divResult.innerHTML = `
    <p>Resultado</p>
    <p class="destaque">${sum}</p>
  `;
}