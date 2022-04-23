package br.com.econective.Finance.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.*;


@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
	
	Page<PersonEntity> findAll(Pageable pageable);

}
