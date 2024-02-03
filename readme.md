1. Write a function that takes in a list of integers as an argument
and returns true if it contains two integers that are the same, false
otherwise.


for the nested loop solution - you would write a function that takes in a list of ints
and you would type for i in list loop through the list and check if there are two of the same ints.
true or false based on the status of the list. with this way its a pretty standard way of going about the
problem and i think you have more freedom of handling how the output goes because you dont have to 
set it to true or false you can create try catch or error handling to make the user input a different
number and such.although, it would be less effiecent if you had a bigger dataset.

set or map solution- to my understanding set and map go hand in hand or at least in python they do.
so in this case you would map the the list of ints and and since with set you cannot have two of the same
you would then call set on the array (or wherevr your ints are stored) and it would return true or false
based on if you have the two of the same ints.trade offs for this would be this would be the fun way of doing it
also if you have 3 or more of the same int im not sure how the set would handle that. With this solution it would
automatically remove duplicates.

overall trade offs: the nested loop gives you more control but less effiecent if you have a big dataset.
the set or map solution is short and sweet but not really customizable. 

Let's open up our readme.md file again and under question one, let's describe the two different solutions in english.
The first solution is the nested loop solution. The second solution is to use a set or a map as I described in class. Describe both in as much detail
as you can (with no code) and describe the trade-offs between the two solutions.
Now let's commit our code. Note that as long as you're on the correct branch, all git
operations will happen on that branch. Maybe check you're on the correct branch one more time? Once you're confident, add and commit your changes.

