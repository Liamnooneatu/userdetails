package com.example.userdetails;

import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {

    private UserDetailsRepository userDetailsRepository;

    public UserDetailsService(UserDetailsRepository userDetailsRepository){ this.userDetailsRepository = userDetailsRepository;  }
    public void saveUserDetails(UserDetails userDetails) {
        userDetailsRepository.save(userDetails);
        System.out.println("User saved: " + userDetails);
    }

    public UserDetails getUserDetailsByDetailsId(String detailsId){

        return new UserDetails();
    }
 }
