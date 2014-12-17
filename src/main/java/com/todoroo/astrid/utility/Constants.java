/**
 * Copyright (c) 2012 Todoroo Inc
 *
 * See the file "LICENSE" for the full license governing this code.
 */
package com.todoroo.astrid.utility;

import com.todoroo.astrid.service.MarketStrategy;

public final class Constants {

    // --- general application constants

    /**
     * Application Package
     */
    public static final String PACKAGE = "org.tasks";

    /**
     * Market selection strategy
     */
    public static final MarketStrategy MARKET_STRATEGY = new MarketStrategy.AndroidMarketStrategy();

    // --- task list activity source strings

    public static final int SOURCE_OTHER = -1;
    public static final int SOURCE_DEFAULT = 0;
    public static final int SOURCE_NOTIFICATION = 1;
    public static final int SOURCE_WIDGET = 2;
    public static final int SOURCE_PPWIDGET = 3;
    public static final int SOURCE_C2DM = 4;

    // --- notification id's

    /** Notification Manager id for timing */
    public static final int NOTIFICATION_TIMER = -2;
}
