package br.com.fiap.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProducts {
    @Autowired
    RepositoryProducts repository;

    public List<Products> findAll(){
        return repository.findAll();
    }
}
