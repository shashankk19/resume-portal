package io.personalproject.resumeportal;


import io.personalproject.resumeportal.model.MyUserDetails;
import io.personalproject.resumeportal.model.User;
import io.personalproject.resumeportal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.Optional;


@Service
public class MyUserDetailsService implements UserDetailsService {


    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> student=userRepository.findByUserName(userName);
        student.orElseThrow(()-> new UsernameNotFoundException("Not Found: "+userName));
        return student.map(MyUserDetails::new).get();
    }
}
