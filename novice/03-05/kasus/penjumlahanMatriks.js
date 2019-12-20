let matriks1 = [[1, 2, 3],
                [4, 5, 6],
                [7, 8, 9]];

let matriks2 =[[11, 22, 33],
               [44, 55, 66],
               [77, 88, 99]];

let result = [[],[],[]];

for (let i = 0; i < matriks1.length; i++) {
   for (let j = 0; j < matriks1[i].length; j++) {
      result[i].push(matriks1[i][j] + matriks2[i][j])
   }
}

console.log(result);

