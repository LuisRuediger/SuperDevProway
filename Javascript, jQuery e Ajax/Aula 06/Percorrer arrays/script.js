const productList = [
  'Brigadeiro', 'Coxinha', 'Esfirra', 'Pastel', 'Bolo de chocolate', 'Sonho'
];

const listFor = document.getElementById('listFor');
const listForEach = document.getElementById('listForEach');
const listFunction = document.getElementById('listFunction');

// laço for tradicional
for(let i = 0; i < productList.length; i++) {
  listFor.innerHTML += `<p>${productList[i]}</p>`;
};

// metodo forEach
productList.forEach( item => {
  listForEach.innerHTML += `<p>${item}</p>`;
});

// usando uma função, passando para o forEach
function outputList(item) {
  listFunction.innerHTML += `<p>${item}</p>`;
};

productList.forEach(outputList);

//Usando p forEach para imprimir somente os números positivos
const listaNumeros = [8, 68, -1, -59, 2, 474, -23, -474];
const listaPositivos = document.getElementById('listaPositivos');

listaNumeros.forEach( item => {
  if(item >= 0 ) {
    listaPositivos.innerHTML += `<p>${item}</p>`;
  };
});
