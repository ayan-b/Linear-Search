# javascript-linear-search

Make a linear search through an array using javascript and write to the current webpage if the element being searched for was found or not. Prompts are made to the user via the prompt command. User will first define how large of an array to create. User will then define the array to search through and the element to search for. Position found is output in a 0-based index format (i.e. position 3 is the 4th element). Note: this will overwrite all HTML on the page. To run the code simply set the command to an HTML button click command or in the console copy the javascript and type `linear();`

Example:

```javascript
// user will normally enter array data via prompt. This is just to demonstrate.
const array = [0,4,2,6,11,8,3,9,5];
const searchEl = 11;
// output: Element 11 found at position 3
```

Another implementation using prototype
```javascript
const myArray = [1, 2, 3, 4, 5];
myArray.linearSearch(3);
```