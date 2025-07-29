import { Component } from '@angular/core';
import { AlunoInterface } from './interfaces/AlunoInterface';

@Component({
  selector: 'app-root',
  templateUrl: './app.html',
  standalone: false,
  styleUrl: './app.css'
})
export class App {
  protected title = 'escola';

  exibicao: string = 'lista';

  listaAlunos: AlunoInterface[] = [
    {
      image: "assets/images/avatar.png",
      nome: "Luis",
      matricula: 123,
      email: "luis@proway.com",
      cadastro: true,
      cursos: ["HTML", "CSS", "Javascript"],
      notas: [5,9,2],
      status: true
    },
    {
      image: "assets/images/avatar1.png",
      nome: "Fabio",
      matricula: 456,
      email: "fabio@proway.com",
      cadastro: false,
      cursos: ["Java"],
      notas: [10,9,8],
      status: true
    },
    {
      image: "assets/images/avatar2.png",
      nome: "Chris",
      matricula: 789,
      email: "chris@proway.com",
      cadastro: true,
      cursos: ["Postgres"],
      notas: [7,8,9],
      status: true
    },
    {
      image: "assets/images/avatar2.png",
      nome: "Maria",
      matricula: 111,
      email: "maria@proway.com",
      cadastro: false,
      cursos: ["Python"],
      notas: [7,6,7],
      status: true
    }
  ];

  alterarExibicao(): void {

  if (this.exibicao == 'cards') {
      this.exibicao = 'lista';
    } else {
      this.exibicao = 'cards'
    }
  }

  listaFiltrada: AlunoInterface[] = this.listaAlunos;

  exibirAprovados(): void {
    this.listaFiltrada = [];

    this.listaAlunos.map(aluno => {

      if (aluno.cadastro == true) {
        this.listaFiltrada.push(aluno)
      }
    })
  }

  exibirReprovados(): void {
    this.listaFiltrada = [];

    this.listaAlunos.map(aluno => {

      if (aluno.cadastro == false) {
        this.listaFiltrada.push(aluno)
      }
    })
  }

  exibirListaCompleta(): void {
    this.listaFiltrada = [];

    this.listaFiltrada = this.listaAlunos;

    // this.listaAlunos.map(aluno => {
    //   this.listaFiltrada.push(aluno);
    // })
  }

  onExcluir(matricula: number): void {

    this.listaAlunos.forEach((aluno, index) => {

      if (matricula == aluno.matricula) {
        this.listaAlunos.splice(index, 1)
      }
    })
  }

}
