package com.example.todo.apiResponse;

import java.util.List;

import lombok.*;

@Getter @Setter
@RequiredArgsConstructor
public abstract class CommonResponse<T> {
	@NonNull private T data;
	private List<String> errors;

}
