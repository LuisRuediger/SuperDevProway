"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Aluno = void 0;
var Aluno = /** @class */ (function () {
    function Aluno(nome, codigo) {
        this.curso = '';
        this.matricula = false;
        this.notas = [7, 8, 9, 9];
        this.nome = nome;
        this.codigo = codigo;
    }
    Aluno.prototype.verificarMatricula = function () {
        if (this.matricula) {
            console.log(this.nome, 'está com a matrícula regular');
        }
        else {
            console.log(this.nome, 'tem pendências na matrícula');
        }
    };
    Aluno.prototype.calcularMedia = function () {
        var qtdNotas = this.notas.length;
        // Descobrir se tem 4 notas lançadas
        if (qtdNotas !== 4) {
            console.log("Quantidade de notas errada:" + qtdNotas);
        }
        else {
            // Descobir a média do aluno
            var media_1 = 0;
            this.notas.forEach(function (nota) {
                media_1 = media_1 + nota;
            });
            media_1 = media_1 / 4;
            // Descobrir situação do aluno
            if (media_1 >= 8) {
                console.log('Aprovado para o próximo período');
            }
            else if (media_1 <= 4) {
                console.log('Retido em período de exames');
            }
            else {
                console.log("Retenção direta");
            }
        }
    };
    return Aluno;
}());
exports.Aluno = Aluno;
var aluno1 = new Aluno('Luis', 123123);
// console.log(aluno1.nome);
// console.log(aluno1);
// aluno1.verificarMatricula();
aluno1.calcularMedia();
