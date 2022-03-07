package com.appsdeveloperblog.app.ws;

import com.appsdeveloperblog.app.ws.entity.UserEntity;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findUserByEmail(String email);

}
