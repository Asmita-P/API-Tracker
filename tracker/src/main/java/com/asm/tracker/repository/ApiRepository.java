package com.asm.tracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.asm.tracker.entity.ApiHitDetails;

public interface ApiRepository extends JpaRepository<ApiHitDetails, Integer> {

	@Query(value = "SELECT count(*) FROM api_hit_details_tbl WHERE api_key = ?1 and api_url = ?2 and hit_date = CURDATE()", nativeQuery = true)
	int findAllByApiKeyAndApiUrlAndDate(String apiKey, String apiUrl);

	@Query(value = "SELECT count(*) FROM api_hit_details_tbl WHERE api_key = ?1 and api_url = ?2 AND MONTH(hit_date) = MONTH(CURDATE()) AND YEAR(hit_date) = YEAR(CURDATE())", nativeQuery = true)
	int findAllByApiKeyAndApiUrlAndMonth(String apiKey, String apiUrl);

	@Query(value = "SELECT a.id, a.api_key,a.api_url,a.hit_date, COUNT(*) as hit_count FROM api_hit_details_tbl a WHERE MONTH(hit_date) = MONTH(CURDATE()) AND YEAR(hit_date) = YEAR(CURDATE()) GROUP BY a.api_key, a.api_url, a.hit_date", nativeQuery = true)
	List<ApiHitDetails> findAllByMonth();
}
