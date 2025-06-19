function apresentarInfos() {
    console.log('*********  Monitor paciente  *********');
}
function nivelOxigenioIdeal() {
    return 95;
}
function batimentosCardiacosIdeal() {
    return 60;
}
apresentarInfos();
var nvlOxigenioIdeal = nivelOxigenioIdeal();
var nvlBatimentoIdeal = batimentosCardiacosIdeal();
console.log("Seu n\u00EDvel de oxigenio \u00E9 ".concat(nvlOxigenioIdeal));
console.log("Seus batimentos cardiacos est\u00E3o em ".concat(nvlBatimentoIdeal));
function dadosPaciente() {
    var paciente = {
        nome: 'Luis',
        sobrenome: 'Ruediger',
        nvlOxigenio: 80,
        nvlBatimentos: 99,
        diasInternado: 7
    };
    console.log("\n      ******************************************************************\n        Paciente: ".concat(paciente.nome, "\n        N\u00EDvel de satura\u00E7\u00E3o: ").concat(paciente.nvlOxigenio, "\n        N\u00EDvel atual de BPM: ").concat(paciente.nvlBatimentos, "\n        Quantidade de dias internado: ").concat(paciente.diasInternado, " dias\n      ******************************************************************\n      "));
}
dadosPaciente();
