package shop.samdul.hellojava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import shop.samdul.hellojava.entity.TodoEntity;
import shop.samdul.hellojava.service.TodoService;

@RestController
public class TodoController {

    @Autowired
    TodoService todoService;
    
    @GetMapping("/list")
    public List<TodoEntity> list() {
        System.out.println("[Controller]");
        List<TodoEntity> result = todoService.getTodos();
        return result;
    }

    @GetMapping("/todos/{id}")
    public TodoEntity find(@PathVariable Integer id) {
        TodoEntity result = todoService.findById(id);
        return result;
    }
}