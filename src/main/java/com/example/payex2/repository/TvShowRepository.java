package com.example.payex2.repository;

import com.example.payex2.model.TvShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TvShowRepository extends JpaRepository<TvShow,Long> {
    List<TvShow> findAll();
    TvShow findTvShowById(@Param("id")Long id);
    Optional<TvShow> findById(Long id);
}
