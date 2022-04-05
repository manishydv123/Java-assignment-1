import java.io.*;
class reverse
{
 public static void main(String args[]) throws java.io.IOException
 {
  DataInputStream ds = new DataInputStream(System.in);
  System.out.print("\nEnter line which u want to print reverse := ");
  String str1 = ds.readLine();
  String str=str1+" ";
  System.out.print("\n");
  System.out.print("Entered String:= " + str);
  int n=str.length();
  System.out.println("");
  int k=0,index=-1;
  char arr1[]=new char[n+3];
      for(int i=0;i<n;i++)
  {
      if(str.charAt(i)== 32)
   {
   for(int j=i;j>=k;j--)
    {
     index++;
     arr1[index]=str.charAt(j);
    }
     k=i+1;    
   }
  }
  System.out.print("\nReverse String is:--->");
  for(int i=0;i<n;i++)
  {
   System.out.print(arr1[i]);
  }
  arr1[index+1] = ' ';
   System.out.println("\n\n");
  k=0;
  for(int i=0;i<=n;i++)
  {
   if(arr1[i]==32)
   {
    for(int l=k;l<=i;l++)
    {
     for(int j=l+1;j<=i;j++)
     {
      if(arr1[l] > arr1[j])
      {
       char t=arr1[l];
           arr1[l]=arr1[j];
           arr1[j]=t;
      }        
     }
   }
    k=i+1;  
   }
  }
  System.out.print("\n Ascending order:=");
  for(int i=0;i<=n;i++)
  {
   System.out.print(arr1[i]);
  }
 } 
}