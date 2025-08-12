const listaUsuarios = [];

function setUserToLocalStorage(user) {
  localStorage.setItem('lista', JSON.stringify(user));
}

function getUserFromLocalStorage() {
  const lista = localStorage.getItem('lista');

  return lista ? JSON.parse(lista) : [];
}


function cadastroUsuario() {
  const email = document.getElementById('exampleInputEmail1').value;
  const senha = document.getElementById('exampleInputPassword1').value;

  const newUser = getUserFromLocalStorage();

  newUser.push({ email, senha });

  setUserToLocalStorage(newUser);  
}
