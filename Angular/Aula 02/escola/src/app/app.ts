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

  listaAlunos: AlunoInterface[] = [
    {
      nome: "Luis",
      matricula: 123,
      email: "luis@proway.com",
      cadastro: false,
      cursos: ["HTML", "CSS", "Javascript"]
    },
    {
      nome: "Felipe",
      matricula: 456,
      email: "felipe@proway.com",
      cadastro: false,
      cursos: ["Java"]
    }
  ];
}
