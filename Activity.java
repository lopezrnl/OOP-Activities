public class Activity { 
    public static void main(String[] args) { 
        Dog awaw = new Dog();
        awaw.name = "Dido"; 
        awaw.puppies = 4; 
        awaw.isMale = true; 

        awaw.doggo[0] = "Batangas City";
        awaw.doggo[1] = "Hanabishi";
        awaw.doggo[2] = "ID Lace";
        awaw.doggo[3] = "Coby";

        System.out.println(awaw.dogname()); 
        System.out.println("woof! woof!"); 
        System.out.println(awaw.numofpuppies()); 

        for (int i = 0; i < 4; i++) { 
            System.out.println(awaw.doggo[i]); 
        }
        System.out.println("All information about the dog has been displayed successfully."); 
    }
}
