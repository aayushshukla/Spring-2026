package com.infosys.jpademo1.DAO;

import com.infosys.jpademo1.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Repository : marked interface
// CURDRepository :  save() , saveAll(), findById, findAll,deleteById, deleteAll
// JPARepository :  inherites property from curdrepo add tow additional functionality : sorting and pagination
// param s:   T -- object need to manage , ID  -- object  data type of primary key
@Repository
public interface UserRepo  extends CrudRepository<User,Integer> {
}
