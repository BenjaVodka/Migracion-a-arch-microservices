package com.shownow.clientesService.repository;

import com.shownow.clientesService.model.Cliente;

import java.util.List;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public class ClienteRepository {

    private List<Cliente> listaClientes = new ArrayList<>();

    //ver la lista de clientes
    public List<Cliente> obtenerClientes() {
        return listaClientes;
    }

    //busacr por id

    


    public Cliente buscarPorId(int id) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null; 
    }

    //Agregar un nuevo cliente a la lista

    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    //Actualizar un cliente existente en la lista

    public Cliente actualizarCliente(Cliente cli) {

        int id = 0;
        int idPosicion = 0;
        for ( int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getId() > id) {
                id = listaClientes.get(i).getId();
                idPosicion = i;
                
            }
        }
        Cliente cliente1 = new Cliente();
        cliente1.setId(id);
        cliente1.setName(cli.getName());
        cliente1.setEmail(cli.getEmail());
        cliente1.setTelefone(cli.getTelefone());
        

        listaClientes.set(idPosicion, cliente1);
        return cliente1;
    }

    //Eliminar un cliente de la lista

    public Cliente eliminarCliente(int id){
        Cliente cliente = buscarPorId(id);
        if (cliente != null) {
            listaClientes.remove(cliente);
        }
        return cliente;

    }

    public ClienteRepository(){

        listaClientes.add(new Cliente(1, "Benjamin", "benjamin@gmail.com", "3235653224"));
        listaClientes.add(new Cliente(2, "ALex", "Alex@gmail.com", "3546453224"));
        listaClientes.add(new Cliente(3, "Camila", "camila@gmail.com", "5473553224"));
        listaClientes.add(new Cliente(4, "Alejandrina", "alejadrina@gmail.com", "4363464353224"));
        listaClientes.add(new Cliente(5, "Esteban", "estaben@gmail.com", "3466346224"));
        listaClientes.add(new Cliente(6, "Miguel", "miguel@gmail.com", "68346224"));
        listaClientes.add(new Cliente(7, "javiera", "javiera@gmail.com", "943893253224"));
        listaClientes.add(new Cliente(8, "emilia", "emilia@gmail.com", "48532224"));
    }
    



}
