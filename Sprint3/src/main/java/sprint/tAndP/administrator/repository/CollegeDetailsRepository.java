package sprint.tAndP.administrator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sprint.tAndP.administrator.model.CollegeDetails;

@Repository
public interface CollegeDetailsRepository extends JpaRepository<CollegeDetails, Long> {

}
