package ra.session_08.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
    private int product_id;
    private String product_name;
    private String product_description;
    private double product_price;
    private int product_quantity;
    private boolean product_status;
}
