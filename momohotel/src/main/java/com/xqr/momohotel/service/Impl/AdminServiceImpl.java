package com.xqr.momohotel.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xqr.momohotel.dao.AdminsMapper;
import com.xqr.momohotel.model.Admins;
import com.xqr.momohotel.model.AdminsExample;
import com.xqr.momohotel.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Date: Created in 17:34 2019/12/18
 * @Modifued By:
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminsMapper adminsMapper;


    /**
     * 管理员登录验证
     *
     * @param adminName 管理员姓名
     * @param adminPassword 管理员密码
     * @return
     */
    @Override
    public Admins login(String adminName, String adminPassword) {
        AdminsExample adminsExample = new AdminsExample();
        adminsExample.or().andAdminNameEqualTo(adminName)
                .andAdminPasswordEqualTo(adminPassword);
        List<Admins> admins = adminsMapper.selectByExample(adminsExample);

        if(admins == null && admins.size() != 1){
            return null;
        }

        return admins.get(0);
    }

    /**
     * 管理员增加
     *
     * @param admins 管理员
     * @return
     */
    @Override
    public int addAdmin(Admins admins) {

        int insert = adminsMapper.insert(admins);

        return insert;
    }

    /**
     * 管理员增加
     *
     * @param indexPage 页码
     * @param pageSize 分页大小
     * @return
     */
    @Override
    public PageInfo searchAdmins(int indexPage,int pageSize) {

        AdminsExample adminsExample = new AdminsExample();
        adminsExample.or();
        PageHelper.startPage(indexPage,pageSize);
        List<Admins> admins = adminsMapper.selectByExample(adminsExample);
        PageInfo pageInfo = new PageInfo(admins);
        return pageInfo;
    }

    /**
     * 通过管理员id查询管理员
     *
     * @param adminId 页码
     * @return
     */
    @Override
    public Admins searchByIdAdmin(int adminId) {

        Admins admins = adminsMapper.selectByPrimaryKey(adminId);

        return admins;
    }

    /**
     * 批量增加管理员
     *
     * @param adminsList 管理员列表
     * @return
     */
    @Override
    public int addBatch(List<Admins> adminsList) {
        int i = adminsMapper.addBatchAdmins(adminsList);
        return i;
    }

    /**
     * 管理员修改密码
     *
     * @param adminId 管理员id
     * @param adminPassword 管理员原密码
     * @param newPwd 管理员修改后密码
     * @return
     */
    @Override
    public int updatePwd(int adminId, String adminPassword, String newPwd) {
        Admins admins = adminsMapper.selectByPrimaryKey(adminId);
        if(!admins.getAdminPassword().equals(adminPassword)){
            return 0;
        }
        Admins admins1 = new Admins();
        admins1.setAdminId(adminId);
        admins1.setAdminPassword(newPwd);
        int i = adminsMapper.updateByPrimaryKeySelective(admins1);
        return i;
    }

    /**
     * 通过管理员名模糊分页查询管理员
     *
     * @param name 管理员名
     * @param indexPage  页码
     * @param pageSize  分页大小
     * @return
     */
    @Override
    public PageInfo searchAdminByName(String name,int indexPage,int pageSize) {
        AdminsExample adminsExample = new AdminsExample();
        adminsExample.or().andAdminNameLike(name+"%");
        PageHelper.startPage(indexPage,pageSize);
        List<Admins> admins = adminsMapper.selectByExample(adminsExample);
        PageInfo pageInfo = new PageInfo(admins);
        return pageInfo;
    }


    /**
     * 通过管理员编号查询管理员
     *
     * @param adminNo 管理员编号
     * @return
     */
    @Override
    public Admins searchAdminByNo(String adminNo) {
        AdminsExample adminsExample = new AdminsExample();
        adminsExample.or().andAdminNoEqualTo(adminNo);
        List<Admins> admins = adminsMapper.selectByExample(adminsExample);

        return null;
    }

    /**
     * 通过管理员id删除管理员
     *
     * @param adminId 管理员id
     * @return
     */
    @Override
    public int deleteAdmin(int adminId) {

        int i = adminsMapper.deleteByPrimaryKey(adminId);
        return i;
    }
}