package com.security.session.SecurityRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.security.session.Entity.Employee;

public interface SecurityRepository extends JpaRepository<Employee,Integer>
{

}
