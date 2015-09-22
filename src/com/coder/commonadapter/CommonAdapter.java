package com.coder.commonadapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Õ®”√adapter
 * @author tom
 *
 * @param <T>
 */
public abstract class CommonAdapter<T> extends BaseAdapter{

	private Context mContext;
	private List<T> mData;
	private LayoutInflater inflater;
	private int mItemLayoutId;
	public	CommonAdapter(Context context,List<T> list,int itemLayoutId) {
		this.mContext=context;
		this.mData=list;
		this.inflater=LayoutInflater.from(mContext);
		this.mItemLayoutId=itemLayoutId;
	}
	@Override
	public int getCount() {
		return mData.size();
	}

	@Override
	public T getItem(int position) {
		return mData.get(position);
	}
	@Override
	public long getItemId(int position) {
		return position;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		final	ViewHolder viewHolder=getViewHolder(position, convertView, parent);
		convert(viewHolder, getItem(position));
		return viewHolder.getConvertView();
	}

	public abstract void convert(ViewHolder helper, T item);

	private  ViewHolder getViewHolder(int postion,View convertView,ViewGroup parent){
		return ViewHolder.get(mContext, convertView, parent, mItemLayoutId, postion);
	}
}
