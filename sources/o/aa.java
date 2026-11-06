package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class aa {
    public final Integer a;
    public final boolean b;
    public final boolean c;

    public aa(boolean z, boolean z2) {
        this.a = Integer.valueOf(z2 ? R.string.group_dialog_support_text_count_whitespace_error : z ? R.string.group_dialog_support_text_count : R.string.group_dialog_support_text_count_error);
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return this.b == aaVar.b && this.c == aaVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "CounterSupportingText(isValid=" + this.b + ", isWhiteSpace=" + this.c + ")";
    }
}
