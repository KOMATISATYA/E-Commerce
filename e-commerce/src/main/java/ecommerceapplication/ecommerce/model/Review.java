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
public class Review {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long reviewId;
    
    @Column(nullable=false)
    private String review;
    
    @ManyToOne
    @JoinColumn(name="productId")
    @JsonIgnore
    private Product product;
    
    @ManyToOne
    @JoinColumn(name="userId")
    @JsonIgnore
    private User user;
    
    private LocalDateTime createdAt;
}
