package repository;



//import com.example.jpa.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

}