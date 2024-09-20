package com.rusefi.maintenance.jobs;

import com.rusefi.core.FindFileHelper;
import com.rusefi.io.UpdateOperationCallbacks;
import com.rusefi.maintenance.StLinkFlasher;

import javax.swing.*;

public class StLinkJob extends AsyncJobWithContext<ParentComponentContext> {

    public StLinkJob(final JComponent parent) {
        super("", new ParentComponentContext(parent));
    }

    @Override
    public void doJob(final UpdateOperationCallbacks callbacks) {
        // todo: add ST-LINK no-assert mode? or not?
        StLinkFlasher.doUpdateFirmware(FindFileHelper.FIRMWARE_BIN_FILE, context.getParent());
    }
}
