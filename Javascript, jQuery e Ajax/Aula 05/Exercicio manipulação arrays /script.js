const productList = [];

function addEnd() {
  const product = document.getElementById('product').value;
  const output = document.getElementById('output');

  productList.push(product);
  output.innerHTML = productList.toString();
}

function addStart() {
  const product = document.getElementById('product').value;
  const output = document.getElementById('output');

  productList.unshift(product);
  output.innerHTML = productList.toString();
}

function removeEnd() {
  const product = document.getElementById('product').value;
  const output = document.getElementById('output');

  productList.pop(product);
  output.innerHTML = productList.toString();
}

function removeStart() {
  const product = document.getElementById('product').value;
  const output = document.getElementById('output');

  productList.shift(product);
  output.innerHTML = productList.toString();
}

function removeSplice() {
  const product = document.getElementById('product').value;
  const position = document.getElementById('position').value;
  const output = document.getElementById('output');

  productList.splice(position, position);
  output.innerHTML = productList.toString();
}

function addSplice() {
  const product = document.getElementById('product').value;
  const position = document.getElementById('position').value;
  const output = document.getElementById('output');

  productList.splice(position,0, product);
  output.innerHTML = productList.toString();
}