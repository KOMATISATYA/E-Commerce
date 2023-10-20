package ecommerceapplication.ecommerce.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentInformation {
    
    @Column(nullable=false)
    private String cardHolderName;
    
    @Column(nullable=false)
    private String cardNumber;
    
    @Column(nullable=false)
    private String cvv;
    
    @Column(nullable=false)
    private LocalDate expirationDate;
}
