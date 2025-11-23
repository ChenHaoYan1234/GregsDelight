package bootmgr.gregsdelight.common.machine;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;

import bootmgr.gregsdelight.data.GregsDelightRecipeTypes;

import static bootmgr.gregsdelight.common.machine.GregsDelightMachineUtils.registerSimpleMachines;

public class GregsDelightMachines {

    public static final MachineDefinition[] INGREDIENT_CUTTER = registerSimpleMachines("ingredient_cutter",
            GregsDelightRecipeTypes.INGREDIENT_CUTTER_RECIPES, tier -> 0, false, "Ingredient Cutter",
            GTValues.tiersBetween(GTValues.LV, GTValues.IV));

    public static void init() {}
}
