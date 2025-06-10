const arrayList = ['Luis', 'Felipe', 'Maria'];

console.log(typeof arrayList);

console.log(arrayList.length);

console.log(arrayList);

console.log(arrayList.toString());

arrayList.pop();
console.log(arrayList.toString());

arrayList.unshift('Bob');
console.log(arrayList.toString());

arrayList.push('Felipe');
console.log(arrayList.toString());

arrayList.shift();
console.log(arrayList.toString());

arrayList.splice(1,1);
console.log(arrayList.toString());

arrayList.splice(1,0, 'Test', 'test2', 'test3');
console.log(arrayList.toString());

arrayList.splice(2,1, 'Testtttttttt');
console.log(arrayList.toString());

const index = arrayList.indexOf('Felipe');
console.log(index);