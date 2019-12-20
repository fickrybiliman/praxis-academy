function multiplier(factor) {
   // return function(number) {
   //    return number * factor;
   // }
   return number  => number * factor;
}

let twice = multiplier(2);
console.log(multiplier().toString());

console.log(twice(3));