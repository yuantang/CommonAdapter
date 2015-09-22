package com.coder.commonadapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public abstract class MultiItemCommonAdapter<T> extends CommonAdapter<T>{
	protected MultiItemTypeSupport<T> mMultiItemTypeSupport;
	private List<T> mList;
	private Context mContext;

	public MultiItemCommonAdapter(Context context, List<T> list,MultiItemTypeSupport multiItemTypeSupport) {
		super(context, list, -1);
		mMultiItemTypeSupport=multiItemTypeSupport;
		mList=list;
		mContext=context;
	}
	@Override
	public int getViewTypeCount() {
		if (mMultiItemTypeSupport!=null) {
			return mMultiItemTypeSupport.getViewTypeCount();
		}
		return super.getViewTypeCount();
	}
	@Override
	public int getItemViewType(int position) {
		if (mMultiItemTypeSupport!=null) {
			return mMultiItemTypeSupport.getItemViewType(position,mList.get(position));
		}
		return super.getItemViewType(position);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (mMultiItemTypeSupport!=null) {
			int layoutId=mMultiItemTypeSupport.getLayoutId(position, getItem(position));
			ViewHolder viewHolder=ViewHolder.get(mContext, convertView, parent, layoutId, position);
			convert(viewHolder, getItem(position));
			return viewHolder.getConvertView();
		} 
		return super.getView(position, convertView, parent);
	}

}