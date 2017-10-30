/*
 * Copyright (C) 2016 Google Inc.
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

package com.example.android.materialme;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;

/**
 * Data model for each row of the RecyclerView.
 */
class Sport {

    //Member variables representing the title and information about the sport
    private String title;
    private String info;
    private final int imageResource;

    static final String TITLE_KEY = "Title";

    static final String IMAGE_KEY = "Image Resource";

    /**
     * Constructor for the Sport data model
     * @param title The name if the sport.
     * @param info Information about the sport.
     * @param imageResource
     */
    Sport(String title, String info, int imageResource) {
        this.title = title;
        this.info = info;
        this.imageResource = imageResource;
    }

    /**
     * Gets the title of the sport
     * @return The title of the sport.
     */
    String getTitle() {
        return title;
    }
    /**
     * Gets the info about the sport
     * @return The info about the sport.
     */
    String getInfo() {
        return info;
    }

    public int getImageResource() {
        return imageResource;
    }

    static Intent starter(Context context, String title, @DrawableRes int imageResId){
        Intent detailIntent = new Intent(context, DetailActivity.class);
        detailIntent.putExtra(TITLE_KEY, title);
        detailIntent.putExtra(IMAGE_KEY, imageResId);
        return detailIntent;
    }


}
