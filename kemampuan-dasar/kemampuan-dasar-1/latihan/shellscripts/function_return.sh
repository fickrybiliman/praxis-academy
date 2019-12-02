function greeting() {
   str="Hello, $name, how are you today?"
   echo $str
}

echo "Enter your name"
read name

val=$(greeting)
echo "Return value of the function is $val"