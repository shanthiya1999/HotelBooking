package com.hcl;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
@Repository
public interface SignUpDAO extends CrudRepository<SignUpUser,String> {

}