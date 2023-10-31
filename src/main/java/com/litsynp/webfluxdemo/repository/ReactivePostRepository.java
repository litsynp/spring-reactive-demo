package com.litsynp.webfluxdemo.repository;

import com.litsynp.webfluxdemo.document.Post;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ReactivePostRepository extends ReactiveCrudRepository<Post, String> {

}
