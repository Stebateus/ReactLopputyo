package com.example.UrGW2Builds.domain;

import java.util.List;
import com.example.UrGW2Builds.domain.Specialization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpecializationRepository extends CrudRepository<Specialization, String> {

	List<Specialization> findByName(String name);

}
