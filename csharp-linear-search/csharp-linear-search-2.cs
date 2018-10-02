using System;

class Program
{
    static void Main()
    {
        //Declaring variables
        string inp;
        int len, val, res;
        int[] arr;
        
        Console.Write("Enter the length of array: ");
        inp = Console.ReadLine();
        len = Convert.ToInt32(inp);

        arr = new int[len];
        
        //taking array elements as input one by one
        for (int i=0; i<len; i++)
        {
            Console.Write("Enter element {0}: ", i+1);
            inp = Console.ReadLine();
            arr[i] = Convert.ToInt32(inp);
        }

        Console.WriteLine("Your array is: ");
        
        for (int i=0; i<len; i++)
        {
            Console.Write("{0} ", Convert.ToString(arr[i]));
        }
        Console.WriteLine("\nEnter element to search in array");
        inp = Console.ReadLine();
        val = Convert.ToInt32(inp);
        
        res = linearSearch(arr, val);

        if (res != -1)        
        {
            Console.WriteLine("Result: Yes, the array contains the value {0} at index {1}", val, res);
        }
        else
        {
            Console.WriteLine("Result: No, the array does not contain the value {0}", val);
        }
        Console.WriteLine("Good Bye!");
    }

    //main Linear Search function
    static int linearSearch (int[] arr, int val)
    {
        int len = arr.Length;
        for (int i=0; i<len; i++)
        {
            if (arr[i] == val)
            {
                // if element is found in array, return 1
                return (i+1);
            }
        }
        // if the whole array is traversed but the element was not found, return -1
        return -1;
    }
}
