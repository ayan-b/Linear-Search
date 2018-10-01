# Linear Search in bash

Ignore the `set` line, and the definitions of `log` and `die`; they are fairly
standard boilerplate lines.

The search itself happens in `search`: we iterate through the array's indices,
stopping when we find the key. If we don't, we return a sentinel value.

NB This is not likely to be of true use; idiomatic bash very rarely demands
specific indices.

`main` then sets up the parameters (making sure they were given), calls our
search function, and handles output.

### Run

```bash
$ ./bash-Linear-Search/linsearch {key} {array}
```

- `key` should be a single shell-word
- `array` should be a (possibly empty) list of shell-words

Pay attention to the way certain shells split words and parse input!
