package com.iris.authentication.repository;

import com.iris.authentication.model.AuthUser;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface AuthUserRepository extends CrudRepository<AuthUser, Integer> {

}
