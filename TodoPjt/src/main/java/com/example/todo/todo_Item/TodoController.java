package com.example.todo.todo_Item;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public @ResponseBody TodoResponse get(@PathVariable(value="id") String id){
        List<String> errors = new ArrayList<>();
        TodoBean todoBean = null;
        try{
            todoBean = todoService.get(id);
        }catch(final Exception e){
            errors.add(e.getMessage());
        }
        return TodoAdapter.toTodoResponse(todoBean, errors);
    }
}