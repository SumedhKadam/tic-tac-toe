

//package tictactoe;

import java.util.*;
import java.io.*;
 class Tictactoe
    {
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	char board[][] = new char[3][3];
    	int i,j;
    	int count = 0;
    	int row,column,flagx=0,flago=0;
    	int xcount=0,ocount=0;
    	for(i=0;i<3;i++)
    	{
    		for(j=0;j<3;j++)
    		{
    			board[i][j] = '-';
    		}
    	}
    	System.out.println("Initial state:");
    	for(i=0;i<3;i++)
    	{
    		for(j=0;j<3;j++)
    		{
    			System.out.print(board[i][j] + "\t");
    		}
    		System.out.println();
    	}
    	
        while(count < 9)
        {
        	System.out.println("Enter row number");
        	row = sc.nextInt();
        	System.out.println("Enter column number");
        	column = sc.nextInt();
        	if(count%2 == 0)
        	{
        		board[row-1][column-1] = 'x';
        	}
        	else
        	{
        		board[row-1][column-1] = 'o';
        	}
        	for(i=0;i<3;i++)
    		{
    		for(j=0;j<3;j++)
    		{
    			System.out.print(board[i][j] + "\t");
    		}
    		System.out.println();
    		}
    		
    		
    		for(i=0;i<3;i++)
    		{
    			xcount = 0;
    			ocount = 0;
    			for(j=0;j<3;j++)
    			{
    				if(board[i][j] == 'x')
    				{
    					xcount += 1;
    				}
    				else if(board[i][j] == 'o')
    				{
    					ocount += 1;
    				}
    				else{
    				}
    			
    			}
    			if(xcount == 3)
    			{
    				flagx = 1;
    			}
    			else if(ocount == 3)
    			{
    				flago = 1;
    			}
    			else{
    			}
    		}
    		
    		
    		for(i=0;i<3;i++)
    		{
    			xcount = 0;
    			ocount = 0;
    			for(j=0;j<3;j++)
    			{
    				if(board[j][i] == 'x')
    				{
    					xcount += 1;
    				}
    				else if(board[j][i] == 'o')
    				{
    					ocount += 1;
    				}
    				else{
    				}
    				
    			}
    			if(xcount == 3)
    			{
    				flagx = 1;
    			}
    			else if(ocount == 3)
    			{
    				flago = 1;
    			}
    			else{
    			}
    		}
    		
    		xcount = 0;
    		ocount = 0;
    		for(i=0;i<3;i++)
    		{
    			if(board[i][i] == 'x')
    			{
    				xcount += 1;
    			}
    			else if(board[i][i] == 'o')
    			{
    				ocount += 1;
    			}
    			else{
    			}
    		}
    		if(xcount == 3)
    		{
    			flagx = 1;
    		}
    		else if(ocount == 3)
    		{
    			flago = 1;
    		}
    		else{
    		}
    		xcount = 0;
    		ocount = 0;
    		
    		for(i=0;i<3;i++)
    		{
    			if(board[i][2-i] == 'x')
    			{
    				xcount += 1;
    			}
    			else if(board[i][2-i] == 'o')
    			{
    				ocount += 1;
    			}
    		}
    		
    		if(xcount == 3)
    		{
    			flagx = 1;
    		}
    		else if(ocount == 3)
    		{
    			flago = 1;
    		}
    		
    		count += 1;
    		if(flagx == 1 || flago ==1)
    			break;
    	}
    	
    	if(flagx == 1)
    	{
    			System.out.println("Player 1 won");
    	}
    	else if(flago == 1)
    	{
    		System.out.println("Player 2 won");
    	}
    		
    	else
    	{
    			System.out.println("Match draw");	
    	}
    	}
    	
}
