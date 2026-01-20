import java.util.Scanner;                                                                                
                                                                                                         
public class LibraryApp {                                                                                
                                                                                                         
    public static void main(String[] args) {                                                             
        // Scanner to read what the user types                                                           
        Scanner scanner = new Scanner(System.in);                                                        
                                                                                                         
        // Create the library catalog                                                                    
        LibraryCatalog<String> myLibrary = new LibraryCatalog<>();                                       
                                                                                                         
        boolean running = true;                                                                          
                                                                                                         
        // Start the menu loop                                                                           
        while (running) {                                                                                
            System.out.println("\n=== Library Menu ===");                                                
            System.out.println("1. Add Item");                                                           
            System.out.println("2. Remove Item");                                                        
            System.out.println("3. View Catalog");                                                       
            System.out.println("4. Exit");                                                               
            System.out.print("Choose an option: ");                                                      
                                                                                                         
            String choice = scanner.nextLine();                                                          
                                                                                                         
            switch (choice) {                                                                            
                case "1":                                                                                
                    // Get item details from user                                                        
                    System.out.print("Enter Title: ");                                                   
                    String title = scanner.nextLine();                                                   
                    System.out.print("Enter Author: ");                                                  
                    String author = scanner.nextLine();                                                  
                    System.out.print("Enter ID: ");                                                      
                    String id = scanner.nextLine();                                                      
                                                                                                         
                    // Create and add the new item                                                       
                    LibraryItem<String> newItem = new LibraryItem<>(title, author, id);                  
                    myLibrary.addItem(newItem);                                                          
                    break;                                                                               
                                                                                                         
                case "2":                                                                                
                    // Remove item logic                                                                 
                    System.out.print("Enter ID to remove: ");                                            
                    String removeId = scanner.nextLine();                                                
                    myLibrary.removeItem(removeId);                                                      
                    break;                                                                               
                                                                                                         
                case "3":                                                                                
                    // Show everything                                                                   
                    myLibrary.viewCatalog();                                                             
                    break;                                                                               
                                                                                                         
                case "4":                                                                                
                    // Stop the loop                                                                     
                    running = false;                                                                     
                    System.out.println("Exiting...");                                                    
                    break;                                                                               
                                                                                                         
                default:                                                                                 
                    System.out.println("Invalid option. Try again.");                                    
            }                                                                                            
        }                                                                                                
        scanner.close();                                                                                 
    }                                                                                                    
}                       
