package com.planner.builder;

import com.planner.model.AestheticPlanner;
import java.util.ArrayList;
import java.util.List;

public class CozyPlannerBuilder implements PlannerBuilder {
    private static final int MAX_STICKERS_PER_PAGE = 5;

    private String pageTheme = "Cozy Beige";
    private String layoutGrid;
    private final List<String> trackers = new ArrayList<>();
    private final List<String> stickers = new ArrayList<>();
    private boolean includesQuoteCard = false;

    @Override
    public PlannerBuilder setTheme(String theme) {
        this.pageTheme = theme;
        return this;
    }

    @Override
    public PlannerBuilder setLayoutGrid(String grid) {
        this.layoutGrid = grid;
        return this;
    }

    @Override
    public PlannerBuilder addTracker(String trackerName) {
        this.trackers.add(trackerName);
        return this;
    }

    @Override
    public PlannerBuilder addSticker(String stickerDesign) {
        if (this.stickers.size() >= MAX_STICKERS_PER_PAGE) {
            throw new IllegalArgumentException("Page overload: Maximum 5 stickers allowed per spread!");
        }
        this.stickers.add(stickerDesign);
        return this;
    }

    @Override
    public PlannerBuilder enableQuoteCard(boolean enable) {
        this.includesQuoteCard = enable;
        return this;
    }

    @Override
    public AestheticPlanner build() {
        validateState();
        return new AestheticPlanner(pageTheme, layoutGrid, trackers, stickers, includesQuoteCard);
    }

    private void validateState() {
        if (layoutGrid == null || layoutGrid.trim().isEmpty()) {
            throw new IllegalStateException("Planner spread must have a defined layout grid.");
        }
        if (trackers.isEmpty() && stickers.isEmpty()) {
            throw new IllegalStateException("An aesthetic spread cannot be empty!");
        }
    }
}

