/**
 * 
 */
package ps.itemsService.services;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ps.itemsService.model.Item;
import ps.itemsService.service.orchestration.ItemsDetails;

/**
 * @author Rami
 *
 */
@RestController
@RequestMapping("/itemsDetails")
public class ItemsDetailsController {
	
	final static Logger logger = Logger.getLogger(ItemsDetailsController.class);
	
	@Autowired
	private ItemsDetails itemsDetails;
	
	/**
	 * Get all items with details
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Item>> getAllItemsWithDetails() {
		logger.info("---------------------------");
		List<Item> itemsList = itemsDetails.getAllItemsWithDetails();
		
		return new ResponseEntity<List<Item>>(itemsList, HttpStatus.OK);		
	}

	/**
	 * Get item details
	 * @return
	 */
	@RequestMapping(value = "/{itemId}",
		method = RequestMethod.GET)
	public ResponseEntity<Item> getItemDetails(@PathVariable("itemId") String itemId) {
		logger.info("----------get item details-----------------");
		Item item = itemsDetails.getItemDetails(itemId);
		
		return new ResponseEntity<Item>(item, HttpStatus.OK);		
	}

}
