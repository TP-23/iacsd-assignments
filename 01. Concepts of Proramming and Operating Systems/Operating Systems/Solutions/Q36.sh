#!/bin/bash
read -p " Enter starting Range:" n


for (( i=1;i<=n;i++ ))
do  
     a=0
     for (( j=1;j<=(n-i);j++ ))
     do
        echo -n " "
     done
     for (( k=0;k<(i*2-1);k++))
     do
       
       if ((k<=(i*2-1)/2))
       then
           
          a=$((a+1))
          echo -n "$a"
          
          
       else
          a=$((a-1))
          echo -n "$a"
          
       fi 
     done
     echo
done
