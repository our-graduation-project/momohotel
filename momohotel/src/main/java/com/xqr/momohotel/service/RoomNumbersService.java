package com.xqr.momohotel.service;

import com.xqr.momohotel.model.RoomNo;
import com.xqr.momohotel.model.Rooms;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Date 2019/12/20 17:17
 * @Version 1.0
 */

@Service
public interface RoomNumbersService {

    /**
     * 根据房间名ID查询所有酒店的这种房间号
     * @param roomId
     * @return
     */
    List<RoomNo> checkRoomHaveNumber(int roomId);

    /**
     * 根据房间号查询房间信息
     * @param roomNumber
     * @return
     */
    Rooms checkNumberIsRoom(String roomNumber);

    /**
     * 添加房间
     * @param roomId
     * @param roomNumber
     * @return
     */
    int addRoomNum(Integer hoteleId,Integer roomId, String roomNumber);

    /**
     * 根据房间号删除房间
     * @param roomNumber
     * @return
     */
    int deleteRoomNum(String roomNumber);
}
