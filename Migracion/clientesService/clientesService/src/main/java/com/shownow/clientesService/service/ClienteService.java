package com.shownow.clientesService.service;

import com.shownow.clientesService.model.Cliente;
import com.shownow.clientesService.repository.ClienteRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getCliente() {
        return clienteRepository.obtenerClientes();
    }

   
    public Cliente buscarPorId(int id) {
            return clienteRepository.buscarPorId(id);
    }


    public void addCliente(Cliente cliente) {
        clienteRepository.agregarCliente(cliente);
    }

    public Cliente actualizarCliente(Cliente cli) {
        return clienteRepository.actualizarCliente(cli);
    }

    public String eliminarCliente(int id) {
        clienteRepository.eliminarCliente(id);
        return "Cliente eliminado con id: " + id;
    }




}
