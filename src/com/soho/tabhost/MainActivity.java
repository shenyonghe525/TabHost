package com.soho.tabhost;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity implements OnClickListener{

	Button btn;
	public void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 
	 //调用TabActivity的getTabHost()方法获取TabHost对象
	 TabHost tabHost = getTabHost();
	 
	 //设置使用TabHost布局
	 LayoutInflater.from(this).inflate(R.layout.tabhost, tabHost.getTabContentView(),true);
	 
	//添加第一个标签页
	 tabHost.addTab(tabHost.newTabSpec("tab01").setIndicator("已接电话").setContent(R.id.tab01));
	 
	 //添加第二个标签页,并在其标签上添加一个图片
	 tabHost.addTab(tabHost.newTabSpec("tab02").setIndicator("未接电话").setContent(R.id.tab02));
	 
	 //添加第三个标签页
	 tabHost.addTab(tabHost.newTabSpec("tab03").setIndicator("已拨电话").setContent(R.id.tab03));
     btn = (Button)findViewById(R.id.tv_btn);
     btn.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Toast.makeText(getBaseContext(), "hello", Toast.LENGTH_SHORT).show();
	}
}
