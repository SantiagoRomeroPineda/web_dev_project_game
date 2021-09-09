package com.javeriana.Game.repository;
import com.javeriana.Game.model.User;
import java.util.List;
//import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends CrudRepository<User, Long> {
    List<User> findAll();
   
}
