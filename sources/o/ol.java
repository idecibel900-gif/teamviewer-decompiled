package o;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class ol {
    public final /* synthetic */ byte a;

    public /* synthetic */ ol(byte b) {
        this.a = b;
    }

    public final x98 a(Object obj, za5 za5Var) {
        switch (this.a) {
            case 0:
                return v67.s(((Uri) obj).toString());
            case 1:
                return v67.e(((File) obj).getPath());
            case 2:
                return v67.e(((wg5) obj).m.s());
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = za5Var.a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return v67.s("android.resource://" + context.getPackageName() + "/" + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            default:
                return v67.s((String) obj);
        }
    }
}
