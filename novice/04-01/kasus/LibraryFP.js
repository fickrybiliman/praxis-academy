// Kesamaan dari 3 Libraries untuk Functional Programming (Underscore, Lodash, Ramda)
// 1. Tidak menggunakan Native JavaScript
// 2. 
// 3.


// Fetching API :

// Ramda
$.getJSON('https://api.github.com/users?since=135')
  .then(R.pluck('avatar_url'))
  .then((d) => console.log(d));

// Lodash
$.getJSON('https://api.github.com/users?since=135')
  .then((users) => _.map(users, (user) => user.avatar_url))
  .then((d) => console.log(d));