package br.com.fiap.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ControllerProducts {
    @Autowired
    ServiceProducts service;

    @GetMapping
    public List<Products> findAll(){
        return service.findAll();
    }
}
