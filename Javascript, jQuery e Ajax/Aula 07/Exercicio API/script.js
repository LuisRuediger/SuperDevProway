function listarTodos() {
  var xhttp = new XMLHttpRequest();

  // definindo o tipo de retorno do meu objeto xhttp
  xhttp.responseType = "json";

  xhttp.onreadystatechange = function () {

      // status da requisição já retornada para o browser
      if (this.readyState == 4) {
          console.log(xhttp);

          const listaPersonagens = xhttp.response.results;
          const divResultado = document.getElementById('resultado');

          listaPersonagens.forEach(personagem => {
              divResultado.innerHTML += '<p>' + personagem.name + '</p>';
          });

          // if(this.status == 200){
          //     alert("Registros encontrados com sucesso!");

          // }else{
          //     alert("Algo deu errado.");
          // }
      }  
      
  };

  xhttp.open("GET", "https://rickandmortyapi.com/api/character");
  xhttp.send();
}