package shop.samdul.hellojava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;
import shop.samdul.hellojava.entity.TodoEntity;
import shop.samdul.hellojava.service.TodoService;

@RestController
@RequestMapping("/jpatodos")
public class TodoJpaController {

    @Autowired
    // private final TodoJpaService TodoJpaService;
    public TodoJpaController(TodoJpaService todoJpaController) {
        this.todoJpaService = todoJpaService;
    }

    // TodoService todoService;
    // /////////////////////////////////////////
    @GetMapping
    public List<TodoEntity> list() {
        return todoJpaService.getAllTodos();
    }

    @GetMapping("/{id}")
    public TodoEntity find(@PathVariable Integer id) {
        TodoEntity r = todoJpaService.getTodoById(id);
        return r;
    }

    // C - INSERT
    @PostMapping
    public TodoEntity createTodo(@RequestBody TodoEntity todoEntity) {
        return todoJpaService.createTodo(todoEntity);
    }

    // U - UPDATE
    @PutMapping("/{id}")
    public TodoEntity updateTodo(@PathVariable Integer id, @RequestBody TodoEntity todoEntity) {
        return todoJpaService.updateTodo(id, todoEntity);
    }

    // D - DELETE
    @DeleteMapping("/{id}")
    public TodoEntity deleteTodo(@PathVariable Integer id) {
        return todoJpaService.deleteTodo(id);
    }
    // /////////////////////////////////////////

    // @GetMapping("/users")
    // public List<TodoEntity> list() {
    //     System.out.println("[Controller]");
    //     List<TodoEntity> result = todoService.getTodos();
    //     return result;
    // }

    // @GetMapping("/users/{id}")
    // public TodoEntity find(@PathVariable Integer id) {
    //     System.out.println("[Controller]");
    //     TodoEntity result = todoService.findById(id);
    //     return result;
    // }

    // @PostMapping("/users")
    // public ResponseEntity<Void> create(@RequestBody TodoEntity todoEntity) {
    //     System.out.println("[Controller]");
    //     try {
    //         todoService.create(todoEntity.getSubject(), todoEntity.getBody(), todoEntity.getCompleted());
    //         System.out.println("[put end]");
    //         return ResponseEntity.status(HttpStatus.OK).build(); // 성공 상태 코드 200
    //     } catch (Exception e) {
    //         System.out.println("Error: " + e.getMessage());
    //         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // 오류 상태 코드 500
    //     }
    // }

    // // 모든 것 수정
    // @PutMapping("/users/{id}")
    // public ResponseEntity<Void> updatePut(@PathVariable Integer id, @RequestBody TodoEntity todoEntity) {
    //     System.out.println("[Controller]");
    //     try {
    //         todoService.updateByPut(id, todoEntity.getSubject(), todoEntity.getBody(), todoEntity.getCompleted());
    //         System.out.println("[put end]");
    //         return ResponseEntity.status(HttpStatus.OK).build(); // 성공 상태 코드 200
    //     } catch (Exception e) {
    //         System.out.println("Error: " + e.getMessage());
    //         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // 오류 상태 코드 500
    //     }
    // }
    // // 일부 수정 
    // @PatchMapping("/users/{id}")
    // public ResponseEntity<Void> updatePatch(@PathVariable Integer id, @RequestBody TodoEntity todoEntity) {
    //     System.out.println("[Controller]");
    //     try {
    //         todoService.updateByPut(id, todoEntity.getSubject(), todoEntity.getBody(), todoEntity.getCompleted());
    //         System.out.println("[put end]");
    //         return ResponseEntity.status(HttpStatus.OK).build(); // 성공 상태 코드 200
    //     } catch (Exception e) {
    //         System.out.println("Error: " + e.getMessage());
    //         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // 오류 상태 코드 500
    //     }
    // }

    // @DeleteMapping("/users/{id}")
    // public ResponseEntity<Void> delete(@PathVariable Integer id) {
    //     System.out.println("[Controller]");
    //     try {
    //         todoService.delete(id);
    //         System.out.println("[put end]");
    //         return ResponseEntity.status(HttpStatus.OK).build(); // 성공 상태 코드 200
    //     } catch (Exception e) {
    //         System.out.println("Error: " + e.getMessage());
    //         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // 오류 상태 코드 500
    //     }
    // }
}