package shop.samdul.hellojava.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.metadata.TomcatDataSourcePoolMetadata;
import org.springframework.stereotype.Service;
import shop.samdul.hellojava.entity.TodoEntity;
import shop.samdul.hellojava.mapper.TodoMapper;

@Service
public class TodoJpaService {
    private final TodoRepository todoRepository;
    @Autowired
    public TodoJpaService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<TodoEntity> getAllTodos() {
        return todoRepository.findAll();
    }
    public Optional<TodoEntity> TodoEntity getTodoById(Integer id) {
        return todoRepository.findById(id);
    }
    public TodoEntity createTodo(TodoEntity todoEntity) {
        return todoRepository.save(todoEntity);
    }
    public TodoEntity updateTodoById(Integer id) {
        Optional<TodoEntity> existingTodoOpt = todoRepository.findById(id);
        
        if (existingTodoOpt.isPresent()) {
            TodoEntity existingTodo = existingTodoOpt.get();
            existingTodo.setSubject(todoEntity.getSubject());
            existingTodo.setBody(todoEntity.getBody());
            existingTodo.setCompleted(todoEntity.getCompleted());
            return todoRepository.save(existingTodo);
        }
    }
}

@Service
public class TodoService {
    @Autowired
    TodoMapper todoMapper;

    public List<TodoEntity> getTodos() {
        System.out.println("[service] findAll");
        List<TodoEntity> todos = todoMapper.findAll();
        System.out.println("[todos]:" + todos.size());
        return todos;
    }

    public TodoEntity findById(Integer id) {
        System.out.println("[service] selectOne");
        TodoEntity todo = todoMapper.findById(id);
        return todo;
        
    }

    public void create(String subject, String body, Boolean completed) {
        System.out.println("[service] create");
        todoMapper.add(subject, body, completed);
    }

    public void updateByPut(Integer id, String subject, String body, Boolean completed) {
        System.out.println("[service] create");
        todoMapper.updateByPut(id, subject, body, completed);
    }

    public void delete(Integer id) {
        System.out.println("[service] delete");
        todoMapper.delete(id);
    }
}
