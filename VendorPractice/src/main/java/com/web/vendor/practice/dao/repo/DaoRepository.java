package com.web.vendor.practice.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.web.vendor.practice.dao.entity.VentorEntity;

public interface DaoRepository extends JpaRepository<VentorEntity, Integer> {

}
