package Model;

import android.content.Context;
import vo.Contact;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//通讯录
public interface AddressBookModel {

    Map<String, List<String>> getAddressBookInfo(); //从本机通讯录获取联系人信息
    List<Contact> getContactList(); //获取本机联系人详情(姓名，电话，SIP)
    void setAddressBookInfo(Map<String, List<String>> addressBookInfo);
    void insertContactToMachine(Context context, Contact contact);

}
