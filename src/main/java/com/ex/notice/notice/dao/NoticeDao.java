package com.ex.notice.notice.dao;

import com.ex.notice.notice.dto.FileDto;
import com.ex.notice.notice.dto.LoginUser;
import com.ex.notice.notice.dto.NoticeDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper

public interface NoticeDao {

    LoginUser login(LoginUser loginUser);

    int register(LoginUser registerUser);

    List<NoticeDto> getNoticeList();

    NoticeDto noticeContent(int seq);

    int noticeInsert(NoticeDto notice);

    int noticeUpdate(NoticeDto notice);

    int noticeDelete(int seq);

    int fileInsert(FileDto file);

    FileDto fileNotice (int board_seq);

    int fileUpdate (FileDto fileDto);

    void fileDelete(int seq);

    void fileUpsert(FileDto fileDto);
}
