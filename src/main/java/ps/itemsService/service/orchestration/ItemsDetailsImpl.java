/**
 * 
 */
package ps.itemsService.service.orchestration;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import ps.itemsService.model.Item;

/**
 * @author rkhalayl
 *
 */
public class ItemsDetailsImpl implements ItemsDetails{

	final static Logger logger = Logger.getLogger(ItemsDetailsImpl.class);

	@Override
	public List<Item> getAllItemsWithDetails() {
		List<Item> items = new ArrayList<Item>();
		
		items.add(new Item("01", "T-Shirt", 30, "Piece", 100, 40, "Local T-Shirt", "0.05"));
		items.add(new Item("02", "Milk", 20, "Piece", 80, 50, "Fresh Milk", "0.05"));
		
		return items;
	}

	@Override
	public Item getItemDetails(String itemId) {
		if (itemId.equals("01")){
			return new Item("01", "T-Shirt", 30, "Piece", 100, 40, "Local T-Shirt", "0.05");			
		} else
		if (itemId.equals("02")){
			return new Item("02", "Item two", 60, "Piece", 180, 20, "Local Item two", "0.5");
		} else {
			return new Item("Item_"+itemId, "ItemDetailsFor_"+itemId, 50, "Piece", 100, 40, "Local Item", "0.05");			
		}
	}
}
