public class Elephant extends Animal {
    public Elephant(){
        super(5);
    }

    public static void main(String[] args){
        Elephant el = new Elephant();
        System.out.println("Elephant has, age: " + el.getAge());
    }
}
