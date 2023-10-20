package ecommerceapplication.ecommerce.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
      
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long productId;
    
    @Column(nullable=false)
    private String title;
    
    @Column(nullable=false)
    private String description;
    
    @Column(nullable=false)
    private int price;
    
    @Column(nullable=false)
    private int discountPrice;
    
    @Column(nullable=false)
    private int discountPersent;
    
    @Column(nullable=false)
    private int quantity;
    
    @Column(nullable=false)
    private String brand;
    
    @Column(nullable=false)
    private String color;
    
    @Embedded
    @ElementCollection
    private Set<Size> sizes=new HashSet<>();
    
    @Column(nullable=false)
    private String imageUrl;
    
    @OneToMany(mappedBy = "product",cascade=CascadeType.ALL,orphanRemoval=true)
    @JsonIgnore
    private List<Rating> ratings=new ArrayList<>();
    
    @OneToMany(mappedBy = "product",cascade=CascadeType.ALL,orphanRemoval=true)
    @JsonIgnore
    private List<Review> review=new ArrayList<>();
    
    @Column(nullable=false)
    private int numOfRatings;
    
    @ManyToOne
    @JoinColumn(name="categoryId")
    private Category category;
    
    @Column
    private LocalDateTime createdAt;
}
