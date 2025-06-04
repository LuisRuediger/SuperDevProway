
function monthValidation() {
  const inputSelect = document.getElementById('month');
  const outputMonth = document.getElementById('outputMonth');
  
  switch(inputSelect.value){
    case ('1'):
      outputMonth.innerHTML = 'Janeiro';
      break;
    case ('2'):
      outputMonth.innerHTML = 'Fevereiro';
      break;
    case ('3'):
      outputMonth.innerHTML = 'Março';
      break;
    case ('4'):
      outputMonth.innerHTML = 'Abril';
      break;
    case ('5'):
      outputMonth.innerHTML = 'Maio';
      break;
    case ('6'):
      outputMonth.innerHTML = 'Junho';
      break;
    case ('7'):
      outputMonth.innerHTML = 'Julho';
      break;
    case ('8'):
      outputMonth.innerHTML = 'Agosto';
      break;
    case ('9'):
      outputMonth.innerHTML = 'Setembro';
      break;
    case ('10'):
    outputMonth.innerHTML = 'Outubro';
    break;
    case ('11'):
      outputMonth.innerHTML = 'Novembro';
      break;
    case ('12'):
      outputMonth.innerHTML = 'Dezembro';
      break;
    default:
      console.log('Mês inválido');
  }

}