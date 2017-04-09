package com.example.controller;

import com.example.event.MainAction;
import com.example.gui.MusicUtils;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MusicListPageController implements Controller{
	@FXML
	private AnchorPane AnchorPane_MusicListPage;//底层paneid
	
	@FXML
	private ScrollPane ScrollPane_totalPage;//整个歌单滚动页面id
	
	@FXML
	private AnchorPane AnchorPane_topPage;//上部分页面id
	
	@FXML
	private ImageView ImageView_ListCover;//歌单封面id
	
	@FXML
	private VBox VBox_MusicListPage;//纵向排序控件
	
	@FXML
	private Label Label_ListName;//歌单名字
	
	@FXML
	private Button Button_PlayAll;//“播放全部”按钮id
	
	@FXML
	private Button Button_searchMusic;//“搜索音乐”按钮id
	
	@FXML
	private TextField TextField_searchListMusic;//“搜索音乐”文本框id
	
	@FXML
	private Label Label_ListCreateTime;//歌单创建时间id
	
	@FXML
	private Label Label_ListIntroduction;//歌单简介id
	
	@FXML
	private AnchorPane AnchorPane_bottomPage;//下部分页面id
	
	@FXML
	private TableView<MusicUtils> TableView_musicTable;//歌表id
	
	@FXML
	private TableColumn<MusicUtils, String> TableColumn_musicID;//id列id

	@FXML
	private TableColumn<MusicUtils, Button> TableColumn_like;//“喜欢”按钮列id

	@FXML
	private TableColumn<MusicUtils, String> TableColumn_musicTitle;//音乐标题列id

	@FXML
	private TableColumn<MusicUtils, String> TableColumn_musicSinger;//歌手列id

	@FXML
	private TableColumn<MusicUtils, String> TableColumn_albumName;//专辑列id

	@FXML
	private TableColumn<MusicUtils, String> TableColumn_musicTimeLength;//时长列id
	
	
	public AnchorPane getAnchorPane_MusicListPage() {
		return AnchorPane_MusicListPage;
	}

	public ScrollPane getScrollPane_totalPage() {
		return ScrollPane_totalPage;
	}

	public AnchorPane getAnchorPane_topPage() {
		return AnchorPane_topPage;
	}

	public ImageView getImageView_ListCover() {
		return ImageView_ListCover;
	}

	public VBox getVBox_MusicListPage() {
		return VBox_MusicListPage;
	}

	public Label getLabel_ListName() {
		return Label_ListName;
	}

	public Button getButton_PlayAll() {
		return Button_PlayAll;
	}

	public Button getButton_searchMusic() {
		return Button_searchMusic;
	}

	public TextField getTextField_searchListMusic() {
		return TextField_searchListMusic;
	}

	public Label getLabel_ListCreateTime() {
		return Label_ListCreateTime;
	}

	public Label getLabel_ListIntroduction() {
		return Label_ListIntroduction;
	}

	public AnchorPane getAnchorPane_bottomPage() {
		return AnchorPane_bottomPage;
	}

	public TableView<MusicUtils> getTableView_musicTable() {
		return TableView_musicTable;
	}

	public TableColumn<MusicUtils, String> getTableColumn_musicID() {
		return TableColumn_musicID;
	}

	public TableColumn<MusicUtils, Button> getTableColumn_like() {
		return TableColumn_like;
	}

	public TableColumn<MusicUtils, String> getTableColumn_musicTitle() {
		return TableColumn_musicTitle;
	}

	public TableColumn<MusicUtils, String> getTableColumn_musicSinger() {
		return TableColumn_musicSinger;
	}

	public TableColumn<MusicUtils, String> getTableColumn_albumName() {
		return TableColumn_albumName;
	}

	public TableColumn<MusicUtils, String> getTableColumn_musicTimeLength() {
		return TableColumn_musicTimeLength;
	}
	
	

	@FXML
	private void onPlayAll(ActionEvent event){//“播放全部”按钮id
		
	}
	
	public void initData(MainAction ma, String name, String date){//初始化方法，待实现
		setCss();
		this.ma = ma;
		Label_ListName.setText(name);
		Label_ListCreateTime.setText(date);
	}
	
	public void onSearchMusic(ActionEvent event){//“查找音乐”按钮id
		
	}
	
	private void setCss(){
		TableView_musicTable.getSelectionModel().setSelectionMode(javafx.scene.control.SelectionMode.MULTIPLE);
				
		Label_ListName.getStyleClass().add("lightLabel");
		Label_ListCreateTime.getStyleClass().add("lightLabel");
		Label_ListIntroduction.getStyleClass().add("lightLabel");
		ImageView_ListCover.setImage(new Image("com/example/css/musiclist/Favorite.png"));
		
		TableColumn_musicID.getStyleClass().add("tableColumn");
		TableColumn_like.getStyleClass().add("tableColumn");
		TableColumn_musicTitle.getStyleClass().add("tableColumn");
		TableColumn_musicSinger.getStyleClass().add("tableColumn");
		TableColumn_albumName.getStyleClass().add("tableColumn");
		TableColumn_musicTimeLength.getStyleClass().add("tableColumn");
		
		Button_PlayAll.getStyleClass().set(0, "lightButton");
		Button_searchMusic.getStyleClass().remove(0);
		
		TextField_searchListMusic.getStyleClass().add("ListField");
	}
	
	private MainAction ma;
}
