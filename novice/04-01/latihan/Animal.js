function Animal(className) {
   this.className = className;
 }
 
 // add method to Animal prototype
 Animal.prototype.getClass = function() {
   return 'Animal class is : ' + this.className;
 };
 
 function Dog(name) {
   // execute parent constructor
   Animal.call( this, 'Animal' ); // pass this, arguments
   
   this.name = name; // add new property
 }
 
 // save Animal.prototype in Dog.prototype
 Dog.prototype = Object.create(Animal.prototype);
 
 // add constructor reference on Dog prototype
 Dog.prototype.constructor = Dog;
 
 // add method to Dog prototype
 Dog.prototype.getName = function() {
   return this.name;
 }
 
 // create dog object
 var d = new Dog( 'Tommy' );
 
 console.log(d); // show dog
 console.log(d.getClass()); // show Dog prototype
 