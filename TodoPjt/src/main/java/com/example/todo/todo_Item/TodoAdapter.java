package com.example.todo.todo_Item;

import java.util.List;

public class TodoAdapter {
    public static TodoResponse toTodoResponse(final TodoBean todoBean, final List<String> errors){
        return TodoResponse.builder()
        		.todoBean(todoBean)
        		.errors(errors)
        		.build();
    }    
}