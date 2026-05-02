package com.infosys.jpademo1.Entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


// Named query   is a JPQL  defined with unique name and stored at entry level
// it help in reuse of query
//  @NamedQuery(
//   name = "", query= ""
//  )
// we define named query in entity class
@NamedQuery(
        name="User.findByUserNameByNamedQuery",
        query = "select u from User u where u.userName = :name "
)

@NamedQuery(
        name="User.findEmailByUserNameAndId",
        query = "select u.userMail from User u where u.userName = :uname and u.userId = :uid"
)
@Getter @Setter
@NoArgsConstructor
@ToString

@Entity  // Declares that the annotated class is an entity.
// by default it will ccreate tablename same as classname
@Table(name = "user_info")
// owning side
public class User {

    @Id  // specifies the primary key for entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // The GeneratedValue annotation may be applied to a primary key property or field o
    // IDENTITY  - auto increment  SEQUENCE use db sequence  table use table for id generation
    // auto -  let jpa decide
    private int userId;
    @Column
    private String userName;  // it will create column user_name
    @Column(name = "useremail")
    // nullable - not null  unique - unique  length
    private String userMail;




}
