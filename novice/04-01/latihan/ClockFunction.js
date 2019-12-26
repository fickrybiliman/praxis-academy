function Clock({ template }) {
   let timer;

   function render() {
      let date = new Date();
      
      let hours = date.getHours();
      if (hours < 10) {
         hours = '0' + hours;
      }

      let minutes = date.getMinutes();
      if (minutes < 10) {
         minutes = '0' + minutes;
      }

      let seconds = date.getSeconds();
      if (seconds < 10) {
         seconds = '0' + seconds;
      }

      let output = template
                  .replace('h', hours)
                  .replace('m', minutes)
                  .replace('s', seconds);
      
      console.log(output);
   }

   this.stop = function() {
      clearInterval(timer);
   };

   this.start = function() {
      render();
      timer = setInterval(render, 1000);
   };
}

let clock = new Clock({ template : 'h:m:s' });
clock.start();