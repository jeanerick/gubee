package hello;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.pojos.Product;

@RestController
public class ProductController {
    private final String PATH = "/json/gubee-teste.json";

    @RequestMapping("/product/{id}")
    public Map greeting(@PathVariable("id") Integer id)
            throws Error, JsonParseException, JsonMappingException, IOException {

        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Product>> typeReference = new TypeReference<List<Product>>() {
        };
        InputStream inputStream = TypeReference.class.getResourceAsStream(PATH);

        List<Product> products = mapper.readValue(inputStream, typeReference);
        return Collections.singletonMap("result", products.get(id));
    }


    @RequestMapping("/product")
    public Map getAll(@RequestParam(value="name") String name)
            throws Error, JsonParseException, JsonMappingException, IOException {

        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Product>> typeReference = new TypeReference<List<Product>>() {
        };
        InputStream inputStream = TypeReference.class.getResourceAsStream(PATH);
        List<Product> products = mapper.readValue(inputStream, typeReference);
        
        return Collections.singletonMap("result", products);

    }

}