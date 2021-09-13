package com.javeriana.Game.repository;
import com.javeriana.Game.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {

   
}
