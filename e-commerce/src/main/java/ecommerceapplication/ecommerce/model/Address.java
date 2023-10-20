package ecommerceapplication.ecommerce.model;

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
public class Address {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long addressId;
    
    @Column(nullable=false)
    private String firstName;
    
    @Column(nullable=false)
    private String lastName;
    
    @Column(nullable=false)
    private String  streetAddress;
    
    @Column(nullable=false)
    private String state;
    
    @Column(nullable=false)
    private String city;
    
    @Column(nullable=false)
    private String pinCode;
    
    @Column(nullable=false)
    private String phoneNumber;
    
    @ManyToOne
    @JoinColumn(name="userId")
    @JsonIgnore
    private User user;
}
