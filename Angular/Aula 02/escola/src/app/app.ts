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

  exibicao: string = 'cards';

  listaAlunos: AlunoInterface[] = [
    {
      image: "assets/images/avatar.png",
      nome: "Luis",
      matricula: 123,
      email: "luis@proway.com",
      cadastro: true,
      cursos: ["HTML", "CSS", "Javascript"],
      notas: [5,9,2]
    },
    {
      image: "assets/images/avatar1.png",
      nome: "Fabio",
      matricula: 456,
      email: "fabio@proway.com",
      cadastro: false,
      cursos: ["Java"],
      notas: [10,9,8]
    },
    {
      image: "assets/images/avatar2.png",
      nome: "Chris",
      matricula: 789,
      email: "chris@proway.com",
      cadastro: true,
      cursos: ["Postgres"],
      notas: [7,8,9]
    },
    {
      image: "assets/images/avatar2.png",
      nome: "Maria",
      matricula: 111,
      email: "maria@proway.com",
      cadastro: false,
      cursos: ["Python"],
      notas: [7,6,7]
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

    this.listaAlunos.map(aluno => {
      this.listaFiltrada.push(aluno);
    })
  }

}
