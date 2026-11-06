package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class ki2 {
    public final Integer a;
    public final boolean b;

    public ki2(boolean z) {
        this.a = Integer.valueOf(z ? R.string.feedback_textfield_support_text_count : R.string.feedback_textfield_support_text_error);
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ki2) && this.b == ((ki2) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return "CommentSupportingText(isValid=" + this.b + ")";
    }
}
