package shop.samdul.hellojava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import shop.samdul.hellojava.entity.TodoEntity;
import shop.samdul.hellojava.service.TodoService;

@RestController
public class TodoController {

    @Autowired
    TodoService todoService;
    
    @GetMapping("/users")
    public List<TodoEntity> list() {
        System.out.println("[Controller]");
        List<TodoEntity> result = todoService.getTodos();
        return result;
    }

    @GetMapping("/users/{id}")
    public TodoEntity find(@PathVariable Integer id) {
        System.out.println("[Controller]");
        TodoEntity result = todoService.findById(id);
        return result;
    }

    @PostMapping("/users")
    public void create(@RequestBody String subject, String body, Boolean completed) {
        System.out.println("[Controller]");
        todoService.create(subject, body, completed);
        System.out.println("[create end]");
    }

    // 모든 것 수정
    @PutMapping("/users")
    public void updatePut(@RequestBody Integer id, String subject, String body, Boolean completed) {
        System.out.println("[Controller]");
        todoService.updateByPut(id, subject, body, completed);
        System.out.println("[put end]");
    }
    // 일부 수정 
    @PatchMapping("/users")
    public void updatePatch(@RequestBody Integer id, String subject, String body, Boolean completed) {
        System.out.println("[Controller]");
        todoService.updateByPut(id, subject, body, completed);
        System.out.println("patch end");
    }

    @DeleteMapping("/users/{id}")
    public void delete(@RequestBody Integer id) {
        System.out.println("[Controller]");
        todoService.delete(id);
    }
}