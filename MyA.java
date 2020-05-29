package ClassA;
import ClassB.MyB;

public class MyA {
    private String myString;

    public MyA() {
        myString = "Default";
    }

    public String getString() {
        return this.myString;
    }
    
    public void setString(String input) {
        this.myString = input;
    }

    public static void main(String[] args) {
        System.out.println("Bonjour");
        
        MyA instanceA = new MyA();
        MyB instanceB = new MyB();
        
        instanceA.setString("Bonjour la Classe ");
        System.out.println(instanceA.getString()); // Prend la valeur Bonjour la classe
        System.out.println(instanceB.getString()); // Grade la valeur default attribué dans le constructeur
        
        System.out.println();
        System.out.println();
        
        String monPointer = instanceB.getString(); // Prend la valeur de instance B puis on y ajoute une string
        monPointer += "Petite modification"; // On obtient bien comme valeur default From BPetite modification
        MyB testPointer = instanceB; // On crée une instance égale à l'instance qu'on veut modifier
        testPointer.setString("On modifie totalement B"); //En modifiant testPointer on voit que les résultat se répercutent sur instance B ( Pointeur implicite en Java)
        
        System.out.println(instanceA.getString());
        System.out.println(instanceB.getString());
             
        System.out.println();
        System.out.println();
        
        System.out.println(monPointer);
        System.out.println(testPointer.getString());
        System.out.println(instanceB.getString());
        
        System.out.println();
        System.out.println();
    }
}