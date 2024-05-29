package com.trioshop.repository.mybatis;

import com.trioshop.model.dto.user.*;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    UserInfoBySession loginUser(UserIdPasswd userIdPasswd);

    UserPatch findUserByUserCode(String userCode);

    UserFindId findId(@Param("userName") String userName,
                      @Param("userTel") String userTel);

    UserFindPw findPw(@Param("userName") String userName,
                      @Param("userId") String userId);

    boolean updatePw(@Param("userId") String userId, @Param("userPasswd") String userPasswd);


    // TRIO_USERS 테이블에 사용자 정보 저장
    boolean saveUsers(UserJoin userJoin);
    boolean saveUserInfo(UserJoin userJoin);

    GuestUserJoin LoginGuestUser(GuestUserJoin guestUserJoin);
    boolean saveGuestUsers(GuestUserJoin guestUserJoin);
    boolean saveGuestUsers2(GuestUserJoin2 guestUserJoin2);

    boolean patchUserPw(UserPatch userPatch);
    boolean patchUser(UserPatch userPatch);


}
