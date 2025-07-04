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
      cursos: ["HTML", "CSS", "Javascript"]
    },
    {
      image: "assets/images/avatar1.png",
      nome: "Fabio",
      matricula: 456,
      email: "fabio@proway.com",
      cadastro: true,
      cursos: ["Java"]
    },
    {
      image: "assets/images/avatar2.png",
      nome: "Chris",
      matricula: 789,
      email: "chris@proway.com",
      cadastro: false,
      cursos: ["Postgres"]
    },
    {
      image: "assets/images/avatar2.png",
      nome: "Chris",
      matricula: 789,
      email: "chris@proway.com",
      cadastro: false,
      cursos: ["Postgres"]
    }
  ];
}
