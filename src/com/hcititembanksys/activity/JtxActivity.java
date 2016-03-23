package com.hcititembanksys.activity;

import java.util.List;

import com.example.hcititembanksys.R;
import com.hcititembanksys.util.TreeViewAdapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.ExpandableListContextMenuInfo;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class JtxActivity extends Activity {
	ImageView topbutton=null;
	ExpandableListView expandableList; 
	TreeViewAdapter adapter; 
	public String[] groups = { "高等数学", "大学物理", "大学英语","C语言","JAVA","数据结构","C++","C#","软件设计","数据库","电子基础","计算机组成原理"}; 
	public String[][] child= { 
	{ "第一章", "第二章", "第三章", "第四章" }, 
	{ "第一章", "第二章", "第三章", "第四章"}, 
	{ "第一章", "第二章", "第三章", "第四章" } ,
	{ "第一章", "第二章", "第三章", "第四章" }, 
	{ "第一章", "第二章", "第三章", "第四章"}, 
	{ "第一章", "第二章", "第三章", "第四章" } ,
	{ "第一章", "第二章", "第三章", "第四章" }, 
	{ "第一章", "第二章", "第三章", "第四章"}, 
	{ "第一章", "第二章", "第三章", "第四章" } ,
	{ "第一章", "第二章", "第三章", "第四章" }, 
	{ "第一章", "第二章", "第三章", "第四章"}, 
	{ "第一章", "第二章", "第三章", "第四章" } 
	}; 
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	 requestWindowFeature(Window.FEATURE_NO_TITLE); 
     setContentView(R.layout.activity_jtx);
     init();
}
public void init(){
	topbutton=(ImageView)findViewById(R.id.topButton);
	topbutton.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			JtxActivity.this.finish();
		}
	});
	adapter=new TreeViewAdapter(this,TreeViewAdapter.PaddingLeft>>1); 
	expandableList=(ExpandableListView)findViewById(R.id.expandableListView1);
	adapter.RemoveAll(); 
	adapter.notifyDataSetChanged(); 
	List<TreeViewAdapter.TreeNode> treeNode = adapter.GetTreeNode(); 
	for(int i=0;i<groups.length;i++) 
	{ 
	TreeViewAdapter.TreeNode node=new TreeViewAdapter.TreeNode(); 
	node.parent=groups[i]; 
	for(int ii=0;ii<child[i].length;ii++) 
	{ 
	node.childs.add(child[i][ii]); 
	} 
	treeNode.add(node); 
	} 

	adapter.UpdateTreeNode(treeNode); 
	expandableList.setAdapter(adapter); 
	expandableList.setOnChildClickListener(new OnChildClickListener(){ 
	@Override 
	public boolean onChildClick(ExpandableListView arg0, View arg1, 
	int parent, int children, long arg4) { 

	String str="parent id:"+String.valueOf(parent)+",children id:"+String.valueOf(children); 
    Toast.makeText(JtxActivity.this, str, Toast.LENGTH_SHORT).show();
    Intent in =new Intent();
    in.setClass(JtxActivity.this, TkActivity.class);
    startActivity(in);
	return false; 
	} 
	}); 
	
	} 


@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}
}
