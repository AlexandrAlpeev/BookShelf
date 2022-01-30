package ru.alpeev.bookshelves.repos;

import org.springframework.data.repository.CrudRepository;
import ru.alpeev.bookshelves.models.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);

}
