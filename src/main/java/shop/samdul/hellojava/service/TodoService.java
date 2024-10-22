package shop.samdul.hellojava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import shop.samdul.hellojava.entity.TodoEntity;
import shop.samdul.hellojava.mapper.TodoMapper;

public class TodoService {
    @Autowired
    TodoMapper todoMapper;

    public List<TodoEntity> getTodos() {
        System.out.println("[service] findAll");
        List<TodoEntity> todos = todoMapper.findAll();
        System.out.println("[todos]:" + todos.size());
        return todos;
    }
}
