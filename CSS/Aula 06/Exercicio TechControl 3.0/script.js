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


document.getElementById('exampleModal').addEventListener('show.bs.modal', () => {
  let ultimoCodigo = parseInt(localStorage.getItem('ultimoCodigo')) || 0;
  document.getElementById('codigo').value = ultimoCodigo + 1;
});

document.querySelector('.salvar').addEventListener('click', () => {
  const descricao = document.getElementById('descricao').value;
  const estoque = document.getElementById('estoque').value;
  const valor = document.getElementById('valor').value;
  const categoria = document.getElementById('categoria').value;

    let ultimoCodigo = parseInt(localStorage.getItem('ultimoCodigo')) || 0;    

    const codigo = ++ultimoCodigo;

  if (descricao && estoque && valor && categoria) {
    
    const novoProduto = { codigo, descricao, estoque, valor, categoria };

    const produtos = JSON.parse(localStorage.getItem('produtos')) || [];

    produtos.push(novoProduto);

    localStorage.setItem('produtos', JSON.stringify(produtos));
    localStorage.setItem('ultimoCodigo', codigo);

    document.getElementById('descricao').value = '';
    document.getElementById('estoque').value = '';
    document.getElementById('valor').value = '';
    document.getElementById('categoria').value = '';

    const modal = bootstrap.Modal.getInstance(document.getElementById('exampleModal'));
    modal.hide();

    alert('Produto adicionado com sucesso!');
  } else {
    alert('Por favor, preencha todos os campos.');
  }
});