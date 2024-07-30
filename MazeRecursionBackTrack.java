import java.util.*;
public class MazeRecursionBackTrack {

    public static void main(String[] args)
    {
        boolean[][] maze={
            {true,true,true},
            {true,true,true},
            {true,true,true},
            };
       //back("", maze, 0, 0);

       int[][] path= new int[maze.length][maze[0].length];

          backret("", maze, 0, 0, path, 1);

    }
    static  void back(String s,boolean[][] maze,int r,int c)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(s);
            return;
        }
        if(!maze[r][c])
        {
            return;
        }
   
        maze[r][c]=false;
        

        if(r<maze.length-1)
        {
            back(s+"D", maze, r+1, c);

        }
        if(c<maze[0].length-1)
        {
            back(s+"R", maze, r, c+1);
            
        }
        if(r>0)
        {
            back(s+"U", maze, r-1, c);
            
        }
        if(c>0)
        {
            back(s+"L", maze, r, c-1);
            
        }

        //this line is where the function will be over
        //so before function gets removed ,also remove the changes made by that function
           maze[r][c]=true;
           
        }
        static  void backret(String s,boolean[][] maze,int r,int c,int[][] path,int step)
        {
            if(r==maze.length-1 && c==maze[0].length-1)
            { 
                path[r][c]=step;
                for (int[] arr : path) {
                    System.out.println(Arrays.toString(arr));
                
              }
              System.out.println(s);
        System.out.println();
                return;
            }
            if(!maze[r][c])
            {
                return;
            }
       
            maze[r][c]=false;
            
            path[r][c]=step;
            if(r<maze.length-1)
            {
                backret(s+"D", maze, r+1, c,path,step+1);
            }
            if(c<maze[0].length-1)
            {
                backret(s+"R", maze, r, c+1,path,step+1);
                
            }
            if(r>0)
            {
                backret(s+"U", maze, r-1, c,path,step+1);
                
            }
            if(c>0)
            {
                backret(s+"L", maze, r, c-1,path,step+1);
                
            }
    
            //this line is where the function will be over
            //so before function gets removed ,also remove the changes made by that function
               maze[r][c]=true;
               
                path[r][c]=0;
               
            }
}
