package com.orella.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orella.models.HelpModel;

@Repository 
public interface HelpRepository extends JpaRepository<HelpModel, Integer>{


}