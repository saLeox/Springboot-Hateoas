package com.project.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.maidService.MaidServiceSubscription;

import io.swagger.annotations.Api;

@Api(value = "maidServiceSubscription API")
@RestController
@RequestMapping(value = "/maidServiceSubscription")
public class MaidServiceSubscriptionController {
	@PutMapping("/new")
	public ResponseEntity<MaidServiceSubscription> insert(@RequestBody MaidServiceSubscription subscription) {
		//TODO: insert subscription
		subscription.add(linkTo(methodOn(MaidServiceSubscriptionController.class).get(subscription.getId())).withRel("get"));
		subscription.add(linkTo(methodOn(MaidServiceSubscriptionController.class).update(subscription.getId(),subscription)).withRel("update"));
		subscription.add(linkTo(methodOn(MaidServiceSubscriptionController.class).list(subscription.getCustomerID())).withRel("collection"));
		subscription.add(linkTo(methodOn(MaidServiceSubscriptionController.class).delete(subscription.getId())).withRel("delete"));
		return new ResponseEntity<MaidServiceSubscription>(subscription, HttpStatus.OK);
	}

	@GetMapping("/list")
	public ResponseEntity<CollectionModel<MaidServiceSubscription>> list(@RequestParam(value = "customerID", required = false) Integer customerID) {
		List<MaidServiceSubscription> list = new ArrayList<MaidServiceSubscription>();
		//TODO: list subscription
		Link link1 = linkTo(methodOn(MaidServiceSubscriptionController.class).get(null)).withRel("get");
		Link link2 = linkTo(methodOn(MaidServiceSubscriptionController.class).update(null,null)).withRel("update");
		Link link3 = linkTo(methodOn(MaidServiceSubscriptionController.class).delete(null)).withRel("delete");
		return ResponseEntity.ok(new CollectionModel<>(list, link1, link2, link3));
	}

	@GetMapping("/{id}")
	public ResponseEntity<MaidServiceSubscription> get(@PathVariable(value = "id") Integer id) {
		MaidServiceSubscription subscription = new MaidServiceSubscription();
		//TODO: get subscription
		subscription.add(linkTo(methodOn(MaidServiceSubscriptionController.class).update(subscription.getId(),subscription)).withRel("get"));
		subscription.add(linkTo(methodOn(MaidServiceSubscriptionController.class).delete(subscription.getId())).withRel("delete"));
		return new ResponseEntity<MaidServiceSubscription>(subscription, HttpStatus.OK);
	}


	@PutMapping("/{id}")
	public ResponseEntity<MaidServiceSubscription> update(@PathVariable(value = "id") Integer id,
			@RequestBody MaidServiceSubscription subscription) {
		//TODO: update subscription
		subscription.add(linkTo(methodOn(MaidServiceSubscriptionController.class).get(subscription.getId())).withRel("get"));
		subscription.add(linkTo(methodOn(MaidServiceSubscriptionController.class).update(subscription.getId(),subscription)).withRel("update"));
		subscription.add(linkTo(methodOn(MaidServiceSubscriptionController.class).list(subscription.getCustomerID())).withRel("collection"));
		subscription.add(linkTo(methodOn(MaidServiceSubscriptionController.class).delete(subscription.getId())).withRel("delete"));
		return new ResponseEntity<MaidServiceSubscription>(subscription, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<MaidServiceSubscription> delete(@PathVariable(value = "id") Integer id) {
		MaidServiceSubscription subscription = new MaidServiceSubscription();
		//TODO: delete subscription
		subscription.add(linkTo(methodOn(MaidServiceSubscriptionController.class).list(subscription.getCustomerID())).withRel("collection"));
		return new ResponseEntity<MaidServiceSubscription>(subscription, HttpStatus.OK);
	}

}
