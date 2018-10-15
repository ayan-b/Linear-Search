function linear () {
  let n = parseInt(prompt('Enter the size of an array'))
  let a = []
  for (let i = 0; i < n; i++) {
    a[i] = parseInt(prompt('Current array:\t' + a + '\nEnter array elements'))
  }
  let k = parseInt(prompt('Current array:\t' + a + '\nEnter the key element to search: '))
  for (let i = 0; i < a.length; i++) {
    if (k === a[i]) {
      // document.body.innerText('');
      document.writeln('Element ' + a[i] + ' Found at Position:' + i)
      break
    } else if (i === (a.length - 1) && k !== a[i]) {
      // document.body.innerText('');
      document.writeln('Element Not Found')
    }
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
