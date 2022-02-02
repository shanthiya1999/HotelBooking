package com.hcl;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
@Repository
public interface LoginDAO extends CrudRepository<LoginUser,String> {

}
