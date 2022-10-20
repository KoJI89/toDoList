package com.example.todo.todo_Item;

import lombok.*;

@Data				// 데이터
@Getter @Setter		// 게터세터
@NoArgsConstructor // 기본생성자 자동 생성
@AllArgsConstructor// 모든 필드값을 파라미터로 받는 생성자를 마들어줌
@Builder			// 데이터 일관성을 위해 정보들을 다 받은 후 객체를 생성한다.

public class TodoBean {
	private String id;
	private String title;
	private boolean done;

}
