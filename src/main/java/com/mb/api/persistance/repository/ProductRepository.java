package com.mb.api.persistance.repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.mb.api.persistance.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>
{
	
	//@Query("FROM com.mb.api.persistance.entity.Product p WHERE p.code =:a OR p.vendor =:b")
	//List<Product> getProductData(@Param("a") String code, @Param("b")String vendor);

	
	//Native Queries
	//@Query(value = "SELECT * FROM `spring_jpql-query`.products WHERE code =:a OR vendor =:b", nativeQuery = true)
	//List<Product> getProductData(@Param("a") String code, @Param("b")String vendor);

	
	//JPQL Select All Columns
	
//	@Query("SELECT p  FROM Product p")
//	List<Product> getAllProductInfo();
	
	//JPQL Select Few Columns
//	@Query("SELECT p.vendor, p.cost FROM Product p")
//	List<Object[]> getProductDataByVenderAndCost();
	
	//JPQL Select One Column
	
//	@Query("SELECT p.cost FROM Product p")
//	List<Double> getProductDataFromCost();
	
	
//	 @Query("SELECT p FROM Product p WHERE p.vendor LIKE :a")
//	 List<Product> searchProductByCode(@Param("a") String code);
	
//	@Query("FROM Product p WHERE p.cost BETWEEN :v1 AND :v2")
//	List<Product> filterProduct(@Param("v1") Double startFrom,@Param("v2") Double EndAt);
	
//	@Modifying
//	@Transactional
//	@Query("DELETE FROM Product p WHERE p.cost =:a")
//	Integer removeData(@Param("a") Double cost);
	
	
//	@Transactional
//	@Modifying
//	@Query("UPDATE Product p SET p.cost=:cost WHERE p.vendor=:vendor")
//	Integer modifyData(Double cost, String vendor);
	
//	@Transactional
//	@Modifying
//	@Query("UPDATE Product p SET p.cost =:updatedCost WHERE p.id =:id")
//	Integer updateProductCostById(Integer id, Double updatedCost);
	
	
	@Transactional
	@Modifying
	@Query("DELETE FROM Product p WHERE p.cost =:productCost")
	Integer deleteProductByCost(@Param("productCost") Double productCost);
}


