package com.example.springproject1;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SearchHistoryService {

    @Autowired
    private SearchHistoryRepository repository;

    // Save
    public SearchHistory save(SearchHistory history) {
        return repository.save(history);
    }

    // Get All
    public List<SearchHistory> getAll() {
        return repository.findAll();
    }

    // Delete
    public void delete(Long id) {
        repository.deleteById(id);
    }
}


