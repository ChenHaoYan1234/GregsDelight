package bootmgr.gregsdelight.data;

import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.gui.GuiTextures;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.common.data.GTSoundEntries;

import com.lowdragmc.lowdraglib.gui.texture.ProgressTexture;

import bootmgr.gregsdelight.GregsDelight;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.register;

public class GregsDelightRecipeTypes {

    public static final GTRecipeType INGREDIENT_CUTTER_RECIPES = register("ingredient_cutter", GregsDelight.MOD_ID)
            .setMaxIOSize(1, 2, 0, 0)
            .setEUIO(IO.IN)
            .setProgressBar(GuiTextures.PROGRESS_BAR_SLICE, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.CUT);

    public static void init() {}
}
