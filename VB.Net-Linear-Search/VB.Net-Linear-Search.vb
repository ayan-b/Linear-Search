Imports System

Public Class Test
	Public Shared Sub Main()
		
		Dim n,x,i,pos,flag as Integer
		Dim a(1000) as Integer
		
		Console.Write("Enter the number of elements in array: ")
		n = Console.ReadLine
		Console.WriteLine("{0} ", n)
		
		Console.Write("Enter {0} integer(s): ", n)
		for i=0 to n-1
			a(i) = Console.ReadLine
		next
		for i=0 to n-1
			Console.Write("{0} ", a(i))
		next
		Console.WriteLine()
		
		Console.Write("Enter a number to search: ")
		x = Console.ReadLine
		Console.WriteLine("{0} ", x)
		
		flag=0
		
		for i=0 to n-1
			if (x = a(i)) then
				flag = 1
				pos = i
				exit for
			end if
		next
		
		if (flag = 1) then
			Console.WriteLine("Number found at index: {0}", pos)
		else
			Console.WriteLine("Number not found")
		end if
		
	End Sub
End Class
