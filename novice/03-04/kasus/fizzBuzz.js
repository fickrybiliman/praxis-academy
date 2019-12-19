for (let i = 1; i <= 100; i++) {
   if (i % 3 === 0 && i % 5 === 0) {
      console.log(`FizzBuzz, because number ${i} divisible by 3 and 5`);
   } else if (i % 3 === 0) {
      console.log(`Fizz, because number ${i} divisible by 3`);
   } else if (i % 5 === 0) {
      console.log(`Buzz, because number ${i} divisible by 5`);
   } else {
      console.log(`number ${i} is not divisible by 3 or 5`);
   }
}