const linearSearch = (arr, n) => {
  return arr.length ? arr[0] === n || linearSearch(arr.slice(1), n) : false
}
