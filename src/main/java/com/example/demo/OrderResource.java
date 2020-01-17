package com.example.demo;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderResource extends ResourceSupport {
	
    private final Long id;
    private final String name;
    private final Integer type;
    private final String description;
    private final Double cost;
    private final String date_created;
    private final Integer count;
    private final String active;
    
    public OrderResource(Order order) {
    	id = order.getId();
    	name = order.getName();
    	type = order.getType();
    	description = order.getDescription();
    	cost = order.getCost();
    	date_created = order.getDate_created();
    	count = order.getCount();
    	active = order.getActive();
    	
    }
    
    @JsonProperty("id")
    public Long getResourceId() {
    	return id;
    }

	public String getName() {
		return name;
	}

	public Integer getType() {
		return type;
	}

	public String getDescription() {
		return description;
	}

	public Double getCost() {
		return cost;
	}

	public String getDate_created() {
		return date_created;
	}

	public Integer getCount() {
		return count;
	}

	public String getActive() {
		return active;
	}
    
    

}
