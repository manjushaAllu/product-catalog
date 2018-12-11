package com.onimurasame.productcatalog.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.onimurasame.productcatalog.data.Product;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProductControllerTest {

    @Disabled("To see how the Coverage looks like")
    @Test
    @DisplayName("Test GET /products")
    void test_getProducts() throws IOException {
        ProductController productController = new ProductController();
        String responseEntity = productController.process();

        assertNotNull(responseEntity);
        assertEquals("Done", responseEntity);

    }

}
