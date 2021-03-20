package swarup.edu.poc.orderserviceecr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import swarup.edu.poc.orderserviceecr.dao.OrderDao;
import swarup.edu.poc.orderserviceecr.dto.Order;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderServiceController {

    @Autowired
    private OrderDao orderDao;

    @GetMapping
    public List<Order> fetchOrders() {
       /* return orderDao.getOrders().stream().
                sorted(Comparator.comparing(Order::getPrice)).collect(Collectors.toList());*/

        return orderDao.getOrders();
    }
}
