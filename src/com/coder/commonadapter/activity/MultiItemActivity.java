package com.coder.commonadapter.activity;

import java.util.ArrayList;
import java.util.List;

import com.coder.commonadapter.ChatAdapter;
import com.coder.commonadapter.R;
import com.coder.commonadapter.bean.ChatBean;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

public class MultiItemActivity extends Activity{
	private ListView lv_single;
	private List<ChatBean> mData;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.mutli_activity);
		initData();
		initView();
	}
	private void initView() {
		lv_single=(ListView) findViewById(R.id.lv_mutli);	
		lv_single.setAdapter(new ChatAdapter(getApplicationContext(), mData));
	}
	private void initData() {
		mData=new ArrayList<ChatBean>();
		
		ChatBean bean=new ChatBean();
		bean.setChatMsg(false);
		bean.setContent("今天干嘛？？");
		bean.setIcon("http://b.hiphotos.baidu.com/baike/c0%3Dbaike80%2C5%2C5%2C80%2C26/sign=9db9758da6c27d1eb12b33967abcc60b/21a4462309f79052d1a480170ef3d7ca7bcbd564.jpg");
		bean.setName("习近平");
		bean.setTime("2015/8/15/8:88:88");
		mData.add(bean);

		ChatBean bean1=new ChatBean();
		bean1.setChatMsg(true);
		bean1.setContent("lol !!!");
		bean1.setIcon("http://f.hiphotos.baidu.com/baike/c0%3Dbaike92%2C5%2C5%2C92%2C30/sign=b151816491dda144ce0464e0d3debbc7/8694a4c27d1ed21bb3720b92ab6eddc451da3f09.jpg");
		bean1.setName("奥巴马");
		bean1.setTime("2015/8/15/8:88:88");
		mData.add(bean1);
		ChatBean bean2=new ChatBean();
		bean2.setChatMsg(false);
		bean2.setContent("中秋节快到，你小子还不赶紧送月饼来");
		bean2.setIcon("http://b.hiphotos.baidu.com/baike/c0%3Dbaike80%2C5%2C5%2C80%2C26/sign=9db9758da6c27d1eb12b33967abcc60b/21a4462309f79052d1a480170ef3d7ca7bcbd564.jpg");
		bean2.setName("习近平");
		bean2.setTime("2015/8/15/8:88:88");
		mData.add(bean2);
		ChatBean bean3=new ChatBean();
		bean3.setChatMsg(true);
		bean3.setContent("好，亲自给你送过去");
		bean3.setIcon("http://f.hiphotos.baidu.com/baike/c0%3Dbaike92%2C5%2C5%2C92%2C30/sign=b151816491dda144ce0464e0d3debbc7/8694a4c27d1ed21bb3720b92ab6eddc451da3f09.jpg");
		bean3.setName("奥巴马");
		bean3.setTime("2015/8/15/8:88:88");
		mData.add(bean3);
		ChatBean bean4=new ChatBean();
		bean4.setChatMsg(false);
		bean4.setContent("越快越好");
		bean4.setIcon("http://b.hiphotos.baidu.com/baike/c0%3Dbaike80%2C5%2C5%2C80%2C26/sign=9db9758da6c27d1eb12b33967abcc60b/21a4462309f79052d1a480170ef3d7ca7bcbd564.jpg");
		bean4.setName("习近平");
		bean4.setTime("2015/8/15/8:88:88");
		mData.add(bean4);
		ChatBean bean5=new ChatBean();
		bean5.setChatMsg(false);
		bean5.setContent("今天干嘛？？");
		bean5.setIcon("http://b.hiphotos.baidu.com/baike/c0%3Dbaike80%2C5%2C5%2C80%2C26/sign=9db9758da6c27d1eb12b33967abcc60b/21a4462309f79052d1a480170ef3d7ca7bcbd564.jpg");
		bean5.setName("习近平");
		bean5.setTime("2015/8/15/8:88:88");
		mData.add(bean5);

		ChatBean bean6=new ChatBean();
		bean6.setChatMsg(true);
		bean6.setContent("lol !!!");
		bean6.setIcon("http://f.hiphotos.baidu.com/baike/c0%3Dbaike92%2C5%2C5%2C92%2C30/sign=b151816491dda144ce0464e0d3debbc7/8694a4c27d1ed21bb3720b92ab6eddc451da3f09.jpg");
		bean6.setName("奥巴马");
		bean6.setTime("2015/8/15/8:88:88");
		mData.add(bean6);
		ChatBean bean7=new ChatBean();
		bean7.setChatMsg(false);
		bean7.setContent("中秋节快到，你小子还不赶紧送月饼来");
		bean7.setIcon("http://b.hiphotos.baidu.com/baike/c0%3Dbaike80%2C5%2C5%2C80%2C26/sign=9db9758da6c27d1eb12b33967abcc60b/21a4462309f79052d1a480170ef3d7ca7bcbd564.jpg");
		bean7.setName("习近平");
		bean7.setTime("2015/8/15/8:88:88");
		mData.add(bean7);
		ChatBean bean8=new ChatBean();
		bean8.setChatMsg(true);
		bean8.setContent("好，亲自给你送过去");
		bean8.setIcon("http://f.hiphotos.baidu.com/baike/c0%3Dbaike92%2C5%2C5%2C92%2C30/sign=b151816491dda144ce0464e0d3debbc7/8694a4c27d1ed21bb3720b92ab6eddc451da3f09.jpg");
		bean8.setName("奥巴马");
		bean8.setTime("2015/8/15/8:88:88");
		mData.add(bean8);
		ChatBean bean9=new ChatBean();
		bean9.setChatMsg(false);
		bean9.setContent("越快越好");
		bean9.setIcon("http://b.hiphotos.baidu.com/baike/c0%3Dbaike80%2C5%2C5%2C80%2C26/sign=9db9758da6c27d1eb12b33967abcc60b/21a4462309f79052d1a480170ef3d7ca7bcbd564.jpg");
		bean9.setName("习近平");
		bean9.setTime("2015/8/15/8:88:88");
		mData.add(bean9);
	}
}
