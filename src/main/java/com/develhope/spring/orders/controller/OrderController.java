package com.develhope.spring.orders.controller;



import com.develhope.spring.orders.DTOs.CreateOrderRequest;
import com.develhope.spring.orders.DTOs.OrderResponse;
import com.develhope.spring.orders.entity.Order;
import com.develhope.spring.orders.service.OrderService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;


    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @Operation(summary = "create order")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "A new order has been created"),
            @ApiResponse(responseCode = "400", description = "Bad request!!!")})
    @PostMapping("/createOrder")
    public ResponseEntity<OrderResponse>createOrder (@RequestBody CreateOrderRequest request){
        OrderResponse newOrder = orderService.createOrder(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(newOrder);
    }
    @Operation(summary = "Update order")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Updated successfully"),
            @ApiResponse(responseCode = "400", description = "Bad request!")})
    @PutMapping("/updateOrder/{id}")
    public ResponseEntity<OrderResponse>updateOrder(@PathVariable Long id, @RequestBody CreateOrderRequest request){
        OrderResponse updateOrder = orderService.updateOrder(id,request);
        return ResponseEntity.ok(updateOrder);
    }
    @Operation(summary = "Delete order by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Deleted successfully"),
            @ApiResponse(responseCode = "400", description = "Bad request!")})
    @DeleteMapping("/deleteOrder/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id){
        orderService.deleteOrderById(id);
        return ResponseEntity.ok().build();
    }
    @Operation(summary = "Get order by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Order found successfully"),
            @ApiResponse(responseCode = "404", description = "Order not found!")})
    @GetMapping("/getOrder/{id}")
    public ResponseEntity<OrderResponse> getOrderById(@PathVariable Long id){
        OrderResponse order = orderService.findById(id);
        return ResponseEntity.ok(order);
    }
    @Operation(summary = "Get all orders")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All orders retrieved successfully"),
            @ApiResponse(responseCode = "404", description = "No orders found!")})
    @GetMapping("/getAllOrders")
    public ResponseEntity<List<OrderResponse>> getAllOrders() throws Exception{
        List<OrderResponse> orders = orderService.getAllOrders();
        return ResponseEntity.ok(orders);
    }

}