import java.util.Scanner;

public class DeliveryAlgorithm {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = "Do you want to calculate for another delivery(Yes/No)?";
        String repeat = "";
        int deliveryCharge;
        
        while (!repeat.equalsIgnoreCase("no")){
            System.out.print("Please provide the weight of your parcel [0-5kg]: ");
            double packageWeight = scanner.nextDouble();
            
            if (packageWeight <= 5.0 && packageWeight > 0){
                System.out.print("Please provide a 6-digit postal code for pickup: ");
                // pickupPC = Pickup Postal Code
                int pickupPC = scanner.nextInt();
                boolean pickupInCBD;
                
                while (pickupPC <= 9999){
                    System.out.println("The postal code you provided was invalid.");
                    System.out.print("Please provide a valid postal code for pickup: ");
                    pickupPC = scanner.nextInt();
                }
              
                if(pickupPC >= 10000 && pickupPC < 90000 || pickupPC >= 170000 && pickupPC < 200000 
                        || pickupPC >= 220000 && pickupPC < 240000)
                    pickupInCBD = true;
                else
                    pickupInCBD = false;
                 
                System.out.print("Please provide a 6-digit postal code for delivery: ");
                //deliveryPC = Pickup Postal Code
                int deliveryPC = scanner.nextInt();
                boolean deliveryInCBD;
        
                while (deliveryPC <= 9999){
                    System.out.print("Invalid, please provide valid postal code: ");
                    deliveryPC = scanner.nextInt();   
                }
                
                if(deliveryPC >= 10000 && deliveryPC < 90000 || 
                        deliveryPC >= 170000 && deliveryPC < 200000 || 
                        deliveryPC >= 220000 && deliveryPC < 240000)
                    deliveryInCBD = true;
                else
                    deliveryInCBD = false;
       
                if (pickupInCBD == true && deliveryInCBD == true){
                    deliveryCharge = 15;
                    System.out.println("Delivery Cost: $" + deliveryCharge);
                }
                else if (pickupInCBD == false && deliveryInCBD == false){
                    deliveryCharge = 25;
                    System.out.println("Delivery Cost: $" +deliveryCharge);
                }
                else {
                    deliveryCharge = 20;
                    System.out.println("Delivery Cost: $" +deliveryCharge);
                }
            }
  
            else {
                System.out.println("Invalid Weight. Cannot proceed with delivery.");
            }
                 
          while (true){
              System.out.println(message);
              repeat = scanner.next(); 
              if (repeat.equalsIgnoreCase("yes") || repeat.equalsIgnoreCase("no")) {
                  break;}
              else {
                  System.out.println("Invalid answer. Please enter 'yes' or 'no'.");
              }    
         }
      }
   }               
}
        
      


        
