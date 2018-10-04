const readline = require('readline')

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
})

rl.question('Type the array elements, ie: 12345 ', (elements) => {
  rl.question('Type the element to search ', (n) => {
    const l = elements.length
    const found = linearSearch(elements.split(''), n)
    console.log(found > -1 ? `Element found at ${(l-found)}` : `No element found`)
    rl.close();
  })
})

const linearSearch = (arr, n) => {
  return arr.length ? (arr[0] === n ? arr.length : linearSearch(arr.slice(1), n)) : -1
}

