package businesslogicservice.player;

import java.util.ArrayList;

import common.statics.DataKind;
import common.statics.Field;
import common.statics.GameKind;
import common.statics.Season;
import beans.GamePlayer;
import beans.GeneralPlayer;
import beans.SeasonPlayer;

public interface OnePlayerBlService {
	// 获得球员的基本信息season,age是为了处理同名的球员
	public GeneralPlayer getGeneralPlayer(String playerId);

	// 球员编号，根据比赛类型,数据类型获得球员赛季比赛数据
	public ArrayList<SeasonPlayer> getSeasonPlayer(String playerId, GameKind gameKind, DataKind dataKind, Field sortField);

	// 根据赛季、球员编号得到所有比赛信息
	public ArrayList<GamePlayer> getGamePlayer(String playerId, Season season, GameKind gameKind, Field sortField);

	// 得到该球员的常规赛/季后赛所有赛季
	public String[] getSeasonsOfPlayer(String playerId, GameKind gameKind);
}
