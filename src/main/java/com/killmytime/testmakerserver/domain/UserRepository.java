package com.killmytime.testmakerserver.domain;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    public User findUserById(int id);
}
