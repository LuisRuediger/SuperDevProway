import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.html',
  standalone: false,
  styleUrl: './app.css'
})
export class App {
  // Declarando variáveis
  titulo: string = "Página de Alunos";
  aluno: string = "Luis";


}
