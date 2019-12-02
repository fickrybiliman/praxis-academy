echo "Enter your lucky number"
read number

case $number in 101)
      echo "You got 1st prize" ;;
   510)
      echo "You got 2nd prize" ;;
   999)
      echo "You got 3rd prize" ;;
   *)
   echo "Sorry, try for the next time"
esac