package com.infosys.jpademo1.DAO;

import com.infosys.jpademo1.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

// Repository : marked interface
// CURDRepository :  save() , saveAll(), findById, findAll,deleteById, deleteAll
// JPARepository :  inherites property from curdrepo add tow additional functionality : sorting and pagination
// param s:   T -- object need to manage , ID  -- object  data type of primary key
@Repository
public interface UserRepo  extends CrudRepository<User,Integer> {
    // give name of custom finder method on basis of property name mentioned in bean or entity.
    List<User>  findByUserName(String userName);
    // findByBeanPropertyNameKeyword
    User findByUserNameAndUserMail(String name , String email);
    List<User> findByUserNameLike(String pattern);
    @Query(value = "select u from User u",nativeQuery = false)
   // @Query(value = "select * from  user_info",nativeQuery = true)
    List<User> getAllUser();

    @Query(value = "select u.userMail from User u",nativeQuery = false)
        // @Query(value = "select * from  user_info",nativeQuery = true)
    List<String> getAllUserEmail();

    @Query("select u from User u  where u.userName = :username")
    // SELECT * FROM TABLE WHERE USERNAME = UNAME
            // 1 way to pass parameter in query
    //  @Param("name") when we have pass a parameter in query
    // :username  is nameparameter inside jpql
     // uname is actual parameter
    List<User> getUserByName(@Param("username") String uname);
    @Query("select u from User u where u.userMail = :umail AND u.userId = :uid")
    User getUserByEmailAndId( @Param("umail") String email , @Param("uid") int id);
  // Method must have same name as NameQuery name
    // give param same name as it is mentioned in the query
    // spring mathes method param names with query parameter
    // if param names differ spring may raise error -- depends on compilation settings
    List<User> findByUserNameByNamedQuery(String name);


    String findEmailByUserNameAndId(String uname, int uid);
    // u need to submit on sat even
    // create an application to manage medicines in a medical store
    // create a table using jpa  name as Medicines
    // medicine id , name , price , company , expr date - date  , manf date  - date
    // add medicine
    // add multiple medicine from a same company
    // update medicine price
    // find all the medicines detail  -- use jpql
    // find all medicine on basis of its company name
    // show all expired medicine    -- use jpql
    // show details of medicines maf between 2020 to 2024
    // remove exp medicine  on basis of company name and id   -- jpql
     // create a doc file  add code + screenshot of input + screen shot of output  + ss of db + project + application property
    // doc - name - id - assignment 3 

}
