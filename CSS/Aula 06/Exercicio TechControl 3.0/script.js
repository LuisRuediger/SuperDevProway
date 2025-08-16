const listaUsuarios = [];

function setUserToLocalStorage(user) {
  localStorage.setItem('lista', JSON.stringify(user));
}

function getUsersFromLocalStorage() {
  const lista = localStorage.getItem('lista');

  return lista ? JSON.parse(lista) : [];
}


function cadastroUsuario() {
  const email = document.getElementById('exampleInputEmail1').value;
  const senha = document.getElementById('exampleInputPassword1').value;

  const newUser = getUsersFromLocalStorage();

  newUser.push({ 
    "email": email, 
    "senha": senha
  });

  setUserToLocalStorage(newUser);  
}

function validarLogin() {
  const email = document.getElementById('email').value;
  const senha = document.getElementById('senha').value;
  const lista = getUsersFromLocalStorage();

  const usuarioCadastrado = lista.find(usuario => usuario.email === email && usuario.senha === senha);
 
  console.log(usuarioCadastrado);
  

  // if (usuarioCadastrado) {
  //   console.log("acertou");
  // } else {
  //   console.log("seu burro");
  // }
}