import { Component, Input } from '@angular/core';
import { AlunoInterface } from '../../interfaces/AlunoInterface';

@Component({
  selector: 'app-aluno',
  standalone: false,
  templateUrl: './aluno.html',
  styleUrl: './aluno.css'
})
export class Aluno {

  @Input()
  aluno!: AlunoInterface;

  media!: number;

  calcularMedia(): void {
    let somaNotas:number =  0;
    let qtdNotas: number = this.aluno.notas.length;

      this.aluno.notas.forEach(nota => {
        somaNotas += nota;
      })

      this.media = parseFloat((somaNotas / qtdNotas).toFixed(2));
  }


  ngOnInit(): void {
    this.calcularMedia()
  }
}