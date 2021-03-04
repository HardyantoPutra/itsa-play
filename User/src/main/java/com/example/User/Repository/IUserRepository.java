package com.example.User.Repository;

import com.example.User.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User, Integer> {
    User findById(int id);

}
