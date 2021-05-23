package kr.ac.hansung.cse.hellohateoas.repository;

import kr.ac.hansung.cse.hellohateoas.entity.AlbumEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AlbumRepository extends PagingAndSortingRepository<AlbumEntity, Long> {

}