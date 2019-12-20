function countBS(str) {
   return str.match(/B/g).length;
}

function countChar(str, char) {
   let regex = new RegExp(char, 'g');
   return str.match(regex).length;
}

console.log(countBS('BBC'));
console.log(countChar("kakkerlak", "k"));

