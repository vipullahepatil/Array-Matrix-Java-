import java.util.*;
class Array2
{
	static int[][] createArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array row no:");
		int x=sc.nextInt();
		System.out.println("Enter array col no:");
		int y=sc.nextInt();
		int a[][]=new int[x][y];
		
		System.out.println("Enter "+(x*y)+" no:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		return a;
	}
	
	static void viewArray(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void multiArray(int a[][],int b[][])
	{
		
		int c[][]=new int [a.length][b[0].length];
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=0;
				for(int k=0;k<b[0].length;k++)
				{
					c[i][j]= c[i][j]+(a[i][k]*b[k][j]);
				}
			}
		}
		System.out.println("mul of array is :");
		viewArray(c);		
	}
	static void addArray(int a[][],int b[][])
	{
		int c[][]=new int [a.length][b[0].length];
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=0;
				for(int k=0;k<b[0].length;k++)
				{
					c[i][j]= c[i][j]+(a[i][k]+b[k][j]);
				}
			}
		}
		System.out.println("add of array is :");
		viewArray(c);			
	}
	
	static void subArray(int a[][],int b[][])
	{
		int c[][]=new int [a.length][b[0].length];
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=0;
				for(int k=0;k<b[0].length;k++)
				{
					c[i][j]= c[i][j]+(a[i][k]-b[k][j]);
				}
			}
		}
		System.out.println("sub of array is :");
		viewArray(c);		
	}
	
	static void divArray(int a[][],int b[][])
	{
		int c[][]=new int [a.length][b[0].length];
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=0;
				for(int k=0;k<b[0].length;k++)
				{
					c[i][j]= c[i][j]+(a[i][k]/b[k][j]);
				}
			}
		}
		System.out.println("Div of array is :");
		viewArray(c);
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int arr[][]=createArray();
		int brr[][]=createArray();
		while(true)
		{
			System.out.println("menucard");
			System.out.println("Enter 1.view array arr");
			System.out.println("Enter 2.view array brr");
			System.out.println("Enter 3.arthmatic operation on array");
			System.out.println("Enter 4.Exit");
			int n=sc.nextInt();
			switch(n)
			{
				case 1:
					viewArray(arr);
					break;
				case 2:
					viewArray(brr);
					break;
				case 3:
					System.out.println("Enter 1.Multiplication of array");
					System.out.println("Enter 2.Division of array");
					System.out.println("Enter 3.Addition of array");
					System.out.println("Enter 4.Subtration of array");
					int m=sc.nextInt();
					switch(m)
					{
						case 1:
							multiArray(arr,brr);
							break;
						case 2:
							divArray(arr,brr);
							break;
						case 3:
							addArray(arr,brr);
							break;
						case 4:
							subArray(arr,brr);
							break;
						default:
							System.out.println("Invalid Entry");
							break;
					}
					break;
				case 4:
					System.exit(0);
				default:
							System.out.println("Invalid Entry");
							break;
			}
		}
	}
}