let firstName:string = "Luis";
let code:number = 779933;
let isActive:boolean = true;
let monthNumber:number = 2;
let monthString:string;

console.log(`Olá, meu nome é ${firstName}`);
console.log(`Meu código é ${code}`);
console.log(`Atualmente estou estudando no SuperDev? ${isActive ? "Verdadeiro" : "Falso"}`);

switch (monthNumber) {
  case 1:
    console.log(`Sabendo que estamos no mês ${monthNumber}, posso dizer que é Janeiro!`);
    break;
  case 2:
    console.log(`Sabendo que estamos no mês ${monthNumber}, posso dizer que é Fevereiro!`);
    break;
  case 3:
    console.log(`Sabendo que estamos no mês ${monthNumber}, posso dizer que é Março!`);
    break;
  default:
    console.log(`${monthNumber} é um mês inválido`);   
}