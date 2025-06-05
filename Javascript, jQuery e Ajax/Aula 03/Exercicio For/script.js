function addCard() {
  const divBox = document.getElementById('box');
  const emptyList = document.getElementById('emptyList');
  const quantity = Number(document.getElementById('quantity').value);
  const cardText = document.getElementById('text');
  
  // emptyList.classList = 'emptyList'

  emptyList.innerText = ""

  for (let i = 0; i < quantity; i++) {
    divBox.innerHTML = `
      <div class="card">${cardText.value}</div>
    `
  }
}