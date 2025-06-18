var firstName = "Luis";
var code = 779933;
var isActive = true;
var monthNumber = 2;
var monthString;
console.log("Ol\u00E1, meu nome \u00E9 ".concat(firstName));
console.log("Meu c\u00F3digo \u00E9 ".concat(code));
console.log("Atualmente estou estudando no SuperDev? ".concat(isActive ? "Verdadeiro" : "Falso"));
switch (monthNumber) {
    case 1:
        console.log("Sabendo que estamos no m\u00EAs ".concat(monthNumber, ", posso dizer que \u00E9 Janeiro!"));
        break;
    case 2:
        console.log("Sabendo que estamos no m\u00EAs ".concat(monthNumber, ", posso dizer que \u00E9 Fevereiro!"));
        break;
    case 3:
        console.log("Sabendo que estamos no m\u00EAs ".concat(monthNumber, ", posso dizer que \u00E9 Mar\u00E7o!"));
        break;
    default:
        console.log("".concat(monthNumber, " \u00E9 um m\u00EAs inv\u00E1lido"));
}
