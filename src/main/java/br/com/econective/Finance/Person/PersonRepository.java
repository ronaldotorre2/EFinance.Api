package br.com.econective.Finance.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.*;


@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
	
	Page<PersonEntity> findAll(Pageable pageable);
	
	PersonEntity findById(long id);
	
	@Query(value ="Select * from Person p where p.Document1=?1", nativeQuery = true)
	PersonEntity findByDocument1(String document1);

}
