package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface INCG extends JpaRepository<NCG, String>{

    @Query(nativeQuery = true,
            countQuery = "SELECT *  FROM ncg_Temp "
                    + "  WHERE (1=0 or ncg In :ncgs ) ",
            value = "SELECT *  FROM ncg_temp   "
                    + "WHERE (1=0 or  account.ncg In :ncgs) ")
    List<NCG> findByNcgs(@Param("ncgs") List<String> ncgs);
}
