import { Component } from '@angular/core';

@Component({
  selector: 'app-student',
  standalone: false,
  templateUrl: './student.html',
  styleUrl: './student.css'
})
export class Student {
  codigo: number = 7;
  nome: string = "Luis";
  curso: string = "Angular";

}
