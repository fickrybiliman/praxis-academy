echo "Enter any number"
read number

if [[ $number -eq 15 || $number -eq 45 ]] 
   then
      echo "You won the game"
   else 
      echo "You lose the game"
fi