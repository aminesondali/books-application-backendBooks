package org.sid.web;

import java.util.List;
import java.util.Optional;

import org.sid.dao.CategoryRepository;
import org.sid.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class CategoryRestService {

	@Autowired
	private CategoryRepository categoryRepo;
	
	//GET ALL CATEGORIES
		@RequestMapping(value="/categories", method = RequestMethod.GET)
		public List<Category> getCategories(){
			return categoryRepo.findAll(Sort.by(Sort.Direction.ASC,"categoryName"));
		}
		
	// ADD CATEGORY
		@RequestMapping(value="/categories", method = RequestMethod.POST)
		public Category addCategory(@RequestBody Category c) {
			return categoryRepo.save(c);
		}
	// DELETE CATEGORY
		@RequestMapping(value="categories/{id}", method = RequestMethod.DELETE)
		public void deleteCategory(@PathVariable Long id) {
			categoryRepo.deleteById(id);
		}	
	// UPDATE CATEGORY
	   @RequestMapping(value="categories/{id}",method = RequestMethod.PUT)
		public Category updateCategory(@PathVariable Long id, @RequestBody Category c ) {
			c.setId(id);
			return categoryRepo.save(c);
				
	   }
	   

		// GET CATEGORY BY ID
		@RequestMapping(value="/categories/{id}", method = RequestMethod.GET)
		public Optional<Category> getCategory(@PathVariable Long id){
			return categoryRepo.findById(id);
		}

}
