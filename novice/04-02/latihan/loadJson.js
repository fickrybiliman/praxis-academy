
function loadJson(url) {
   return fetch(url)
     .then(response => {
       if (response.status == 200) {
         return response.json();
       } else {
         throw new Error(response.status);
       }
     })
 }

loadJson('example_1.json') // (3)
.catch(alert); // Error: 404