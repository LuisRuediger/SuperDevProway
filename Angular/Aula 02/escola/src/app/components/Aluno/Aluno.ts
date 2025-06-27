import { Component } from '@angular/core';

@Component({
  selector: 'app-aluno',
  standalone: false,
  templateUrl: './aluno.html',
  styleUrl: './aluno.css'
})
export class Aluno {
  codigo: number = 7;
  nome: string = "Luis";
  curso: string = "Angular";
}
