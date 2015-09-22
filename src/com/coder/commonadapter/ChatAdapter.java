package com.coder.commonadapter;

import java.util.List;

import android.content.Context;

import com.coder.commonadapter.bean.ChatBean;

public  class ChatAdapter extends MultiItemCommonAdapter<ChatBean>{

	public ChatAdapter(Context context, List<ChatBean> list){
		super(context, list, new MultiItemTypeSupport<ChatBean>() {
			@Override
			public int getLayoutId(int position, ChatBean chatbean) {
				if (chatbean.isChatMsg()) {
					return R.layout.chatmsg_receive_item;
				} 
				return R.layout.chatmsg_send_item;
			}
			@Override
			public int getViewTypeCount() {
				return 2;
			}
			@Override
			public int getItemViewType(int postion, ChatBean chatbean) {
				if (chatbean.isChatMsg()) {
					return chatbean.RECEIVE_MSG;
				}
				return chatbean.SEND_MSG;
			}
		});
	}
	@Override
	public void convert(ViewHolder helper, ChatBean item) {
		switch (helper.getLayoutId()) {
		case R.layout.chatmsg_receive_item:
			helper.setText(R.id.tv_receive_time, item.getTime());
			helper.setText(R.id.tv_receive_user_name, item.getName());
			helper.setText(R.id.tv_receive_content, item.getContent());
			helper.setImageUrlByPicasso(R.id.iv_receive_user_icon, item.getIcon());
			break;
		case R.layout.chatmsg_send_item:
			helper.setText(R.id.tv_send_time, item.getTime());
			helper.setText(R.id.tv_send_user_name, item.getName());
			helper.setText(R.id.tv_send_content, item.getContent());
			helper.setImageUrlByPicasso(R.id.iv_send_user_icon, item.getIcon());
			break;
		}

	}





}
