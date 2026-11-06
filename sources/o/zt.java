package o;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class zt extends au {
    @Override // o.au
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // o.au
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
