package net.rcode.npedit;

import java.awt.image.BufferedImage;

/**
 * Set all the 9patch border
 *
 */
public class SetAllClearEditCommand extends ClearEditCommand {

    @Override
    public void performEdit(EditContext context, NinePatchImage npi) 
            throws Exception {
        super.performEdit(context, npi);
        BufferedImage img = npi.image;
        int black = 0xff000000;
        int h = img.getHeight();
        int w = img.getWidth();
        for (int x = 1; x < w - 1; x++) {
            img.setRGB(x, 0, black);
            img.setRGB(x, h - 1, black);
        }

        for (int y = 1; y < h - 1; y++) {
            img.setRGB(0, y, black);
            img.setRGB(w - 1, y, black);
        }
    }

    public String toString() {
        return "Set all 9 patch border area to black";
    }

}
