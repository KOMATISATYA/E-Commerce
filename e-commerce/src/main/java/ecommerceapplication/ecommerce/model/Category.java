package ecommerceapplication.ecommerce.model;

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
public class Category {
     
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long categoryId;
    
    @Column(nullable=false)
    private String name;
    
    @ManyToOne
    @JoinColumn(name="parent_category_id")
    private Category parentCategory;
    
    @Column(nullable=false)
    private int level;
}
