package shop.samdul.hellojava.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import shop.samdul.hellojava.entity.TodoEntity;

@Mapper
public interface TodoMapper {
    List<TodoEntity> findAll();
    TodoEntity findById(int id);
    void add(String subject, String body, Boolean completed);
    void updateByPut(int id, String subject, String body, Boolean completed);
    void updateByPatch(int id, String subject, String body, Boolean completed);
    void delete(int id);
}