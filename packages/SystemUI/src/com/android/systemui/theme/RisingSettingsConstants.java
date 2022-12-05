/*
 * Copyright (C) 2023-2024 The RisingOS Android Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.systemui.theme;

import android.provider.Settings;

public class RisingSettingsConstants {
    private static final String PREF_CHROMA_FACTOR ="monet_engine_chroma_factor";
    private static final String PREF_LUMINANCE_FACTOR ="monet_engine_luminance_factor";
    private static final String PREF_TINT_BACKGROUND ="monet_engine_tint_background";
    private static final String PREF_CUSTOM_ACCENT_COLOR ="monet_engine_accent_color";
    private static final String PREF_CUSTOM_BG_COLOR ="monet_engine_bg_color";
    private static final String PREF_OVERRIDE_COLOR_ACCENT ="monet_engine_color_override_accent";
    private static final String PREF_OVERRIDE_BGCOLOR ="monet_engine_override_bg_color";
    private static final String PREF_THEME_STYLE = "monet_engine_theme_style";
    private static final String PREF_COLOR_SOURCE = "monet_engine_color_source";
    private static final String PREF_WHOLE_PALETTE = "monet_engine_whole_palette";
    public static final String CLOCK_STYLE = "clock_style";
    public static final String VOLUME_STYLE = "custom_volume_styles";
    public static final String QS_PANEL_TILE_HAPTIC = "qs_panel_tile_haptic";

    private static final String OVERLAY_CATEGORY_ACCENT_COLOR =
            "android.theme.customization.accent_color";
    private static final String OVERLAY_CATEGORY_SYSTEM_PALETTE =
            "android.theme.customization.system_palette";
    private static final String OVERLAY_CATEGORY_THEME_STYLE =
            "android.theme.customization.theme_style";
    private static final String OVERLAY_CATEGORY_BG_COLOR =
            "android.theme.customization.bg_color";
    private static final String OVERLAY_COLOR_SOURCE =
            "android.theme.customization.color_source";
    private static final String OVERLAY_COLOR_BOTH =
            "android.theme.customization.color_both";
    private static final String OVERLAY_LUMINANCE_FACTOR =
            "android.theme.customization.luminance_factor";
    private static final String OVERLAY_CHROMA_FACTOR =
            "android.theme.customization.chroma_factor";
    private static final String OVERLAY_WHOLE_PALETTE =
            "android.theme.customization.whole_palette";
    private static final String OVERLAY_TINT_BACKGROUND =
            "android.theme.customization.tint_background";
    private static final String COLOR_SOURCE_PRESET = "preset";
    private static final String COLOR_SOURCE_HOME = "home_wallpaper";
    private static final String COLOR_SOURCE_LOCK = "lock_wallpaper";
    private static final String TIMESTAMP_FIELD = "_applied_timestamp";

    private static final String PREF_THEME_STYLE = "theme_style";
    private static final String PREF_COLOR_SOURCE = "color_source";
    private static final String PREF_ACCENT_COLOR = "accent_color";
    private static final String PREF_ACCENT_BACKGROUND = "accent_background";
    private static final String PREF_BG_COLOR = "bg_color";
    private static final String PREF_LUMINANCE_FACTOR = "luminance_factor";
    private static final String PREF_CHROMA_FACTOR = "chroma_factor";
    private static final String PREF_WHOLE_PALETTE = "whole_palette";
    private static final String PREF_TINT_BACKGROUND = "tint_background";

    public static final String[] SYSTEM_SETTINGS_KEYS = {
        QS_PANEL_TILE_HAPTIC,
        OVERLAY_CATEGORY_ACCENT_COLOR,
        OVERLAY_CATEGORY_SYSTEM_PALETTE,
        OVERLAY_CATEGORY_THEME_STYLE,
        OVERLAY_CATEGORY_BG_COLOR,
        OVERLAY_COLOR_SOURCE,
        OVERLAY_COLOR_BOTH,
        OVERLAY_LUMINANCE_FACTOR,
        OVERLAY_CHROMA_FACTOR,
        OVERLAY_WHOLE_PALETTE,
        OVERLAY_TINT_BACKGROUND,
        COLOR_SOURCE_PRESET,
        COLOR_SOURCE_HOME,
        COLOR_SOURCE_LOCK,
        TIMESTAMP_FIELD,
        PREF_THEME_STYLE,
        PREF_COLOR_SOURCE,
        PREF_ACCENT_COLOR,
        PREF_ACCENT_BACKGROUND,
        PREF_BG_COLOR,
        PREF_LUMINANCE_FACTOR,
        PREF_CHROMA_FACTOR,
        PREF_WHOLE_PALETTE,
        PREF_TINT_BACKGROUND
    };
    
    public static final String[] SECURE_SETTINGS_KEYS = {
        CLOCK_STYLE,
        PREF_CHROMA_FACTOR,
        PREF_LUMINANCE_FACTOR,
        PREF_TINT_BACKGROUND,
        PREF_CUSTOM_ACCENT_COLOR,
        PREF_CUSTOM_BG_COLOR,
        PREF_OVERRIDE_COLOR_ACCENT,
        PREF_OVERRIDE_BGCOLOR,
        PREF_THEME_STYLE,
        PREF_COLOR_SOURCE,
        PREF_WHOLE_PALETTE
    };
    
    public static final String[] SYSTEM_SETTINGS_NOTIFY_ONLY_KEYS = {
        VOLUME_STYLE,
        PREF_CHROMA_FACTOR,
        PREF_LUMINANCE_FACTOR,
        PREF_TINT_BACKGROUND,
        PREF_CUSTOM_ACCENT_COLOR,
        PREF_CUSTOM_BG_COLOR,
        PREF_OVERRIDE_COLOR_ACCENT,
        PREF_OVERRIDE_BGCOLOR,
        PREF_THEME_STYLE,
        PREF_COLOR_SOURCE,
        PREF_WHOLE_PALETTE
    };
    
    public static final String[] SECURE_SETTINGS_NOTIFY_ONLY_KEYS = {
        PREF_CHROMA_FACTOR,
        PREF_LUMINANCE_FACTOR,
        PREF_TINT_BACKGROUND,
        PREF_CUSTOM_ACCENT_COLOR,
        PREF_CUSTOM_BG_COLOR,
        PREF_OVERRIDE_COLOR_ACCENT,
        PREF_OVERRIDE_BGCOLOR,
        PREF_THEME_STYLE,
        PREF_COLOR_SOURCE,
        PREF_WHOLE_PALETTE
    };
}
