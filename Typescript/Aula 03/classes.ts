export class Aluno {
  public readonly nome: string;
  public readonly codigo: number;
  public curso: string = '';
  public matricula: boolean = false;
  public readonly notas: number[] = [7,8,9,9];

  constructor(nome: string, codigo: number) {
    this.nome = nome;
    this.codigo = codigo;
  }

  verificarMatricula(): void {
    if (this.matricula) {
      console.log(this.nome, 'está com a matrícula regular');
    } else {
      console.log(this.nome, 'tem pendências na matrícula');
    }
  }

  calcularMedia(): void {

    const qtdNotas = this.notas.length;

    // Descobrir se tem 4 notas lançadas
    if (qtdNotas !== 4) {
      console.log("Quantidade de notas errada:" + qtdNotas);
    } else {
      // Descobir a média do aluno
      let media = 0;

      this.notas.forEach(nota => {
        media = media + nota;
      })

      media = media / 4;

      // Descobrir situação do aluno
      if (media >= 8) {
        console.log('Aprovado para o próximo período');
      } else if (media <= 4) {
        console.log('Retido em período de exames');
      } else {
        console.log("Retenção direta");
      }
    }
  }

}

const aluno1: Aluno = new Aluno('Luis', 123123);

// console.log(aluno1.nome);
// console.log(aluno1);

// aluno1.verificarMatricula();

aluno1.calcularMedia();