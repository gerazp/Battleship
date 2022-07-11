
public class Tile {
     
    
    char [] playerboard ;
    
    playerboard = new int[7][7];
    
    for (int i=0;i<playerboard.length;i++) 
    {
    for (int j=0;j<playerboard.length;j++) 
    {
           
    enum typos
    {
        Sea,Ship,Hit,Miss;
    }
     public void draw()
    { 
    if (typos = Sea) 
     playerboard [i] [j] = "~";
     System.out.println("~");
     else if (typos = Ship) 
      playerboard [i] [j] = "s";
      System.out.println("s");
      else if (typos = Hit)
       playerboard [i] [j] = "X";
       System.out.println("X");
       else 
        playerboard [i] [j] = "o";
        System.out.println("o");
    }   
}
}   
     
    
    
    