package com.example.springproject1;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/history")
@CrossOrigin(origins = "http://localhost:5173")
public class SearchHistoryController {

    @Autowired
    private SearchHistoryService service;

    // Save search history
    @PostMapping
    public SearchHistory save(@RequestBody SearchHistory history) {
        return service.save(history);
    }

    // Get all history
    @GetMapping
    public List<SearchHistory> getAll() {
        return service.getAll();
    }

    // Delete history
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}


