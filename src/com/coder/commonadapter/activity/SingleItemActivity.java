package com.coder.commonadapter.activity;

import java.util.ArrayList;
import java.util.List;

import com.coder.commonadapter.CommonAdapter;
import com.coder.commonadapter.R;
import com.coder.commonadapter.ViewHolder;
import com.coder.commonadapter.bean.SingleBean;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class SingleItemActivity extends Activity{
	private ListView lv_single;
	private List<SingleBean> mData;
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.single_activity);
		initData();
		initView();
	}

	private void initView() {

		lv_single=(ListView) findViewById(R.id.lv_single);
		lv_single.setAdapter(new CommonAdapter<SingleBean>(getApplicationContext(),mData,R.layout.single_item) {

			@Override
			public void convert(ViewHolder helper, SingleBean bean) {
				helper.setImageUrlByPicasso(R.id.item_icon, bean.getIconUrl());
				helper.setText(R.id.item_content, bean.getContent());
				helper.setText(R.id.item_title, bean.getTitle());
				helper.setText(R.id.item_time, bean.getTime());
			}
		});
		lv_single.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent intent=new Intent(getApplicationContext(), MultiItemActivity.class);
				startActivity(intent);
			}
		});
	}

	private void initData() {
		mData=new ArrayList<SingleBean>();
		for (int i = 0; i < 20; i++) {
			SingleBean bean=new SingleBean();
			bean.setIconUrl("http://img0.imgtn.bdimg.com/it/u=1070902365,2619384777&fm=116&gp=0.jpg");
			bean.setTitle("小明回家吃放了"+i);
			bean.setContent("你妈妈喊你回家吃放"+i);
			bean.setTime("2015/8/28");
			mData.add(bean);
		}
	}

}

