package com.project.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.maidService.MaidServiceOrder;
import com.project.entity.maidService.order.MaidServiceOrderConstant;

import io.swagger.annotations.Api;

@Api(value = "maidServiceOrder API")
@RestController
@RequestMapping(value = "/maidServiceOrder")
public class MaidServiceOrderController {

	@GetMapping("/list")
	public ResponseEntity<CollectionModel<String>> list() {
		List<String> plans = MaidServiceOrderConstant.planArr;
		Link link = linkTo(methodOn(MaidServiceOrderController.class).get(null)).withRel("get");
		return ResponseEntity.ok(new CollectionModel<>(plans, link));
	}

	@GetMapping("/{type}")
	public ResponseEntity<MaidServiceOrder> get(@PathVariable(value = "type") String type) {
		MaidServiceOrder order = MaidServiceOrder.factoryCreate(type);
		order.add(linkTo(methodOn(MaidServiceSubscriptionController.class).insert(null)).withRel("newSubscription"));
		order.add(linkTo(methodOn(MaidServiceOrderController.class).list()).withRel("collection"));
		return ResponseEntity.ok(order);
	}

}
