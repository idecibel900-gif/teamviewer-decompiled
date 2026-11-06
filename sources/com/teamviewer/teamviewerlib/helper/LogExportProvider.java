package com.teamviewer.teamviewerlib.helper;

import androidx.core.content.FileProvider;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class LogExportProvider extends FileProvider {
    public LogExportProvider() {
        super(R.xml.tv_exportedpaths);
    }
}
