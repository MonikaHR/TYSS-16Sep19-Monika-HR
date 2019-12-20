package com.tyss.stockmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.stockmanagement.dto.HistoryResponse;
import com.tyss.stockmanagement.dto.OrderHistoryInfoBean;
import com.tyss.stockmanagement.dto.OrderInfoBean;
import com.tyss.stockmanagement.dto.ProductsBean;
import com.tyss.stockmanagement.dto.Response;
import com.tyss.stockmanagement.service.StockService;

@RestController
@RequestMapping("/stockmanagement")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StockController {

	@Autowired
	private StockService service;

	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response addAsset(@RequestBody ProductsBean bean) {
		ProductsBean check = service.add(bean);
		Response response = new Response();
		if (check != null) {
			response.setCode(201);
			response.setMessage("added");
			response.setDescription("product successfully added");
		} else {
			response.setCode(401);
			response.setMessage("not added");
			response.setDescription("product not added");
		}
		return response;
	}



	@PutMapping(path = "/modify/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response updateAsset(@RequestBody ProductsBean bean, @PathVariable("id") int id) {
		Response response = new Response();
		if (service.modify(bean)) {
			response.setCode(201);
			response.setMessage("updated");
			response.setDescription("assetData successfully updated");
		} else {
			response.setCode(401);
			response.setMessage("notupdated");
			response.setDescription("assetData not updated ");
		}
		return response;
	}



	@GetMapping(path = "/searchbyname/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response searchByName(@PathVariable("name")  String name) {
		Response response = new Response();
		ProductsBean beans = service.searchByName(name);
		if (beans != null) {
			response.setCode(201);
			response.setMessage("success");
			response.setDescription("Data fond in db");
			response.setBean(beans);
		} else {
			response.setCode(401);
			response.setMessage("failure");
			response.setDescription("no data found ");
		}
		return response;
	}

	@GetMapping(path = "/searchbycategory/{category}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response searchByCategory(@PathVariable("category")  String category) {
		Response response = new Response();
		List<ProductsBean> beans = service.searchBycategory(category);
		if (!beans.isEmpty()) {
			response.setCode(201);
			response.setMessage("success");
			response.setDescription("Data found in db");
			response.setBeans(beans);
		} else {
			response.setCode(401);
			response.setMessage("failure");
			response.setDescription("no data found ");
		}
		return response;
	}
	
	@GetMapping(path = "/searchbycompany/{company}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response searchByCompany(@PathVariable("company")  String company) {
		Response response = new Response();
		List<ProductsBean> beans = service.searchByCompany(company);
		if (!beans.isEmpty()) {
			response.setCode(201);
			response.setMessage("success");
			response.setDescription("Data found in db");
			response.setBeans(beans);
		} else {
			response.setCode(401);
			response.setMessage("failure");
			response.setDescription("no data found ");
		}
		return response;
	}



	@GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response getAllProducts() {
		Response response = new Response();
		List<ProductsBean> beans = service.getAllProducts();
		if (!beans.isEmpty()) {
			response.setCode(201);
			response.setMessage("success");
			response.setDescription("Data fond in db");
			response.setBeans(beans);
		} else {
			response.setCode(401);
			response.setMessage("failure");
			response.setDescription("no data found ");
		}
		return response;
	}
	
	@PostMapping (path  = "/bill" , consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public Response billGenertate(@RequestBody ProductsBean prod, @RequestParam("quantity")
	int quantity)
	{
		Response response =  new Response();
		if(service.generateBill(prod, quantity))
		{
			response.setCode(201);
			response.setDescription("Bill Generated Succesfull");
			response.setMessage("Success");
			return response;
		}
		else
		{
			response.setCode(401);
			response.setDescription("Bill failed");
			response.setMessage("fail");
			return response;
			
		}
		


	}
	@GetMapping(path ="/showbill/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public Response showBill(@PathVariable int id)
	{

		Response message =  new Response();
		OrderInfoBean order=	service.showBill(id);
		if(order != null)
		{
			message.setCode(201);
			message.setDescription("Bill displayed Succesfull");
			message.setMessage("Success");
			return message;
		}
		else
		{
			message.setCode(401);
			message.setDescription("Bill  failed");
			message.setMessage("fail");
			return message;
		}
	}
	
	@GetMapping(path = "/showhistory", produces = MediaType.APPLICATION_JSON_VALUE)
	public HistoryResponse orderHistory() {
		
		HistoryResponse ord = new HistoryResponse();
		List<OrderHistoryInfoBean> list = service.showHistory();
		if(list.isEmpty())
		{
			ord.setStatusCode(401);
			ord.setMessage("Fail");
			ord.setDescription("history displayed");
			ord.setOrdHis(list);
			return ord;
		}else
		{
			ord.setStatusCode(201);
			ord.setMessage("Success");
			ord.setDescription("history Not displayed");
			ord.setOrdHis(list);
			return ord;
		}
	}


}
