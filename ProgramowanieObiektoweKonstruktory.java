package programowanieobiektowe;

/**
 *
 * @author Shabbadoo
 */
public class ProgramowanieObiektowe {

    public static void main(String[] args) {
                

        Punkt p = new Punkt(10, 155);
        
        Punkt p2 = new Punkt(10, 45);
        
        System.out.println("p.x " + p.x);
        System.out.println("p.y "+ p.y);
        
        System.out.println("p2.x " + p2.x);
        System.out.println("p2.y "+ p2.y);
        
    }
    
}

class Punkt
{
    Punkt()
    {
        System.out.println("Wywołano konstruktor domyślny");
    }
    Punkt(int x, int y)
    {
        System.out.println("Wywołano konstruktor z dwoma parametrami");
        
        this.x = x;
        this.y = y;
    }
    int x;
    int y;
    
}
