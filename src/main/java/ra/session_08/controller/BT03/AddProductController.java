package ra.session_08.controller.BT03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ra.session_08.model.Product;
import ra.session_08.service.ProductService;

@Controller
public class AddProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("product-add")
    public String add() {
        return "addProduct"; // file addProduct.jsp
    }


    @PostMapping("product-save")
    public String save(@RequestParam String product_name,
                       @RequestParam String product_description,
                       @RequestParam double product_price,
                       @RequestParam int product_quantity) {

        Product product = new Product();
        product.setProduct_name(product_name);
        product.setProduct_description(product_description);
        product.setProduct_price(product_price);
        product.setProduct_quantity(product_quantity);

        boolean result = productService.addProduct(product);

        if (!result) {
            return "addProduct";
        } else {
            return "redirect:/product";
        }
    }
}
