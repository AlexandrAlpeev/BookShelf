package ru.alpeev.bookshelves.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alpeev.bookshelves.models.User;

public interface UserRepo extends JpaRepository <User,Long> {
    User findByUsername(String username);
}
