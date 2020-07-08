package com.board.demo.service;

import com.board.demo.dto.BoardDto;
import com.board.demo.entity.BoardEntity;
import com.board.demo.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BoardService {

    public BoardRepository boardRepository;

    public Long savePost(BoardDto boardDto) {

        return boardRepository.save(boardDto.toEntity()).getId();

    }


}
