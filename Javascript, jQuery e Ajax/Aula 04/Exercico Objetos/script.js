function productInformation() {
  const code = document.getElementById('code');
  const price = document.getElementById('price');
  const description = document.getElementById('description');
  const codeOut = document.getElementById('codeOut');
  const priceOut = document.getElementById('priceOut');
  const descriptionOut = document.getElementById('descriptionOut');
  
  let product = {
    code: code.value,
    price: price.value,
    description: description.value
  };

  codeOut.innerHTML = `${product.code}`;
  priceOut.innerHTML = `R$ ${product.price}`;
  descriptionOut.innerHTML = `${product.description}`;
}