package ecommerceapplication.ecommerce.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rating {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long ratingId;
    
    @ManyToOne
    @JoinColumn(name="userId",nullable=false)
    @JsonIgnore
    private User user;
    
    @ManyToOne
    @JoinColumn(name="productId",nullable=false)
    @JsonIgnore
    private Product product;
    
    @Column(nullable=false)
    private double rating;
    
    @Column(nullable=false)
    private LocalDateTime createdAt;
  

}
