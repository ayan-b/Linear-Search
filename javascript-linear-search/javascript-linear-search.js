function linear () {
  let n = parseInt(prompt('Enter the size of an array'))
  let t = 0
  const a = new Array(n)
  for (let i = 0; i < a.length; i++) {
    a[i] = parseInt(prompt('Enter array elements'))
  }
  const k = parseInt(prompt('Enter the key element to search: '))
  for (let i = 0; i < a.length; i++) {
    if (k === a[i]) {
      t = 1
      break
    }
  }
  if (t == 1) {
    document.writeln('Element ' + a[i] + ' Found at Position:' + i)
  } else {
    document.writeln('Element Not Found')
  }
}
const nums = [1, 2, 3, 8, 9, 12]
const target = 2
for (const num of nums) {
  if (num === target) {
    console.log('Successful Search!')
    break
  }
}
