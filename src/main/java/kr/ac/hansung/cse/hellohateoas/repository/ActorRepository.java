package kr.ac.hansung.cse.hellohateoas.repository;

import kr.ac.hansung.cse.hellohateoas.entity.ActorEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ActorRepository extends PagingAndSortingRepository<ActorEntity, Long> {

}