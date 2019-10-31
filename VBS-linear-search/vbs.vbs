arr=Array(5,10,15,20,32)
For i = 0 To UBound(arr)
		  If arr(i) = 32 Then
			  Wscript.Echo "Successful search!"
			  Exit For
		  End If
	  Next
