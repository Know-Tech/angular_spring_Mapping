package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.*;

public interface StaffRepository  extends JpaRepository<Staff, Long>{

}
