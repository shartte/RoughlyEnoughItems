/*
 * This file is licensed under the MIT License, part of Roughly Enough Items.
 * Copyright (c) 2018, 2019, 2020 shedaniel
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package me.shedaniel.rei.gui.widget;

import me.shedaniel.math.api.Rectangle;
import me.shedaniel.rei.api.ConfigObject;
import org.jetbrains.annotations.ApiStatus;

/**
 * @see me.shedaniel.rei.api.widgets.Widgets#createRecipeBase(me.shedaniel.math.Rectangle)
 * @see me.shedaniel.rei.api.widgets.Widgets#createRecipeBase(me.shedaniel.math.Rectangle, int)
 */
@Deprecated
@ApiStatus.ScheduledForRemoval
public class RecipeBaseWidget extends PanelWidget {
    
    /**
     * Creates a recipe base drawable
     *
     * @param bounds the bounds of the base
     * @see me.shedaniel.rei.api.widgets.Widgets#createRecipeBase(me.shedaniel.math.Rectangle)
     * @see me.shedaniel.rei.api.widgets.Widgets#createRecipeBase(me.shedaniel.math.Rectangle, int)
     */
    @ApiStatus.Internal
    @Deprecated
    public RecipeBaseWidget(Rectangle bounds) {
        super(bounds);
    }
    
    @Override
    protected int getYTextureOffset() {
        return ConfigObject.getInstance().getRecipeBorderType().getYOffset();
    }
    
    @Override
    protected boolean isRendering() {
        return super.isRendering() && ConfigObject.getInstance().getRecipeBorderType().isRendering();
    }
}
