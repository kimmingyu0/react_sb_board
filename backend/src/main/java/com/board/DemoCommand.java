package com.board;

import com.board.domain.Board;
import com.board.dto.BoardRequest;
import com.board.repository.BoardRepository;
import com.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class DemoCommand implements CommandLineRunner {
    private final BoardService boardService;
    private final BoardRepository boardRepository;
    @Override
    public void run(String... args) throws Exception {
//        Board board = boardRepository.findById(1L).get();
//        boardRepository.delete(board);
//
//        BoardRequest boardRequest = new BoardRequest();
//        for(int i=1; i<101;i++) {
//            boardRequest.setUsername("kimmingyu0");
//            boardRequest.setText(i+"번째 테스트 글입니다.");
//            boardRequest.setTitle(i+"번째 테스트 글입니다.");
//            boardService.register(boardRequest);
//        }
//
    }
}
