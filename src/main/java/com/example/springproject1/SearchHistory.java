package com.example.springproject1;

import jakarta.persistence.*;
import lombok.Data;

	@Entity
	@Data
	public class SearchHistory {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String state;
	    private String commodity;
	    private String searchDate;
	}

