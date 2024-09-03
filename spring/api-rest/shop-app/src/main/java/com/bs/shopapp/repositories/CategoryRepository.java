package com.bs.shopapp.repositories;

import com.bs.shopapp.models.Category;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, UUID> {
  Category findByName(String category_name);
}
