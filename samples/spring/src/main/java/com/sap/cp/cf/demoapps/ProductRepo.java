package com.sap.cp.cf.demoapps;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

@RepositoryRestResource
public interface ProductRepo extends JpaRepository<Product, String> {
	public Collection<Product> findByName(String name);
}
