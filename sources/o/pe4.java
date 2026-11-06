package o;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pe4 implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        file.getClass();
        return qe4.a.matcher(file.getName()).matches() && file.exists();
    }
}
