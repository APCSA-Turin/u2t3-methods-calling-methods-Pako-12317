public class Letter {
    // instance variables
    String name;

    public Letter(String name) { 
        this.name = name;
    }
    
    public void writeLetter(String name) {
        greeting(name);
        specialMessage();
        closing();
        sign();
    }

    public void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void specialMessage() {
        System.out.println("Java is pretty cool, wouldn't you say?");
    }

    public void closing() {
        System.out.println("See you later!");
    }

    public void sign() {
        System.out.println("From, "+name);
    }
}
