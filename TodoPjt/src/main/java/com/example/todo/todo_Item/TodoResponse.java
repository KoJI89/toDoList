package com.example.todo.todo_Item;

import java.util.List;

import com.example.todo.apiResponse.CommonResponse;

import lombok.Builder;

public class TodoResponse extends CommonResponse<TodoBean> {
    @Builder
    public TodoResponse(final TodoBean todoBean, final List<String> errors){
        super(todoBean);
        this.setErrors(errors);
    }    
}