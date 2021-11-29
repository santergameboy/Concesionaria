package com.santer;

import com.santer.dao.ClienteDao;
import com.santer.moda.Cliente;
import com.santer.util.Conector;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("9519261","ERICK","cochabamba", "zona sud", 71791540);
        Cliente victor = new Cliente("9519261","victor","cochabamba", "zona norte", 78322334);
        Cliente ramiro = new Cliente("9519261","ramiro","cochabamba", "alto cochabamba", 4211251);
        Cliente tadeo = new Cliente("9519261","tadeo","cochabamba", "centro", 45682334);
        Cliente alvaro = new Cliente("9519261","alvaro","cochabamba", "zona sud", 71327494);
        ClienteDao clienteDao = new ClienteDao();
        clienteDao.addCliente(cliente);
            }
}
