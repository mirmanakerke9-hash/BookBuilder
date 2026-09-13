package com.planner;

import com.planner.builder.CozyPlannerBuilder;
import com.planner.builder.PlannerBuilder;
import com.planner.director.PlannerDirector;
import com.planner.model.AestheticPlanner;

public class Main {
    public static void main(String[] args) {
        PlannerDirector director = new PlannerDirector();


        PlannerBuilder customBuilder = new CozyPlannerBuilder();
        AestheticPlanner customSpread = customBuilder
                .setTheme("Midnight Lavender")
                .setLayoutGrid("Grid Paper")
                .addTracker("Daily Gratitude")
                .addSticker("Moon & Stars")
                .build();

        System.out.println(customSpread);


        PlannerBuilder studyBuilder = new CozyPlannerBuilder();
        AestheticPlanner studySpread = director.constructStudyMinimalist(studyBuilder);

        System.out.println(studySpread);
    }
}