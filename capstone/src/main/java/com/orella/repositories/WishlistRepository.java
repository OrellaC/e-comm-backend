package com.orella.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orella.models.WishlistModel;

@Repository
public interface WishlistRepository extends JpaRepository<WishlistModel, Integer> {

}
