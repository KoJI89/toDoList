package com.example.todo.todo_Item;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	public TodoBean get(final String id) {
		return TodoBean.builder().title("Add an id Validation").build();
	}

}
