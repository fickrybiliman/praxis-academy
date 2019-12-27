const https = require('https');

https.get('https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY', (resp) => {
  let data = '';
//   console.log(resp);

  // A chunk of data has been recieved.
  resp.on('data', (chunk) => {
   // console.log(chunk.toString());
    data += chunk;
   });

  
  // The whole response has been received. Print out the result.
  resp.on('end', () => {
    console.log(JSON.parse(data).explanation);
  });

}).on("error", (err) => {
  console.log("Error: " + err.message);
});