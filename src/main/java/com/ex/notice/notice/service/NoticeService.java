package com.ex.notice.notice.service;



import com.ex.notice.notice.dto.FileDto;
import com.ex.notice.notice.dto.NoticeDto;

import java.util.List;

public interface NoticeService {

    List<NoticeDto> getNoticeList();

    NoticeDto noticeContent(int seq);

    int noticeInsert(NoticeDto notice);

    int noticeUpdate(NoticeDto notice);

    int noticeDelete(int seq);

    int fileInsert(FileDto file);

    FileDto fileNotice (int board_seq);

    FileDto fileUpdate (FileDto fileDto);

    void fileDelete(int seq);

    void fileUpsert(FileDto fileDto);
}
