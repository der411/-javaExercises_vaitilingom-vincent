package fr.vaitilingom.myApi.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import fr.vaitilingom.myApi.model.User;

@Service
public class UserService {

    private ArrayList<User> users;

    public UserService(){

        this.users = new ArrayList<User>();

        this.users.add(new User(1, "Marc", 30));
        this.users.add(new User(2, "Jean", 20));
        this.users.add(new User(3, "Paul", 25 ));

    }
    
    public User getUser(int id) {
  
        for (User user : users) {
            if (user.getId() == id) {
        return user;
            }
        }
        return null;

    }
}
