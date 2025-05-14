package ra.session_08.repository;

import org.springframework.stereotype.Repository;
import ra.session_08.model.Product;
import ra.session_08.utils.ConnectionDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepoImpl implements ProductRepo {
    @Override
    public List<Product> findAll() {
        Connection conn = null;
        CallableStatement callSt = null;

        List<Product> products = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call get_all_product()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setProduct_id(rs.getInt("id"));
                product.setProduct_name(rs.getString("name"));
                product.setProduct_description(rs.getString("description"));
                product.setProduct_price(rs.getDouble("price"));
                product.setProduct_quantity(rs.getInt("quantity"));
                product.setProduct_status(rs.getBoolean("status"));
                // add to list
                products.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return products;
    }

    @Override
    public boolean addProduct(Product product) {
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call add_product(?, ?, ?, ?)}");

            callSt.setString(1, product.getProduct_name());
            callSt.setString(2, product.getProduct_description());
            callSt.setDouble(3, product.getProduct_price());
            callSt.setInt(4, product.getProduct_quantity());

            callSt.executeUpdate();
            return true;
        } catch (Exception e) {
            e.fillInStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return false;
    }

}
