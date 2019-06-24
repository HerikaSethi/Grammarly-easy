# Grammarly-easy
Java project - generates Gramatically correct sentences with the help of math.random function. This Project helps understand the use of grammatically correct sentences.
The program makes three lists of words, then randomly picks one word from each of the threee lists, and prints out the result.
(For easy understanding reference is taken of only three string arrays here)

1. The first step is to create three string arrays - the containers that will hold all the words. Declaring and creating an array is easy; here's small one :
String[] pets = {"blue","green","orange"}
Each word is saperated by commas.

2. For each of the three lists(array), goal is to pick a random word, so we have to know how many words are there in each list. If there are forteen words in a list, then we need a random number between 0 and 13(java arrays are zero based, so first word is at position zero, the second word at position one and last word at position thirteen in a forteen element array).

Also we can easily know the length of the given array.
Eg: In the pet array, 
int x = pets.length;
and x would hold value of three.

3. The random() method returns a random umber between 0 and not quite-1, so we have to multiply it by the number of elements (i.e, the length of array) in the list we're using.

We have to force the result to be an Integer (no decimals allowed!) so we put in a cast. It's the same as if we had any floating point number and we wanted to convert it to Integer:
int x = (int)24.6;

4. Now we get to build the phrase, by picking a word from each of the three lists, and smooshing them(also inserting spaces between words). We use '+' operator for concatenation of two or more strings together. To get an element from an array, you give the array the Index number(position) of the thing you want using.

5. Finally, we print the phrase using System.out.println("");
