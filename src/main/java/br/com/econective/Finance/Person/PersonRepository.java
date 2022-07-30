package br.com.econective.Finance.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.domain.*;


@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
	
	Page<PersonEntity> findAll(Pageable pageable);
	
	PersonEntity findById(long id);
	
	@Query(value ="Select * from Person p where p.Name like %?1%", nativeQuery = true)
	List<PersonEntity> findByName(String name);
	
	@Query(value ="Select * from Person p where p.Document1=?1", nativeQuery = true)
	PersonEntity findByDocument1(String document1);
	
	@Query(value ="Select * from Person p where p.Document2=?1", nativeQuery = true)
	PersonEntity findByDocument2(String document2);
}
