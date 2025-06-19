function apresentarInfos(): void {
  console.log('*********  Monitor paciente  *********');
}

function nivelOxigenioIdeal(): number {
  return 95;
}

function batimentosCardiacosIdeal(): number {
  return 60;
}

apresentarInfos();
const nvlOxigenioIdeal = nivelOxigenioIdeal();
const nvlBatimentoIdeal = batimentosCardiacosIdeal();

console.log(`Seu nível de oxigenio é ${nvlOxigenioIdeal}`);
console.log(`Seus batimentos cardiacos estão em ${nvlBatimentoIdeal}`);


function dadosPaciente(): void {
  let paciente = {
    nome: 'Luis',
    sobrenome: 'Ruediger',
    nvlOxigenio: 80,
    nvlBatimentos: 99,
    diasInternado: 7
  }

  console.log(`
    ******************************************************************
      Paciente: ${paciente.nome}
      Nível de saturação: ${paciente.nvlOxigenio}
      Nível atual de BPM: ${paciente.nvlBatimentos}
      Quantidade de dias internado: ${paciente.diasInternado} dias
    ******************************************************************
    `);



}

dadosPaciente()

// Falta implementar:

// É necessário validar os níveis do paciente, as funções
// devem:
// - Validar se o nível de oxigênio do paciente está aceitável
// (considerando 2 pontos para mais ou para menos com relação
// ao nível ideal);
// - Validar se os batimentos estão normais, exibindo no monitor o
// estado atual do paciente (sabendo-se que a quantidade ideal é
// entre 50 a 90 batimentos)
// - Caso o paciente estiver com os níveis adequados e mais de 7
// dias internado, o sistema deve emitir um aviso de possível alta