package Assignment2.classwork.task4;

public class CellPhone {
    String model;
    int contactcount;
    String contacts[] = new String[3];

    public void printDetails(){
        System.out.println("phone model: " + model);
        System.out.println("Contacts stored: " + contactcount);
        System.out.println("Stored Contacts:");
        for(int i = 0; i < contactcount; i++){
            System.out.println(contacts[i]);
        }
    }
    public void storeContact(String contact){
        if(contactcount < contacts.length){
            contacts[contactcount] = contact;
            contactcount++;
            System.out.println("Contact stored");
        } else {
            System.out.println("Memory full. New contact can't be stored.");
        }   

    }
}



// public class Tester4{
//   public static void main(String[]args){
//      CellPhone phone1 = new CellPhone();
//      phone1.printDetails();
//      phone1.model ="Nokia 1100";
//      System.out.println("1##################");
//      phone1.storeContact("Joy - 01834");
//      System.out.println("===================");
//      phone1.printDetails();
//      System.out.println("2##################");
//      phone1.storeContact("Toya - 01334");
//      phone1.storeContact("Aayan - 01135");
//      System.out.println("===================");
//      phone1.printDetails();
//      System.out.println("3##################");
//      phone1.storeContact("Sani - 01441");
//      System.out.println("===================");
//      phone1.printDetails();  
//   }
// }

