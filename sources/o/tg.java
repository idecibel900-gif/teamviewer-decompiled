package o;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lo/tg;", "Lo/ls4;", "Lo/pg;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class tg extends ls4 {
    public final /* synthetic */ AndroidComposeView b;

    public tg(AndroidComposeView androidComposeView) {
        this.b = androidComposeView;
    }

    @Override // o.ls4
    public final es4 create() {
        return new pg(this.b);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
