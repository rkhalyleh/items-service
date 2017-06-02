/**
 * 
 */
package ps.itemsService.service.orchestration;

import java.util.List;

import ps.itemsService.model.Item;

/**
 * @author rkhalayl
 *
 */
public interface ItemsDetails {

	public List<Item> getAllItemsWithDetails();

	public Item getItemDetails(String itemId);
	
}
