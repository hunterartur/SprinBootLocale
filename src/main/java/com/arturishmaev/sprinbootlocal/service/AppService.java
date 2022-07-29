package com.arturishmaev.sprinbootlocal.service;

import com.arturishmaev.sprinbootlocal.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Service
public class AppService {

    private User user1;
    private User user2;
    private User user3;
    private User user4;
    private List<User> users;

    {
        user1 = new User(1L, "Artur", "Ishmaev", 28, "programmer");
        user2 = new User(2L, "Yulduz", "Nasibullina", 28, "teacher");
        user3 = new User(3L, "Vadim", "Vasilev", 20, "worker");
        user4 = new User(4L, "Aigul", "Khabirova", 36, "mother");
        users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
    }

    public User getById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().get();
    }

    public User add(User user) {
        users.add(user);
        return user;
    }

    public void removeById(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }

    public List<User> getAll() {
        return users;
    }

    public User update(User user) {
        User userUpdate = users.stream().filter(u -> u.getId().equals(user.getId())).findFirst().get();
        userUpdate.setFirsName(user.getFirsName());
        userUpdate.setLastName(user.getLastName());
        userUpdate.setAge(user.getAge());
        userUpdate.setProfession(user.getProfession());
        users.set(userUpdate.getId().intValue(), userUpdate);
        return userUpdate;
    }

}
