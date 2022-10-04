/*
 * package com.example.demo.openfeign;
 * 
 * 
 * 
 * 
 * import java.util.List;
 * 
 * import org.springframework.cloud.openfeign.FeignClient; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable;
 * 
 * @FeignClient(name = "ClientFeign" , url = "http://127.0.0.1:8089") public
 * interface InterfaceClient{
 * 
 * @GetMapping("/getClientByCodeAgence/{branchCode}") public Client
 * getClient(@PathVariable String branchCode) ;
 * 
 * 
 * @GetMapping("/client/{customerId}") public Client
 * getClientBycustomerId(@PathVariable String customerId) ;
 * 
 * 
 * @GetMapping("/clients") public List<Client> getAllClient() ;
 * 
 * }
 */