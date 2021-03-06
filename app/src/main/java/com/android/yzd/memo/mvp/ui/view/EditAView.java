package com.android.yzd.memo.mvp.ui.view;

import com.android.yzd.memo.bean.God;

import java.util.List;

/**
 * Created by Clearlove on 16/1/17.
 */
public interface EditAView {

    void initSpinner(List<String> data);
    void initCreateModel();
    void initEditModel();
    void initViewModel(God god, int positionType);
    String getTitleName();
    String getUserName();
    String getPassWord();
    void setTime(String time);
    void showSnackToast(String msg);
    void setItemMenuVisible(boolean visible);
    void finishActivity();
    void setPassWordVisible(boolean visible);
    void hideKeyBoard();
    void setToolBarTitle(int resId);
    void showSaveDialog();
    void hideSaveDialog();
}
