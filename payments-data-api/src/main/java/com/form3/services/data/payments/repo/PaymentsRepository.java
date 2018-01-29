package com.form3.services.data.payments.repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.form3.services.data.payments.model.Payments;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "payments", path = "payments")
public interface PaymentsRepository extends MongoRepository<Payments, String> {


}