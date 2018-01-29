package com.form3.services.data.payment.repo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.junit4.SpringRunner;

import com.form3.services.data.payments.model.Payments;

/**
 * Tests Mongo Calls for the payments API
 * @author satishgummadelli
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MongoApplicationConfig.class)
@EntityScan("com.form3.services.data.payments.model")
@DataMongoTest
public class PaymentsRepoTest {

	@Autowired
	private MongoTemplate mongoTemplate;

	private String collectionName = "payments";

	@Before
	public void before() {
		mongoTemplate.createCollection(collectionName);
	}

	@After
	public void after() {
		mongoTemplate.dropCollection(collectionName);
	}

	@Test
	public void shouldGetAllPayments() {
		savePaymentToDBWithOrganizationId("A");
		savePaymentToDBWithOrganizationId("B");
		assertThat(mongoTemplate.findAll(Payments.class).size()).isEqualTo(2);
	}

	@Test
	public void shouldGetPayment() {
		savePaymentToDBWithOrganizationId("A");
		Payments payments = mongoTemplate.findAll(Payments.class).get(0);
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(payments.getId()));
		mongoTemplate.save(payments, collectionName);
		assertThat(mongoTemplate.findOne(query, Payments.class)).isNotNull();
	}

	@Test
	public void shouldCreatePayment() {
		savePaymentToDBWithOrganizationId("A");
		assertThat(mongoTemplate.findAll(Payments.class).get(0).getOrganisationId()).isEqualTo("A");
		assertThat(mongoTemplate.findAll(Payments.class).size()).isEqualTo(1);
	}

	@Test
	public void shouldUpdatePayment() {
		savePaymentToDBWithOrganizationId("A");
		Payments payments = mongoTemplate.findAll(Payments.class).get(0);
		payments.setOrganisationId("C");
		mongoTemplate.save(payments, collectionName);
		assertThat(mongoTemplate.findAll(Payments.class).get(0).getOrganisationId()).isEqualTo("C");
		assertThat(mongoTemplate.findAll(Payments.class).size()).isEqualTo(1);
	}

	@Test
	public void shouldDeletePayment() {
		savePaymentToDBWithOrganizationId("A");
		assertThat(mongoTemplate.findAll(Payments.class).size()).isEqualTo(1);
		Payments payments = mongoTemplate.findAll(Payments.class).get(0);
		mongoTemplate.remove(payments);
		assertThat(mongoTemplate.findAll(Payments.class).isEmpty()).isEqualTo(true);
	}

	private void savePaymentToDBWithOrganizationId(String orgId) {
		Payments p1 = new Payments();
		p1.setOrganisationId(orgId);
		mongoTemplate.save(p1, collectionName);
	}

}
