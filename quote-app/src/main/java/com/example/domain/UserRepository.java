package com.example.domain;

import reactor.core.publisher.Mono;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * @author hezhuofan
 * @author snicoll
 */
public interface UserRepository extends ReactiveMongoRepository<User, String> {

	Mono<User> findUserByGithub(String github);

}
