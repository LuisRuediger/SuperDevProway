const list = [];

function addLista() {
  const inputNumero = Number(document.getElementById('inputNumero').value);
  const numeroPar = document.getElementById('numerosPares');
  const numeroImpar = document.getElementById('numerosImpares');
  numeroPar.innerText = '';
  numeroImpar.innerHTML = '';

  list.push(inputNumero);

  list.forEach( item => {
    if (item % 2 == 0) {      
      numeroPar.innerHTML += `<p></p>${item}</p>`
    } else {
      numeroImpar.innerHTML += `<p>${item}</p>`
    }
  })
};

