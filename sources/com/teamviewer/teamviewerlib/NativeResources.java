package com.teamviewer.teamviewerlib;

import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0082 ¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/teamviewer/teamviewerlib/NativeResources;", "", "", "languageCode", "countryCode", "Lo/f88;", "jniUpdateNativeResources", "(Ljava/lang/String;Ljava/lang/String;)V", "TeamViewerLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class NativeResources {
    public static final NativeResources a = new NativeResources();

    private final native void jniUpdateNativeResources(String languageCode, String countryCode);

    public final void a(Locale locale) {
        if (NativeLibTvExt.c()) {
            jniUpdateNativeResources(locale.getLanguage(), locale.getCountry());
        }
    }
}
