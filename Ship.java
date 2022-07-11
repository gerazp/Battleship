
abstract public class Ship {
    int i;
    int j;
    enum orientation{Straight,down}
    int size;
    
    System.out.println("give me coordinates for ship placement")
    i = input.nextInt();
    j = input.nextInt();
    
    System.out.println("give me orientation")
    orientation = input.nextInt();
    
    System.out.println("given the size of ship")
    size = input.nextInt();


    

     abstract function  placeship();