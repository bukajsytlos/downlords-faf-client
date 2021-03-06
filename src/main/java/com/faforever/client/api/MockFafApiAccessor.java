package com.faforever.client.api;

import com.faforever.client.coop.CoopMission;
import com.faforever.client.io.ByteCountListener;
import com.faforever.client.leaderboard.Ranked1v1EntryBean;
import com.faforever.client.map.MapBean;
import com.faforever.client.mod.FeaturedModBean;
import com.faforever.client.mod.Mod;
import com.faforever.client.replay.Replay;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Lazy
@Component
@Profile("local")
// NOSONAR
public class MockFafApiAccessor implements FafApiAccessor {

  @Override
  public List<PlayerAchievement> getPlayerAchievements(int playerId) {
    return Collections.emptyList();
  }

  @Override
  public List<PlayerEvent> getPlayerEvents(int playerId) {
    return null;
  }

  @Override
  public List<AchievementDefinition> getAchievementDefinitions() {
    return Collections.emptyList();
  }

  @Override
  public AchievementDefinition getAchievementDefinition(String achievementId) {
    AchievementDefinition achievementDefinition = new AchievementDefinition();
    achievementDefinition.setName("Mock achievement");
    achievementDefinition.setDescription("Congratulations! You read this text.");
    achievementDefinition.setType(AchievementType.STANDARD);
    return achievementDefinition;
  }

  @Override
  public void authorize(int playerId, String username, String password) {

  }

  @Override
  public List<Mod> getMods() {
    return Arrays.asList(
        Mod.fromModInfo(new com.faforever.client.api.Mod("1-1-1", "Mod Number One", "Mod description Apple", "Mock", LocalDateTime.now())),
        Mod.fromModInfo(new com.faforever.client.api.Mod("2-2-2", "Mod Number Two", "Mod description Banana", "Mock", LocalDateTime.now())),
        Mod.fromModInfo(new com.faforever.client.api.Mod("3-3-3", "Mod Number Three", "Mod description Citrus", "Mock", LocalDateTime.now())),
        Mod.fromModInfo(new com.faforever.client.api.Mod("4-4-4", "Mod Number Four", "Mod description Date", "Mock", LocalDateTime.now())),
        Mod.fromModInfo(new com.faforever.client.api.Mod("5-5-5", "Mod Number Five", "Mod description Elderberry", "Mock", LocalDateTime.now())),
        Mod.fromModInfo(new com.faforever.client.api.Mod("6-6-6", "Mod Number Six", "Mod description Fig", "Mock", LocalDateTime.now())),
        Mod.fromModInfo(new com.faforever.client.api.Mod("7-7-7", "Mod Number Seven", "Mod description Garlic", "Mock", LocalDateTime.now())),
        Mod.fromModInfo(new com.faforever.client.api.Mod("8-8-8", "Mod Number Eight", "Mod description Haricot bean", "Mock", LocalDateTime.now()))
    );
  }

  @Override
  public List<FeaturedMod> getFeaturedMods() {
    FeaturedMod featuredMod = new FeaturedMod();
    featuredMod.setDisplayName("Forged Alliance Forever");
    featuredMod.setTechnicalName("faf");
    featuredMod.setVisible(true);
    featuredMod.setDescription("Description");

    return Collections.singletonList(featuredMod);
  }

  @Override
  public MapBean findMapByName(String mapId) {
    return null;
  }

  @Override
  public List<Ranked1v1EntryBean> getLeaderboardEntries(RatingType ratingType) {
    return null;
  }

  @Override
  public Ranked1v1Stats getRanked1v1Stats() {
    return null;
  }

  @Override
  public Ranked1v1EntryBean getRanked1v1EntryForPlayer(int playerId) {
    return null;
  }

  @Override
  public History getRatingHistory(RatingType ratingType, int playerId) {
    return new History();
  }

  @Override
  public List<MapBean> getMaps() {
    return Collections.emptyList();
  }

  @Override
  public List<MapBean> getMostDownloadedMaps(int count) {
    return null;
  }

  @Override
  public List<MapBean> getMostPlayedMaps(int count) {
    return null;
  }

  @Override
  public List<MapBean> getBestRatedMaps(int count) {
    return null;
  }

  @Override
  public List<MapBean> getNewestMaps(int count) {
    return null;
  }

  @Override
  public void uploadMod(Path file, ByteCountListener listener) {

  }

  @Override
  public void uploadMap(Path file, boolean isRanked, ByteCountListener listener) {

  }

  @Override
  public Mod getMod(String uid) {
    return null;
  }

  @Override
  public List<FeaturedModFile> getFeaturedModFiles(FeaturedModBean featuredModBean, Integer version) {
    return null;
  }

  @Override
  public List<Replay> searchReplayByPlayer(String playerName) {
    return null;
  }

  @Override
  public List<Replay> searchReplayByMap(String mapName) {
    return null;
  }

  @Override
  public List<Replay> searchReplayByMod(FeaturedMod featuredMod) {
    return null;
  }

  @Override
  public List<Replay> getNewestReplays(int count) {
    return null;
  }

  @Override
  public List<Replay> getHighestRatedReplays(int count) {
    return null;
  }

  @Override
  public List<Replay> getMostWatchedReplays(int count) {
    return null;
  }

  @Override
  public void changePassword(String username, String currentPasswordHash, String newPasswordHash) {

  }

  @Override
  public List<CoopMission> getCoopMissions() {
    return Collections.emptyList();
  }

  @Override
  public List<CoopLeaderboardEntry> getCoopLeaderboard(String missionId, int numberOfPlayers) {
    return Collections.emptyList();
  }

}
