public class MazeRecursion1 {
    public static void main(String[] args) {
        //mazePath("", 3, 3);   

        boolean[] [] maze={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };

        mazePathRestrication("", maze,0, 0);
    }
    
    static void mazePath(String p,int r,int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(p);
            return;
        }

        if(r>1)
        {
            mazePath(p+"D", r-1, c);
        }
        if(c>1)
        {
            mazePath(p+"H", r, c-1);
        }
    }

    static void mazePathRestrication(String p,boolean[][] maze,int r,int c)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
          if(maze[r][c]==false)
          {
            return;
          }
        if(r<maze.length-1)
        {
            mazePathRestrication(p+"D",maze, r+1, c);
        }
        if(c<maze[0].length-1)
        {
            mazePathRestrication(p+"H",maze, r, c+1);
        }
    }

}