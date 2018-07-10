package com.example.hp.page;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    Button btn_Login;
    Button btn_Register;
    Button btn_FindPassword;
    ImageButton btn_QQ;
    ImageButton btn_WeiXin;
    ImageButton btn_Weibo;

    EditText et_Username;
    EditText et_Password;

    View.OnClickListener linster=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch(view.getId())
            {
                case R.id.btn_login:
                    if(CheckUsernameAndPassword(et_Username.getText().toString(),et_Password.getText().toString()))
                    {
                        //向下一个Activity传送数据
                    }
                    break;
                case R.id.btn_register:
                    //跳转道注册界面
                    break;
                default:
                    break;
            }
        }
    };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Login=(Button)findViewById(R.id.btn_login);
        btn_Register=(Button)findViewById(R.id.btn_register);
        btn_FindPassword=(Button)findViewById(R.id.btn_findPassword);
        btn_QQ=(ImageButton)findViewById(R.id.btn_qq);
        btn_WeiXin=(ImageButton)findViewById(R.id.btn_weixin);
        btn_Weibo=(ImageButton)findViewById(R.id.btn_weibo);

        et_Username=(EditText)findViewById(R.id.et_username);
        et_Password=(EditText)findViewById(R.id.et_password);
    }

    boolean CheckUsernameAndPassword(String username,String password)
    {
        //验证密码是否正确

        return false;
    }
}
