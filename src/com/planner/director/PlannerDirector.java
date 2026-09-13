package com.planner.director;

import com.planner.builder.PlannerBuilder;
import com.planner.model.AestheticPlanner;

public class PlannerDirector {

    public AestheticPlanner constructStudyMinimalist(PlannerBuilder builder) {
        return builder.setTheme("Soft Sage Minimal")
                .setLayoutGrid("Dotted Grid")
                .addTracker("Exam Countdown")
                .addTracker("Assignment Checklist")
                .addSticker("Coffee Cup Icon")
                .enableQuoteCard(true)
                .build();
    }

    public AestheticPlanner constructCozyHabitSpread(PlannerBuilder builder) {
        return builder.setTheme("Warm Vanilla & Pastels")
                .setLayoutGrid("Dot Journal")
                .addTracker("Mood Tracker (Flora)")
                .addTracker("Sleep & Water Log")
                .addSticker("Pressed Flowers")
                .build();
    }
}