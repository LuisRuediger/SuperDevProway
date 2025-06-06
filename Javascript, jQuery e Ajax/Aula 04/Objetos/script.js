let aluno = {};

let aluno2 = {
  codigo: 1,
  nome: 'Luis',
  matricula: true
};

console.log(aluno);
console.log(aluno2);

console.log(aluno2.nome);

aluno2.nome = 'Felipe';
console.log(aluno2.nome);

aluno.nome = 'Luis';
console.log(aluno.nome);

const aluno3 = {
  codigo: 3,
  nome: 'Bob',
  endereco: {
    rua: 'Rua nove',
    numero: 117,
    bairro: 'Centro',
    estado: {
      sigla: 'SC',
      nome: 'Santa Catarina'
    }
  }
};

console.log('Rua: ' + aluno3.endereco.rua);
console.log('Sigla: ' + aluno3.endereco.estado.sigla);

const aluno4 = {
  codigo: 4,
  nome: 'Rony',
  notas: [8, 9, 8, 10]
};

console.log('Todas as notas: ' + aluno4.notas);
console.log('Terceira nota: ' + aluno4.notas[2]);