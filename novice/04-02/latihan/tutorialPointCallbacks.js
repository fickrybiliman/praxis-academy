
let fs = require('fs');

// Blocking Code Example
let blocking = fs.readFileSync('tutorialPointInput.txt');

console.log(blocking.toString());
console.log("=== Blocking Code Program End ===");

console.log('------------------------------------------------');


// Non-Blocking Code Example
fs.readFile('tutorialPointInput.txt', function(err, data) {
   if (err) return console.log(err);
   console.log(data.toString());
})

console.log("=== Non-Blocking Code Program End ===");