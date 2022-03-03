package com.orella.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orella.capstone.models.HelpModel;

@Repository
public interface HelpRepository extends JpaRepository <HelpModel, Integer> {

}
