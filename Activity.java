public class Activity {
    public static void main(String[] args) {
        Dog awaw = new Dog("");

        awaw.setName("Dido");
        awaw.setNumberOfPuppies(4);
        awaw.isMale = true; 
 
        Dog doggo1 = new Dog("Batangas City");
        Dog doggo2 = new Dog("Hanabshi");
        Dog doggo3 = new Dog("ID Lace");
        Dog doggo4 = new Dog("Coby");

        Dog[] doggo = {doggo1, doggo2, doggo3, doggo4};

        System.out.println(awaw.showName());
        awaw.bark();
        System.out.println(awaw.showNumberOfPuppies());

        System.out.println(awaw.showPuppies());

        System.out.println("All information about the dog has been displayed successfully.");
    }
}

