package com.board.dto.board;

import lombok.Getter;

import java.util.List;

@Getter
public class BoardPageResponse {
    private List<BoardResponse> boards;
    private long totalSize;

    public BoardPageResponse(List<BoardResponse> boards, long totalSize) {
        this.boards = boards;
        this.totalSize = totalSize;
    }

}
