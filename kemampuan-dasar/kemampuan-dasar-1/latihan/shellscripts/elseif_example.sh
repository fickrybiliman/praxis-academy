echo "Enter your lucky number"
read number
if [ $number -eq 101 ];
   then
      echo "You got 1st prize"
elif [ $number -eq 510 ];
   then 
      echo "You got 2nd prize"
elif [ $number -eq 999 ];
   then 
      echo "You got 3rd prize"
else
   echo "Sorry, try for the next time"
fi