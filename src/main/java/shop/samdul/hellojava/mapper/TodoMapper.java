package shop.samdul.hellojava.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import shop.samdul.hellojava.entity.TodoEntity;

@Mapper
public interface TodoMapper {
    List<TodoEntity> findAll();
    TodoEntity findById(int id);
}