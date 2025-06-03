function loginValidation() {
  const inputEmail = document.getElementById('email').value
  const inputPassword = document.getElementById('password').value

  const defaultEmail = 'admin'
  const defaultPassword = 'admin'

  const isLoginValid = inputEmail == defaultEmail && inputPassword == defaultPassword

  if (isLoginValid == true) {
    const el = document.getElementById('errorHandling')
    document.getElementById('errorHandling').innerHTML = "Usuário logado com sucesso!"
    el.classList = 'login-success'
  } else {
    const el = document.getElementById('errorHandling')
    document.getElementById('errorHandling').innerHTML = "Usuário ou senha incorretos!"
    el.classList = 'login-failed'
  }
}

const inputEmailListener = document.getElementById('email')
const inputPasswordListener = document.getElementById('password')


inputEmailListener.addEventListener('input', () => {})

inputPasswordListener.addEventListener('input', () => {
  console.log(inputPasswordListener.value)
})

if ( inputPasswordListener.value !== '' && inputPasswordListener.value !== '') {
  document.getElementById('loginButton').disabled = false
}