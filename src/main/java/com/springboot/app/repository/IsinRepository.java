package com.springboot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.model.Isin;
import com.springboot.app.model.IsinComposite;

/**
 * The Interface IsinRepository.
 */
@Repository
public interface IsinRepository extends JpaRepository<Isin, IsinComposite> {

}
