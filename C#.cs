using System.IO;
using System;

class Program
{
    static void Main()
    {
    int i,a,count = 0;
    for(i = 1;i <= 5;i++)
    {
        a = Convert.ToInt32(Console.ReadLine());
    if(a % 2 == 0)
    {
        count = count + 1;
    }
    }   
    Console.WriteLine(count +" valores pares");
    Console.ReadLine();
    }
}

 
