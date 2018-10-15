# fsharp-linear-search
*Example Linear Search in F#*

1) Locate your fsi executable - on Windows, something like `C:\Program Files (x86)\Microsoft SDKs\F#\10.1\Framework\v4.0\fsi.exe`
2) Run that executable from the command line with the its argument being the location of this fsharp-linear-search.fsx file, the second being the value that you are searching for, and the rest of your list of elements as the rest of the arguments.  

For example:
```
& 'C:\Program Files (x86)\Microsoft SDKs\F#\10.1\Framework\v4.0\fsi.exe' .\fsharp-l
inear-search.fsx 10 0 1 2 3 4
```
will produce the result `Not Found!` because 10 is not in the list of 1 2 3 4 5 6, but 

```
& 'C:\Program Files (x86)\Microsoft SDKs\F#\10.1\Framework\v4.0\fsi.exe' .\fsharp-l
inear-search.fsx 2 0 1 2 3 4
```

will produce the result `2 found at index 2` because it is in the list