package com.springboot.demo;

import com.springboot.demo.BO.testBO;
import com.springboot.demo.model.Product;
import com.springboot.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@RestController
public class Controller {

    @Autowired
    testBO testbo;

    @Autowired
    ProductService productService;

    @RequestMapping("/")
    public String welcome() {
        return "Welcome to Spring boot Camp";
    }

    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test() {
        System.out.println("Hello World");
        // new tesbo()
        testbo.display();
        return "{\n" +
                "    \"uname\": \"brangas\",\n" +
                "    \"pwd\":\"idno2\"\n" +
                "}";
    }

    @PostMapping(value = "/insert")
    public void postids(@RequestBody Product prod) {
        testbo.display();
        System.out.println("");
        productService.addproduct(prod);

    }

    @GetMapping(value = "/getproducts", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getproducts() {

        return productService.getProducts();
    }

    @GetMapping(value = "/product/{productid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Product getproductbyid(@PathVariable int productid) {
        return productService.getProductsbyid(productid);
    }
    @DeleteMapping(value = "/delete/{productid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteproduct(@PathVariable int productid) {
         productService.deleteproduct(productid);
    }
    @GetMapping(value = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
    public Product getproductwithquery(@RequestParam("productid") int productid) {
        return productService.retrieve(productid);
    }
}
