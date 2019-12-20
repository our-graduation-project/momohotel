package com.xqr.momohotel.service.Impl;

import com.xqr.momohotel.dao.RoomNoMapper;
import com.xqr.momohotel.dao.RoomsMapper;
import com.xqr.momohotel.model.RoomNo;
import com.xqr.momohotel.model.RoomNoExample;
import com.xqr.momohotel.model.Rooms;
import com.xqr.momohotel.service.RoomNumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author
 * @Date 2019/12/20 18:08
 * @Version 1.0
 */
@Service
public class RoomNumbersServiceImpl implements RoomNumbersService {

    @Autowired
    private RoomNoMapper roomNoMapper;

    @Autowired
    private RoomsMapper roomsMapper;
    /**
     * 根据酒店的这种房间类型ID查询酒店所有的这种类型房间的房间号
     * @param roomId
     * @return
     */
    @Override
    public List<RoomNo> checkRoomHaveNumber(int roomId) {
        RoomNoExample roomNoExample = new RoomNoExample();
        roomNoExample.or().andRoomIdEqualTo(roomId);
        List<RoomNo> roomNos = roomNoMapper.selectByExample(roomNoExample);
        return roomNos;
    }

    /**
     * 根据房间号查询房间信息
     * @param roomNumber
     * @return
     */
    @Override
    public Rooms checkNumberIsRoom(String roomNumber) {
        Rooms rooms = roomsMapper.selectRoomsByRoomNum(roomNumber);
        return rooms;
    }

    /**
     * 添加房间
     * @param roomId
     * @param roomNumber
     * @return
     */
    @Override
    public int addRoomNum(Integer hoteleId,Integer roomId, String roomNumber) {
        RoomNo roomNo = new RoomNo();
        roomNo.setHoteleId(hoteleId);
        roomNo.setRoomId(roomId);
        roomNo.setRoomNumber(roomNumber);
        return roomNoMapper.insert(roomNo);
    }

    /**
     * 根据房间号删除房间
     * @param roomNumber
     * @return
     */
    @Override
    public int deleteRoomNum(String roomNumber) {
       RoomNoExample roomNoExample = new RoomNoExample();
       roomNoExample.or().andRoomNumberEqualTo(roomNumber);
       return roomNoMapper.deleteByExample(roomNoExample);
    }
}
