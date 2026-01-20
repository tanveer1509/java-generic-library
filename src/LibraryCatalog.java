import java.util.ArrayList;                                                                              
import java.util.List;                                                                                   
                                                                                                         
public class LibraryCatalog<T> {                                                                         
                                                                                                         
	// List to store the library items                                                                   
	private List<LibraryItem<T>> catalogItems;                                                           
                                                                                                         
	// Constructor                                                                                       
	public LibraryCatalog() {                                                                            
		this.catalogItems = new ArrayList<>();                                                           
	}                                                                                                    
                                                                                                         
	// Add item method                                                                                   
	public void addItem(LibraryItem<T> item) {                                                           
		catalogItems.add(item);                                                                          
		System.out.println("Item added: " + item.getTitle());                                            
	}                                                                                                    
                                                                                                         
	// Remove item by its ID                                                                             
	public void removeItem(T itemID) {                                                                   
		LibraryItem<T> itemToRemove = null;                                                              
                                                                                                         
		// Search for the item                                                                           
		for (LibraryItem<T> item : catalogItems) {                                                       
			if (item.getItemID().equals(itemID)) {                                                       
				itemToRemove = item;                                                                     
				break;                                                                                   
			}                                                                                            
		}                                                                                                
                                                                                                         
		// Check if item was found                                                                       
		if (itemToRemove != null) {                                                                      
			catalogItems.remove(itemToRemove);                                                           
			System.out.println("Item removed: ID " + itemID);                                            
		} else {                                                                                         
			// Error message if ID doesn't exist                                                         
			System.out.println("Error: Item ID " + itemID + " not found.");                              
		}                                                                                                
	}                                                                                                    
                                                                                                         
	// View catalog details                                                                              
	public void viewCatalog() {                                                                          
		if (catalogItems.isEmpty()) {                                                                    
			System.out.println("Catalog is empty.");                                                     
		} else {                                                                                         
			System.out.println("--- Library Catalog ---");                                               
			for (LibraryItem<T> item : catalogItems) {                                                   
				System.out.println(item.toString());                                                     
			}                                                                                            
			System.out.println("-----------------------");                                               
		}                                                                                                
	}                                                                                                    
}                                                                                                        
