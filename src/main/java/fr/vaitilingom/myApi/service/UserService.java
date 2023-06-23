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

    public User createUser(String name, int age){
        User user = new User(this.users.size() + 1, name, age);
        this.users.add(user);
        return user;
    }

    public User updateUser(int id, String name, int age){

        for (User user : users) {
            if (user.getId() == id) {
            user.setName(name);
            user.setAge(age);
            return user;
            }
         }
        return null;
    }

    public User deleteUser(int id){
        for(User user: this.users){
             if (user.getId() == id) {
                int index = this.users.indexOf(user);
                return this.users.remove(index);
             }
        }
        return null;
    }
}
