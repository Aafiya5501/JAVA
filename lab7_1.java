abstract class Vegetable{
    String color;
    String VegeName;
    public Vegetable(String color,String Vegename){
        this.color=color;
        this.VegeName=VegeName;
    }

   public String toString(){
    return color+" "+VegeName;
   }
} 
class Potato extends Vegetable{
    public Potato(String color){
        super(color,"Potato");
    }
    
}
class Brinjal extends Vegetable{
public Brinjal(String color){
    super(color,"brinjal");
}

}
    
 class Tomato extends Vegetable{
    public Tomato(String color){
        super(color,"tomato");
    }
    
   

public class lab7_1 {
    public static void main(String[] args) {
          potato=new potato("brown");
        

        
    }
}
