package com.planner.builder;

import com.planner.model.AestheticPlanner;

public interface PlannerBuilder {
    PlannerBuilder setTheme(String theme);
    PlannerBuilder setLayoutGrid(String grid);
    PlannerBuilder addTracker(String trackerName);
    PlannerBuilder addSticker(String stickerDesign);
    PlannerBuilder enableQuoteCard(boolean enable);
    AestheticPlanner build();
}