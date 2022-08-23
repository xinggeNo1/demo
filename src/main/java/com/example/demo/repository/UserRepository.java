package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
        path="users",
        collectionResourceRel = "users",
        itemResourceRel = "user"
)
public interface UserRepository extends JpaRepository<User, Integer> {

}
