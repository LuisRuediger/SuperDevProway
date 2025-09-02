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

function validarLogin(event) {
  event.preventDefault();

  const email = document.getElementById('email').value;
  const senha = document.getElementById('passsword').value;
  const lista = getUsersFromLocalStorage();

  const usuarioCadastrado = lista.find(usuario => usuario.email === email && usuario.senha === senha);
 
  if (usuarioCadastrado) {
    window.location.href = 'dashboard.html';
  } else {
    alert('Usuário não cadastrado!');
  }
}