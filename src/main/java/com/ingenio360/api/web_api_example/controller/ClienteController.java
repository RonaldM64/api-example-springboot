package com.ingenio360.api.web_api_example.controller;

import com.ingenio360.api.web_api_example.model.Cliente;
import com.ingenio360.api.web_api_example.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping(value = "api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable Long id) {
        return clienteService.findById(id);
    }

    @PostMapping()
    public Cliente createCliente(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }
}
