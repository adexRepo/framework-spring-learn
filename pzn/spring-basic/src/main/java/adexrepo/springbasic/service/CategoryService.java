package adexrepo.springbasic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import adexrepo.springbasic.repository.CategoryRepository;
import lombok.Getter;

@Component
public class CategoryService {
    
    @Getter
    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

}
