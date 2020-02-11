#Submission

##Thought Process

1. get the String
2. Convert into a char array to process it.
3. you set up three counters to count the number of items that are similar and the total of all items.
4. you use a for each loop to go through every character.
5. if the character matches, you increment the counter of everyItem.
6. increment total by the price of every item
7. if the item has discount you apply the discount, the discount changes depending of the item, and reset the counter. else you process the next character(item).
8.once every character is processed you return the total price.

##Possible Improvements. 
- The first improvement would be to refactor the code by creating a function that calculates the discount for every item.
- I tried to refactor it, but the counter variable was getting lost, I thought of returning a pair using generics to get the value of the total and the reset value of the counter.
- The reason of why I used and array is because java has a method that converts it into a char array, but in terms of larger applications where the array needs to be expanded a Vector might be better.
- At first I tought of using a HashMap where the key is the character and the value is the total price, and then retrieve it from it, but due to time constrains I could not implement it.

- 