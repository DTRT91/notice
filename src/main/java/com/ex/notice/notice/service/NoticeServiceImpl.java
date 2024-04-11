package com.ex.notice.notice.service;



import com.ex.notice.notice.dto.NoticeDto;
import com.ex.notice.notice.dao.NoticeDao;
import com.ex.notice.notice.dto.FileDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor

public class NoticeServiceImpl implements NoticeService {

    private final NoticeDao noticeDao;

    @Override
    public List<NoticeDto> getNoticeList() {
        return noticeDao.getNoticeList();
    }

    @Override
    public NoticeDto noticeContent(int seq) {
        return noticeDao.noticeContent(seq);
    }

    @Override
    public int noticeInsert(NoticeDto notice) {
        return noticeDao.noticeInsert(notice);
    }

    @Override
    @Transactional
    public int noticeUpdate(NoticeDto notice) {
        try{
            return noticeDao.noticeUpdate(notice);
        }catch(Exception e){
            return 0;
        }
    }

    @Override
    public int noticeDelete(int seq) {
        return noticeDao.noticeDelete(seq);
    }

    @Override
    public int fileInsert(FileDto file) {
        return noticeDao.fileInsert(file);
    }

    @Override
    public FileDto fileNotice(int board_seq) {
        return noticeDao.fileNotice(board_seq);
    }

    @Override
    public FileDto fileUpdate(FileDto fileDto) {
        noticeDao.fileUpdate(fileDto);
        return null;
    }

    @Override
    public void fileDelete(int seq) {
        noticeDao.fileDelete(seq);
    }

    @Override
    public void fileUpsert(FileDto fileDto) {
        noticeDao.fileUpsert(fileDto);
    }
}
