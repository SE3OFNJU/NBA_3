package businesslogicservice.team;

import java.util.ArrayList;

import beans.GameTeam;
import beans.SeasonPlayer;
import beans.SeasonTeam;
import common.statics.DataKind;
import common.statics.Field;
import common.statics.GameKind;
import common.statics.Season;

public interface OneTeamBlService {
	// 根据球队名称和赛季得到该赛季球队所有球员数据
	public ArrayList<SeasonPlayer> getOneSeasonPlayers(String teamName, Season season, GameKind gameKind, DataKind dataKind, Field sortField);

	// 根据球队名称得到最近一个赛季球队所有球员常规赛的场均数据
	public ArrayList<SeasonPlayer> getLatestSeasonPlayers(String teamName);

	// 根据球队名称得到球队所有赛季数据
	public ArrayList<SeasonTeam> getSeasonTeam(String teamName, GameKind gameKind, DataKind dataKind, Field sortField);

	// 得到球队一个赛季里的所有比赛详细数据
	public ArrayList<GameTeam> getGameTeam(String teamName, Season season, Field sortField);

	// 得到球队最近一个赛季的所有比赛详细数据
	public ArrayList<GameTeam> getLatestGameTeam(String teamName);
}
