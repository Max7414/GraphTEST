package gpTEST;

import java.util.*;
public class gpt {

	public static void main(String[] args) {
		int[][] maze = new int [7][7];
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				maze[i][j] = 0;
			}
		}
		maze[0][1] = 4;
		maze[1][4] = 3;
		maze[0][2] = 2;
		maze[2][3] = 2;
		maze[2][5] = 4;
		maze[3][4] = 1;
		maze[3][5] = 3;
		maze[4][5] = 1;
		
		maze[1][0] = 4;
		maze[4][1] = 3;
		maze[2][0] = 2;
		maze[3][2] = 2;
		maze[5][2] = 4;

		maze[4][3] = 1;
		maze[5][3] = 3;
		maze[5][4] = 1;
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(0);
		int[] visited = new int[99];
		
		int[][] table = new int [6][1];
		for(int i=0;i<6;i++){
			table[i][1]=999;
		}
		
		
		visited[0]=1;
		while(!q.isEmpty()) {
			int top = q.remove();
			
			
		}
		
		
		
	}

}
