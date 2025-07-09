export interface AlunoInterface {
  matricula: number;
  nome: string;
  email?: string;
  cadastro: boolean;
  cursos: string[];
  image?: string;
  notas: number[];
}