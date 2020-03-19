package com.Movie.MicroServices.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.Repository;

import com.Movie.MicroServices.Model.User;

public interface UserReporistory extends MongoRepository<User, Integer> {


}
