package com.example.UrGW2Builds.domain;

import java.util.List;
import com.example.UrGW2Builds.domain.Build;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.mongodb.repository.MongoRepository;


	public interface BuildRepository extends CrudRepository<Build, String> {

		List<Build> findByName(String name);

	}


