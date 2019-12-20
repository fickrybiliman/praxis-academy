function isEven(number) {
   return number < 0 ? null : number % 2 === 0;
   // let result = `Number ${number} is `;
   // if (number < 0) {
   //    return isEven(number - 2);
   // } else if (number % 2 === 0) {
   //    result += 'Even';
   // } else if (number % 2 === 1) {
   //    result += 'Odd';
   // }
   // return result;
}

console.log(isEven(50));
console.log(isEven(75));
console.log(isEven(-1));
console.log(isEven(-4));