package com.planner.model;

import java.util.List;

public class AestheticPlanner {
    private final String pageTheme;
    private final String layoutGrid;
    private final List<String> trackers;
    private final List<String> stickers;
    private final boolean includesQuoteCard;

    public AestheticPlanner(String pageTheme, String layoutGrid, List<String> trackers,
                            List<String> stickers, boolean includesQuoteCard) {
        this.pageTheme = pageTheme;
        this.layoutGrid = layoutGrid;
        this.trackers = trackers;
        this.stickers = stickers;
        this.includesQuoteCard = includesQuoteCard;
    }

    @Override
    public String toString() {
        return "=== Cozy Planner Spread ===" +
                "\nTheme: " + pageTheme +
                "\nGrid: " + layoutGrid +
                "\nTrackers: " + trackers +
                "\nStickers: " + stickers +
                "\nInspirational Quote: " + (includesQuoteCard ? "Yes" : "No") + "\n";
    }
}
