package com.shownow.clientesService.controller;

import com.shownow.clientesService.service.ClienteService;  
import java.util.List;
import com.shownow.clientesService.model.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    private List<Cliente> listaClientes(){
        return clienteService.getCliente();
    }

    @PostMapping
    private void guardarCliente(@RequestBody Cliente cliente){
        clienteService.agregarCliente(cliente);
    }

    @GetMapping("/{id}")
    private Cliente obtenerCliente(@PathVariable int id){
        return clienteService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    private void actualizarCliente(@PathVariable int id, @RequestBody Cliente cliente){
        clienteService.actualizarCliente(cliente);
    }

    @DeleteMapping("/{id}")
    private void eliminarCliente(@PathVariable int id){
        clienteService.eliminarCliente(int);
    }

}
