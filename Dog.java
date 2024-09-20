public class Dog {
    String name;
    boolean isMale;
    int numofpuppies;
    Dog[] doggo;

    public Dog(String name) {
        this.name = name;
        this.numofpuppies = 0;
        doggo = new Dog[0];
    }

    public void setName(String name) {
        this.name = name;
    }

    public String showName() {
        return "Dog's name is: " + name;
    }

    public void bark() {
        System.out.println("woof! woof!");
    }

    public void setNumberOfPuppies(int numofpuppies) {
        this.numofpuppies = numofpuppies;
    }

    public int showNumberOfPuppies() {
        return numofpuppies;
    }

    public void setPuppies(Dog[] puppies) {
        this.doggo = doggo;
    }

    public String Dog.showPuppies() {
        for(Dog puppy : doggo) {
            System.out.println(puppy.showName());
        }
    }

    public String dogname() {
        return name;
    }

    public int numofpuppies() {
        return numofpuppies;
    }
}
