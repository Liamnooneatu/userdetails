package com.example.userdetails;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {

}