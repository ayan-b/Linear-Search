Module LinSearchFunc

    Sub Main()
        Console.WriteLine("Linear Searching using Function")
        Console.WriteLine()
        Dim n, i, k, item As Integer
        Console.Write("Enter Number of Elements: ")
        n = CInt(Console.ReadLine)
        Dim arr(n) As Integer
        Console.WriteLine()
        For i = 0 To n - 1
            Console.Write("Enter Element(" & (i + 1) & "): ")
            arr(i) = CInt(Console.ReadLine)
        Next
        Console.WriteLine()
        Console.WriteLine("Before Sorting")
        Console.WriteLine()
        For i = 0 To n - 1
            Console.WriteLine("Element in (" & i & "): " & arr(i))
        Next

        Console.WriteLine()
        Console.Write("Enter the Element to be searched:")
        item = CInt(Console.ReadLine())
        k = linear_search(arr, n, item)
        Console.WriteLine()
        If k <> -1 Then
            Console.WriteLine("Element is Found")
        Else
            Console.WriteLine("Element is Not Found ")
        End If
        Console.ReadLine()
    End Sub
function linear_search(byval x() as integer,byval y as integer,byval z as integer)
        Dim j As Integer
        For j = 0 To y - 1
            If x(j) = z Then
                Return j
            End If
        Next
        Return -1
    End Function
End Module
