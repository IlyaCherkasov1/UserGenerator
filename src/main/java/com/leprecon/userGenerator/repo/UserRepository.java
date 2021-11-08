package com.leprecon.userGenerator.repo;

import com.leprecon.userGenerator.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
