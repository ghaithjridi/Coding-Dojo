package com.ghaith.springsession.models;



import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table(name="Burger")
public class Burger {
	//Membres variables
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotNull
	@Size(min = 5, max = 200, message ="you need a title !")
	private String burgername;
	
	@NotBlank
	@Size(min = 4, max = 100)
	private String restaurantname;
	
	@NotNull
	@Min(100)
	@Max(999)
	private Integer ratting;
	
	// This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    
 // zero-args constructor
    
    public Burger() {
		
	}
    
//	----- methods ---
    // other getters and setters removed for brevity
   
    @PrePersist
    protected void nCreate(){
        this.createdAt = new Date();
    }
    
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBurgername() {
		return burgername;
	}
	public void setBurgername(String burgername) {
		this.burgername = burgername;
	}
	public String getRestaurantname() {
		return restaurantname;
	}
	public void setRestaurantname(String restaurantname) {
		this.restaurantname = restaurantname;
	}
	public Integer getRatting() {
		return ratting;
	}
	public void setRatting(Integer ratting) {
		this.ratting = ratting;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	

}
