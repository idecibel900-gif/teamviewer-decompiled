package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class w64 {
    public final Integer a;
    public final boolean b;

    public w64(boolean z) {
        this.a = Integer.valueOf(z ? R.string.legal_agreement_continue_button_text : R.string.legal_agreement_button_text);
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w64) && this.b == ((w64) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return "ContinueButtonText(isKorean=" + this.b + ")";
    }
}
