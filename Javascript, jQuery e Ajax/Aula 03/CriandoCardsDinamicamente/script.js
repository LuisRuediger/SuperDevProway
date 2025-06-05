function addCard() {
  const divBox = document.getElementById('box');
  const emptyList = document.getElementById('emptyList');
  
  // emptyList.classList = 'emptyList'

  emptyList.innerText = ""

  divBox.innerHTML += `
    <div class="card">Conteúdo</div>
  `

}